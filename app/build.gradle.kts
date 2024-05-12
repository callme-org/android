plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.ougi.callme"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ougi.callme"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_21.toString()
    }
}

dependencies {

    implementProjects("core")
    implementProjects("features")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.dagger)
    ksp(libs.dagger.compiler)
}

fun DependencyHandlerScope.implementProjects(path: String) =
    fileTree("$rootDir/$path")
        .filter { file -> file.name.endsWith("kts") }
        .forEach { file -> implementation(project(":${file.parentFile.name}")) }
