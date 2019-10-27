package com.farhank501.demo.yourpersonalnotes.ui

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import com.farhank501.demo.core.BaseActivity
import com.farhank501.demo.menu.NotesMenuFragment
import com.farhank501.demo.yourpersonalnotes.R
import com.ncapdevi.fragnav.FragNavController

class YourPersonalNotesActivity : BaseActivity(), FragNavController.RootFragmentListener {
	override val numberOfRootFragments: Int
		get() = 1

	override fun getRootFragment(index: Int): Fragment {
		//TODO - add a when clause and return respective fragments
		return NotesMenuFragment.newInstance()
	}

	companion object {
		fun startYourPersonalNotesActivity(activity: BaseActivity) {
			val mainActivityIntent = Intent(activity, YourPersonalNotesActivity::class.java)
			activity.overridePendingTransition(
				R.anim.anim_top_to_bottom_in,
				R.anim.anim_hold_transition
			)
			startActivity(activity, mainActivityIntent, null)
			activity.finish()
		}
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_your_personal_notes)
	}
}
