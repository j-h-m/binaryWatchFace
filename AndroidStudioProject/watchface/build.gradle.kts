plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.binarywatchface"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.binarywatchface"
        minSdk = 36
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    enableKotlin = false
}

dependencies {
}