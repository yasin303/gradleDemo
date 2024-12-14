plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:29.0-jre")
    testImplementation("junit:junit:4.13")
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

