package com.farhank501.demo.yourpersonalnotes.di.component

import com.farhank501.demo.core.BaseModule
import com.farhank501.demo.di.scopes.ApplicationScoped
import com.farhank501.demo.splash.SplashModule
import com.farhank501.demo.yourpersonalnotes.base.MVVMApp
import com.farhank501.demo.yourpersonalnotes.di.modules.ActivityModule
import com.farhank501.demo.yourpersonalnotes.di.modules.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@SuppressWarnings("unused")
@Singleton
@ApplicationScoped
@Component(
	modules = [
		AndroidInjectionModule::class,
		AndroidSupportInjectionModule::class,
		ApplicationModule::class,
		BaseModule::class,
		SplashModule::class,
		ActivityModule::class
	]
)
interface AppComponent : AndroidInjector<MVVMApp> {

	@Component.Builder
	interface Builder {

		@BindsInstance
		fun application(application: MVVMApp): Builder

		fun build(): AppComponent
	}
}