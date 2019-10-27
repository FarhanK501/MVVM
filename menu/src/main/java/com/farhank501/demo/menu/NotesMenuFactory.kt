package com.farhank501.demo.menu

import javax.inject.Inject

open class NotesMenuFactory @Inject constructor() {

	fun getListOfMenus(): List<MenuModel> {
		val menus = arrayListOf<MenuModel>()
		menus.add(MenuModel(android.R.drawable.ic_menu_call, NotesMenu.AUDIO.menuName))
		menus.add(MenuModel(android.R.drawable.ic_menu_camera, NotesMenu.VIDEO.menuName))
		menus.add(MenuModel(android.R.drawable.ic_menu_edit, NotesMenu.TEXT.menuName))
		menus.add(MenuModel(android.R.drawable.ic_menu_help, NotesMenu.HELP.menuName))
		menus.add(MenuModel(android.R.drawable.ic_menu_info_details, NotesMenu.ABOUT_APP.menuName))
		return menus
	}
}