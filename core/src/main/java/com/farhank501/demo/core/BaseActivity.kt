package com.farhank501.demo.core

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity : DaggerAppCompatActivity() {

	@Inject
	lateinit var navigationViewModeFactory: NavigationViewModel.NavigationViewModelFactory
	lateinit var navigationViewModel: NavigationViewModel

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		navigationViewModel =
			ViewModelProviders.of(this, navigationViewModeFactory)[NavigationViewModel::class.java]
	}
}