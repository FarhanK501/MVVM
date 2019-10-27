package com.farhank501.demo.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_notes_menu.*
import javax.inject.Inject

class NotesMenuFragment : BaseMenuFragment() {

	@Inject
	internal lateinit var menuAdapter: MenuAdapter

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_notes_menu, container, false)
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		menuAdapter.setData(menuViewModel.getAllMenus())
		menuRecyclerView.apply {
			setHasFixedSize(true)
			adapter = menuAdapter
		}
	}
}
