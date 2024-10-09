plugins {
    //change it to 2.0.10 and see the errors
    kotlin("jvm") version "2.0.0"
    `java-test-fixtures`
}

repositories {
    mavenCentral()
}

dependencies {
    //implementation dependency is added to testFixturesImplementation
    //therefore, ./gradlew compileTestFixturesKotlin will work
    implementation("org.apache.commons:commons-lang3:3.12.0")
    testImplementation(kotlin("test"))

    //testFixturesImplementation dependency is added to testImplementation
    //therefore, ./gradlew compileTestKotlin will work
    testFixturesImplementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")

    //To fix, uncomment the rest 
    //testImplementation("org.jetbrains.kotlinx:kotlinx-datetime:0.6.0")
    //testFixturesImplementation("org.apache.commons:commons-lang3:3.12.0")
}

kotlin {
    jvmToolchain(21)
}
