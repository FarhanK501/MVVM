package com.farhank501.demo.menu

enum class NotesMenu constructor(val menuName: String) {

	TEXT("Text Notes"),
	AUDIO("Audio Notes"),
	VIDEO("Video Notes"),
	HELP("Help"),
	ABOUT_APP("About App");

	companion object {
		fun from(search: String): com.farhank501.demo.menu.NotesMenu =
			requireNotNull(values().find { it.menuName == search }) { "No Menu name with value $search" }
	}

}