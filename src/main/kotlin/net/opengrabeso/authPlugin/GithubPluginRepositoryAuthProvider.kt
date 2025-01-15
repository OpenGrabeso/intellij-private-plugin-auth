package net.opengrabeso.authPlugin

import com.intellij.ide.plugins.auth.PluginRepositoryAuthProvider
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.diagnostic.logger
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import java.util.Base64

import org.jetbrains.plugins.github.authentication.accounts.*

class GithubPluginRepositoryAuthProvider : PluginRepositoryAuthProvider {

    private val logger = logger<GithubPluginRepositoryAuthProvider>()

    override fun getAuthHeaders(url: String): Map<String, String> {

        if (url.contains("github.com/")) {
            logger.debug("Getting auth headers for $url")

            val accountManager = ApplicationManager.getApplication().getService(GHAccountManager::class.java)

// Access the accountsState StateFlow
            val accountsState = accountManager.accountsState

            var username: String? = null
            var token: String? = null

            // Use runBlocking to collect the current state (blocking for simplicity in this example)
            runBlocking {
                val accounts = accountsState.first() // Get the first emitted value (current state of accounts)

                if (accounts.isNotEmpty()) {
                    accounts.forEach { account ->
                        // Fetch the token for each account
                        val accountToken = accountManager.findCredentials(account)

                        if (accountToken != null) {
                            username = account.name
                            token = accountToken
                        } else {
                            logger.warn("No token found for account: ${account.name}")
                        }
                    }
                } else {
                    logger.warn("No GitHub accounts found.")
                }
            }

            logger.debug("Username: $username, token is null? ${token == null}")
            return if (username != null && token != null) {
                val encodedToken = "Bearer $token"
                mapOf(
                    "Authorization" to encodedToken,
                    "Accept" to "application/vnd.github.raw+json"
                )
            } else {
                emptyMap()
            }
        } else {
            return emptyMap()
        }
    }

    override fun canHandle(url: String): Boolean {
        val canHandle = url.contains("github.com/")
        logger.debug("Can handle $url? $canHandle")
        return canHandle
    }
}