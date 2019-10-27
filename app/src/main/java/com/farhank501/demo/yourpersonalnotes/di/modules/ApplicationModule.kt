package com.farhank501.demo.yourpersonalnotes.di.modules

import android.app.Application
import android.content.Context
import com.farhank501.demo.di.qualifiers.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
object ApplicationModule {

	@Provides
	@ApplicationContext
	@JvmStatic
	fun provideApplicationContext(application: Application): Context {
		return application
	}
}