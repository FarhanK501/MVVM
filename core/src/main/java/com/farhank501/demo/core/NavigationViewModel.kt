package com.farhank501.demo.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

/**
 * Observe changes and navigate to activity or fragments.
 */
class NavigationViewModel : ViewModel() {

	@Suppress("UNCHECKED_CAST")
	class NavigationViewModelFactory @Inject constructor() : ViewModelProvider.Factory {

		override fun <T : ViewModel?> create(modelClass: Class<T>): T {
			return NavigationViewModel() as T
		}
	}

}