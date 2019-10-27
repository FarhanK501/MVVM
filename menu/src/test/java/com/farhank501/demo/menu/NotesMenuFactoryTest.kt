package com.farhank501.demo.menu

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.mockito.MockitoAnnotations.initMocks

@RunWith(Parameterized::class)
class NotesMenuFactoryTest constructor(
	private val menuModel: MenuModel,
	private val isValidResult: Boolean
) {

	private val systemUnderTest: NotesMenuFactory

	init {
		initMocks(this)
		systemUnderTest = NotesMenuFactory()
	}

	companion object {
		@JvmStatic
		val menuFactory: Iterable<Array<Any>>
			@Parameterized.Parameters(
				name = "When model is {0}, then it should be valid = {1}"
			) get() = listOf(
				arrayOf<Any>(
					MenuModel(
						android.R.drawable.ic_menu_call,
						NotesMenu.AUDIO.menuName
					), true
				),
				arrayOf<Any>(
					MenuModel(
						android.R.drawable.ic_menu_camera,
						NotesMenu.VIDEO.menuName
					), true
				),
				arrayOf<Any>(
					MenuModel(
						android.R.drawable.ic_menu_edit,
						NotesMenu.TEXT.menuName
					), true
				),
				arrayOf(
					MenuModel(
						android.R.drawable.ic_menu_help,
						NotesMenu.HELP.menuName
					), true
				),
				arrayOf(
					MenuModel(
						android.R.drawable.ic_menu_info_details,
						NotesMenu.ABOUT_APP.menuName
					), true
				),
				arrayOf(
					MenuModel(
						android.R.drawable.ic_menu_info_details,
						NotesMenu.VIDEO.menuName
					), false
				),
				arrayOf(
					MenuModel(
						android.R.drawable.ic_menu_edit,
						NotesMenu.AUDIO.menuName
					), false
				),
				arrayOf(
					MenuModel(
						android.R.drawable.presence_audio_online,
						NotesMenu.HELP.menuName
					), false
				)
			)
	}

	@Test
	fun getListOfMenus() {
		val allMenus = systemUnderTest.getListOfMenus()
		assertEquals(isValidResult, allMenus.contains(menuModel))
	}

}