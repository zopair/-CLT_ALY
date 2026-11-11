pluginManagement {
    repositories {
        // Explicit Google Maven endpoint is the canonical source for AGP.
        maven(url = uri("https://dl.google.com/dl/android/maven2/"))
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
    }
}

rootProject.name = "-CLT_ALY"
include(":app")
