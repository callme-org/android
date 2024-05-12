pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "callme"
include(":app")
includeModules("features")
includeModules("core")

fun includeModules(path: String) =
    fileTree("$rootDir/$path")
        .filter { file -> file.name.endsWith("kts") }
        .forEach { file ->
            val moduleName = ":${file.parentFile.name}"
            include(moduleName)
            project(moduleName).projectDir = file.parentFile
        }
