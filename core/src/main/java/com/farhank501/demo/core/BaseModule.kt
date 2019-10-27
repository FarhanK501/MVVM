package com.farhank501.demo.core

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface BaseModule {

	@ContributesAndroidInjector
	fun contributeBaseActivityInjector(): BaseActivity

	@ContributesAndroidInjector
	fun contributeBaseFragmentInjector(): BaseFragment
}