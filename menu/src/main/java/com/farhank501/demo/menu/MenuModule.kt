package com.farhank501.demo.menu

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MenuModule {

	@ContributesAndroidInjector
	fun contributesBaseMenuFragmentInjector(): BaseMenuFragment

	@ContributesAndroidInjector
	fun contributesNotesMenuFactoryInjector(): NotesMenuFactory
}