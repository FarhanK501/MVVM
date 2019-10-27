package com.farhank501.demo.yourpersonalnotes.base

import android.app.Activity
import android.content.BroadcastReceiver
import androidx.annotation.NonNull
import com.farhank501.demo.core.BaseApp
import com.farhank501.demo.yourpersonalnotes.di.component.AppComponent
import com.farhank501.demo.yourpersonalnotes.di.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasBroadcastReceiverInjector
import javax.inject.Inject

class MVVMApp : BaseApp(), HasBroadcastReceiverInjector, HasActivityInjector {

	@Inject
	lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

	@Inject
	lateinit var dispatchingBroadcastReceiverInjector: DispatchingAndroidInjector<BroadcastReceiver>

	override fun onCreate() {
		super.onCreate()
		createComponent().inject(this)
	}

	override fun activityInjector(): DispatchingAndroidInjector<Activity> {
		return dispatchingAndroidInjector
	}

	override fun broadcastReceiverInjector(): DispatchingAndroidInjector<BroadcastReceiver> {
		return dispatchingBroadcastReceiverInjector
	}

	@NonNull
	private fun createComponent(): AppComponent {
		return DaggerAppComponent.builder()
			.application(this)
			.build()
	}
}