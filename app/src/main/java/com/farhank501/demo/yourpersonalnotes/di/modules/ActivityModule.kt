package com.farhank501.demo.yourpersonalnotes.di.modules

import com.farhank501.demo.yourpersonalnotes.ui.YourPersonalNotesActivity
import com.farhank501.demo.yourpersonalnotes.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {

	@ContributesAndroidInjector
	fun contributesYourPersonalNotesActivityInjector(): YourPersonalNotesActivity

	@ContributesAndroidInjector
	fun contributesSplashActivityInject(): SplashActivity
}