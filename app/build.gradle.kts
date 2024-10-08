plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.plugin)
}

android {
    namespace = "com.cometexpress.overuniverse"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.cometexpress.overuniverse"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {

        debug {
            isMinifyEnabled = false
        }

        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}

dependencies {

    // core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.constraintlayout)

    // log
    implementation(libs.logger)

    // viewModel
    implementation(libs.viewmodel)
    implementation(libs.viewmodel.savedstate)

    // hilt
    implementation(libs.hilt)
    kapt(libs.hilt.compiler)

    // rxjava
    implementation(libs.rxjava2)

    // rxAndroid
    implementation(libs.rxAndroid)

    // retrofit
    implementation(libs.retrofit)
//    implementation(libs.retrofit.converter.gson)
    implementation(libs.retrofit.converter.moshi)
    implementation(libs.retrofit.rxjava2.adapter)

    // moshi
    implementation(libs.moshi)
    implementation(libs.moshi.kotlin)
//    implementation(libs.moshi.codegen)  - hilt 적용시 충돌

    //okhttp
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging.interceptor)

    // gson
    implementation(libs.gson)

    // glide
    implementation(libs.glide)

    // room
    implementation(libs.room)
    implementation(libs.room.rxjava2)
    kapt(libs.room.compliler)

    // exoplayer
    implementation(libs.media3.exoplayer)
    implementation(libs.media3.exoplayer.dash)
    implementation(libs.media3.ui)


    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}