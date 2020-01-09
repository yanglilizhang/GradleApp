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
    const val junit = "junit:junit:4.12"
    const val runner = "androidx.test:runner:1.2.0"
    const val espresso_core = "androidx.test.espresso:espresso-core:3.2.0"

    // okHttp
    const val okhttp = "com.squareup.okhttp3:okhttp:3.11.0"

    // Retrofit库
    const val retrofit = "com.squareup.retrofit2:retrofit:2.4.0"
    // 衔接 Retrofit & RxJava
    const val retrofitRxjavaAdapter =
        "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:1.0.0"

    // 支持Gson解析
    const val retrofitGson = "com.squareup.retrofit2:converter-gson:2.4.0"

    // RxJava
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.0.2"
    const val rxjava = "io.reactivex.rxjava2:rxjava:2.1.14"


}