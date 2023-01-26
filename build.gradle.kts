import org.jetbrains.compose.compose
import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation("io.ktor:ktor-client-core:2.2.1")
                implementation("io.ktor:ktor-client-cio:2.2.1")
                implementation("io.coil-kt:coil:2.2.2")
                implementation("io.coil-kt:coil-compose:2.2.2")

                implementation("com.squareup.retrofit2:retrofit:2.9.0")
                implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

            }
        }
        val jvmTest by getting
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Kotlin7DaysOfCode"
            packageVersion = "1.0.0"
        }
    }
}
