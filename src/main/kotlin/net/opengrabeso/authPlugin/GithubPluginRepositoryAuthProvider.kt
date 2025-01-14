package net.opengrabeso.authPlugin

import com.intellij.ide.plugins.auth.PluginRepositoryAuthProvider
import com.intellij.openapi.diagnostic.logger
import java.util.Base64

class GithubPluginRepositoryAuthProvider : PluginRepositoryAuthProvider {

    private val logger = logger<GithubPluginRepositoryAuthProvider>()

    private fun String.encodeBase64() = Base64.getEncoder().encodeToString(encodeToByteArray())

    override fun getAuthHeaders(url: String): Map<String, String> {
        logger.debug("Getting auth headers for $url")
        val username = "User"
        val token = "token"
        logger.debug("Username: $username, token is null? ${token == null}")
        return if (username != null && token != null) {
            val encodedValue = "Basic " + "$username:$token".encodeBase64()
            mapOf("Authorization" to encodedValue)
        } else {
            emptyMap()
        }
    }

    override fun canHandle(url: String): Boolean {
        val canHandle = !url.contains("jetbrains\\.com")
        logger.debug("Can handle $url? $canHandle")
        return canHandle
    }
}