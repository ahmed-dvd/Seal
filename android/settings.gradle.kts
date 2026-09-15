pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Signal libsignal repository (add when implementing crypto)
        // maven { url = uri("https://build-artifacts.signal.org/libraries/maven/") }
    }
}

rootProject.name = "PrivateMessenger"
include(":app")
