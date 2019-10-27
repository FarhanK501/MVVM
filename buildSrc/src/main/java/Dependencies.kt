import Versions.kotlin_version

@Suppress("unused", "SpellCheckingInspection")
object Dependencies {

	const val junit = "junit:junit:${Versions.junit}"
	const val testRunner = "androidx.test:runner:${Versions.testRunner}"
	const val ktCore = "androidx.core:core-ktx:${Versions.androidXVersion}"
	const val multiDex = "com.android.support:multidex:${Versions.multiDex}"
	const val ktStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
	const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
	const val appcompat = "androidx.appcompat:appcompat:${Versions.androidXVersion}"
	const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
	const val support_design = "com.google.android.material:material:${Versions.material}"

	// view models
	const val viewmodel_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.viewModelVersion}"
	const val viewmodel_extension = "androidx.lifecycle:lifecycle-extensions:${Versions.viewModelVersion}"
	const val viewmodel_core = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewmodel_coreVersion}"

	// dagger
	const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
	const val dagger_android = "com.google.dagger:dagger-android:${Versions.dagger}"
	const val dagger_compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
	const val dagger_android_support = "com.google.dagger:dagger-android-support:${Versions.dagger}"
	const val dagger_android_compiler = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

	// coroutine
	const val kotlin_coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineVersion}"
	const val kotlin_coroutine_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"

	const val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlin_version}"
	const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
	// others
	const val xJunitRunner = "androidx.test.runner.AndroidJUnitRunner"
}