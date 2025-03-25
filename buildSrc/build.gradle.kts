plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
}

gradlePlugin {
    plugins {
        register("MagiskPlugin") {
            id = "MagiskPlugin"
            implementationClass = "MagiskPlugin"
        }
    }
}

dependencies {
    implementation(embeddedKotlin("gradle-plugin"))
    implementation("com.android.tools.build:gradle:8.9.1")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.8.9")
    implementation("org.lsposed.lsparanoid:gradle-plugin:0.6.0")
    implementation("org.eclipse.jgit:org.eclipse.jgit:7.2.0.202503040940-r")
}
