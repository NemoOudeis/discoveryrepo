pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "kotlin-mp-poc"


include(":browser")
include(":shared")
include(":android")

