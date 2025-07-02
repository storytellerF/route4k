plugins {
    kotlin("jvm") version "2.1.21"
}

group = "com.storyteller_f.route4k"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}