<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# intellij-private-plugin-auth Changelog

## [Unreleased]

## [0.2.1] - 2025-01-30

### Security

- Restrict token use: add a token only to requests made against `github.com` or its subdomains

## [0.1.5] - 2025-01-15

### Added

- Implemented authentication for all GitHub.com plugin sources, using first available GitHub account (no UI)
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)

[Unreleased]: https://github.com/OpenGrabeso/intellij-private-plugin-auth/compare/v0.2.1...HEAD
[0.2.1]: https://github.com/OpenGrabeso/intellij-private-plugin-auth/compare/v0.1.5...v0.2.1
[0.1.5]: https://github.com/OpenGrabeso/intellij-private-plugin-auth/commits/v0.1.5
