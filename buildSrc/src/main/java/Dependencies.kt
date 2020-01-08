//buildSrc  ****====
object Version {
    const val kotlin = "1.3.50"
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
    const val minSdkVersion = 19
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"
}
//https://caster.io/lessons/gradle-dependency-management-using-kotlin-and-buildsrc-for-buildgradle-autocomplete-in-android-studio?autoplay=true
//https://github.com/AdamLuisSean/buildSrc
object Deps {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val appcompat = "androidx.appcompat:appcompat:1.1.0"
}