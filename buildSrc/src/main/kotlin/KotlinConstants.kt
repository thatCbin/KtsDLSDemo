//项目常量
object KotlinConstants {

    //Gradle 版本
    const val gradle_version = "4.2.1"

    //Kotlin 版本
    const val kotlin_version = "1.5.20"
}

//应用配置
object AppConfig {
    //依赖版本
    val compileSdkVersion = 30

    //编译工具版本
    val buildToolsVersion = "30.0.3"

    val defaultConfig = DefaultConfig()

    class DefaultConfig {
        //包名
        val applicationId = "com.cbin.ktsdlsdemo"

        //最小支持SDK
        val minSdkVersion = 24

        //当前基于SDK
        val targetSdkVersion = 30

        //版本编码
        val versionCode = 1

        //版本名称
        val versionName = "1.0"
    }

}

//依赖配置
object DependenciesLib {

    val coil = "io.coil-kt:coil:1.2.2"
}