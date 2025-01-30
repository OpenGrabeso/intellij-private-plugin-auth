# Private GitHub Marketplace Auth plugin for IntelliJ

![Build](https://github.com/OpenGrabeso/intellij-private-plugin-auth/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/26328.svg)](https://plugins.jetbrains.com/plugin/26328)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/26328.svg)](https://plugins.jetbrains.com/plugin/26328)

<!-- Plugin description -->
Authenticate any custom plugin repositories using GitHub authentication.
To configure, open **Settings / Preferences** and go to Version Control | GitHub.
Requires the [GitHub plugin](https://plugins.jetbrains.com/plugin/13115-github).

The plugin adds `Authentication: Bearer` headers to any custom repositories residing on github.com, allowing you to use
your GitHub repository as a private plugin marketplace. URL of such custom repository could look like:

`https://api.github.com/repos/organization/plugins/contents/updatePlugins.xml`

Security note: be carefull what custom repositories which include `github.com` you add. Any such repository will receive your GitHub token.

<!-- Plugin description end -->

## Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Private GitHub Marketplace Auth"</kbd> >
  <kbd>Install</kbd>
  
- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/26328) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/26328/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/OpenGrabeso/intellij-private-plugin-auth/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
