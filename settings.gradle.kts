plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
    includeBuild("common-publish")
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

rootProject.name = "route4k"
include(":common")
include(":ktor:client")
include(":ktor:server")
include(":ktor")