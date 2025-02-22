@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.versions)
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.kotlinKapt) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.androidApplication) apply false
}

tasks.register("clean").configure {
    delete("build")
}
