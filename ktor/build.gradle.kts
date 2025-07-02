plugins {
    kotlin("jvm") version "2.1.21"
    kotlin("plugin.serialization") version "2.2.0"
}

group = "com.storyteller_f.route4k"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(project(":common"))
    testImplementation("io.ktor:ktor-server-test-host:3.1.3")
    testImplementation(project(":ktor:client"))
    testImplementation(project(":ktor:server"))
    testImplementation(kotlin("test"))
    testImplementation("io.ktor:ktor-server-content-negotiation:3.1.3")
    testImplementation("io.ktor:ktor-client-content-negotiation:3.1.3")
    testImplementation("io.ktor:ktor-serialization-kotlinx-json:3.1.3")
    testImplementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")
    testImplementation("ch.qos.logback:logback-classic:1.5.6")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
    compilerOptions {
        freeCompilerArgs.add("-Xcontext-parameters")
    }
}