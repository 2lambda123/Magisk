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
    implementation("com.android.tools.build:gradle:8.4.2")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
    implementation("org.lsposed.lsparanoid:gradle-plugin:0.6.0")
    implementation("org.eclipse.jgit:org.eclipse.jgit:6.9.0.202403050737-r")
}
