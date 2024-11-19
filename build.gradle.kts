plugins {
    //change it to 2.0.10 and see the errors
    kotlin("jvm") version "2.0.10"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "java-test-fixtures")

    kotlin {
        jvmToolchain(21)
    }

    repositories {
        mavenCentral()
    }
}
