package com.farhank501.demo.yourpersonalnotes.ui.splash

import android.content.Context
import android.widget.Toast
import com.farhank501.demo.daos.AppConfiguration
import com.farhank501.demo.splash.SplashActivity
import com.farhank501.demo.yourpersonalnotes.ui.YourPersonalNotesActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SplashActivity : SplashActivity() {

	override fun onConfigFetched() {
		val act = this
		GlobalScope.launch {
			val appConfig: AppConfiguration = fetchConfig()
			if (appConfig.sessionID.isEmpty().not()) {
				YourPersonalNotesActivity.startYourPersonalNotesActivity(act)
			} else {
				Toast.makeText(
					this as Context,
					"Configuration fetching has been failed, please wait while we try again.",
					Toast.LENGTH_SHORT
				).show()
			}
		}
	}
}