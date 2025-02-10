// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }
//    dependencies {
//        val navVersion = "2.7.5"
//        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$navVersion")
//    }


        dependencies {
            classpath(libs.androidx.navigation.safe.args.gradle.plugin)
        }
}

plugins {
    id ("com.android.application") version "7.3.1" apply false
    id ("com.android.library") version "7.3.1" apply false
    id ("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("com.google.devtools.ksp") version "1.9.0-1.0.13" apply false
}