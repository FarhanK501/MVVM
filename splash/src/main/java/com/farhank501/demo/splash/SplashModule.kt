package com.farhank501.demo.splash

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface SplashModule {

	@ContributesAndroidInjector
	fun contributesSplashActivityInjector(): SplashActivity
}