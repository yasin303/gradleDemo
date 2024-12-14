plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.register("greetingTask") {
    doLast {
        val name = project.findProperty("nama")?.toString() ?: "Gradle User"
        println("Hello, $name! Welcome to Gradle World!")
    }
}

