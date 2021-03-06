plugins {
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroidJB)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdk = AndroidSdk.compile

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    api(Libraries.ktxCore)
    api(Libraries.kotlinStdLib)
    api(Libraries.kotlinCoroutines)
    api(Libraries.kotlinCoroutinesAndroid)
    implementation(project(mapOf("path" to ":data")))
    implementation(project(mapOf("path" to ":platform")))

}