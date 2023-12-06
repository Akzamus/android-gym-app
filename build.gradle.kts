// Top-level build file where you can add configuration options common to all sub-projects/modules.

//buildscript{
//    ext{
//        compose_version = "1.3.2"
//        hilt_version = '2.45'
//    }
//}

plugins {
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.android.application") version "8.2.0" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
    id ("org.jetbrains.kotlin.kapt") version "1.9.21"
    id("com.google.devtools.ksp") version "1.6.21-1.0.6"

}