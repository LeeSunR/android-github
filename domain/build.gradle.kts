plugins {
    id("kotlin")
    kotlin("kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation("androidx.paging:paging-common-ktx:3.1.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.3")
}