package com.farhank501.demo.splash

import android.os.Bundle
import com.farhank501.demo.core.BaseActivity
import com.farhank501.demo.daos.AppConfiguration
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

abstract class SplashActivity : BaseActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_splash)
	}

	override fun onResume() {
		super.onResume()
		onConfigFetched()
	}

	abstract fun onConfigFetched()

	suspend fun fetchConfig(): AppConfiguration {
		return withContext(Dispatchers.IO) {
			Thread.sleep(5000)
			AppConfiguration()
		}
	}

}
