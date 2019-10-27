package com.farhank501.demo.menu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.farhank501.demo.core.BaseViewModel
import javax.inject.Inject

class MenuViewModel(private val notesMenuFactory: NotesMenuFactory) : BaseViewModel() {

	fun getAllMenus(): List<MenuModel> {
		return notesMenuFactory.getListOfMenus()
	}

	@Suppress("UNCHECKED_CAST")
	class MenuViewModelFactory @Inject constructor(private val notesMenuFactory: NotesMenuFactory) :
		ViewModelProvider.Factory {

		override fun <T : ViewModel?> create(modelClass: Class<T>): T {
			return MenuViewModel(notesMenuFactory) as T
		}
	}
}
