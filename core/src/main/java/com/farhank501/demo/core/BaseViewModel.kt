package com.farhank501.demo.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class BaseViewModel : ViewModel() {

	@Suppress("UNCHECKED_CAST")
	class BaseViewModelFactory @Inject constructor() : ViewModelProvider.Factory {

		override fun <T : ViewModel?> create(modelClass: Class<T>): T {
			return BaseViewModel() as T
		}
	}
}