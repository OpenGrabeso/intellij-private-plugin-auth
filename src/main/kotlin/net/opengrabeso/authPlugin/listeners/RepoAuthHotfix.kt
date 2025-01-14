package net.opengrabeso.authPlugin.listeners

import com.intellij.ide.AppLifecycleListener
import com.intellij.ide.plugins.auth.PluginRepositoryAuthService
import com.intellij.openapi.components.service
import com.intellij.openapi.diagnostic.logger

/** Workaround for https://youtrack.jetbrains.com/issue/IDEA-315487. */
class RepoAuthHotfix : AppLifecycleListener {
    private val logger = logger<RepoAuthHotfix>()

    override fun appFrameCreated(commandLineArgs: List<String>) {
        logger.debug("Initializing ${PluginRepositoryAuthService::class.simpleName}")
        service<PluginRepositoryAuthService>()
    }
}
