plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.lq.core_common"
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
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
}

dependencies {

    api(project(mapOf("path" to ":core-logger")))
    //    val activity_version = "1.6.0"
//
//    // Java language implementation
//    api("androidx.activity:activity:$activity_version")
//    // Kotlin
//    api("androidx.activity:activity-ktx:$activity_version")
    val fragment_version = "1.5.3"
    // Java language implementation
    api("androidx.fragment:fragment:$fragment_version")
    // Kotlin
    api("androidx.fragment:fragment-ktx:$fragment_version")
    api("androidx.constraintlayout:constraintlayout:2.1.4")

    api("androidx.navigation:navigation-fragment-ktx:2.5.2")
    api("androidx.navigation:navigation-ui-ktx:2.5.2")

    // Testing Fragments in Isolation
    debugImplementation("androidx.fragment:fragment-testing:$fragment_version")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}