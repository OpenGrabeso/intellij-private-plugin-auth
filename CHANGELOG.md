<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# intellij-private-plugin-auth Changelog

## [Unreleased]

## [0.2.0] - 2025-01-30

### Security

- Restrict token use: add a token only to requests made against `github.com` or its subdomains

## [0.1.5] - 2025-01-15

### Added
- Implemented authentication for all GitHub.com plugin sources, using first available GitHub account (no UI)
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)
