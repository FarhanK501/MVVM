package com.farhank501.demo.menu

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.farhank501.demo.core.BaseFragment
import javax.inject.Inject

abstract class BaseMenuFragment : BaseFragment() {

	@Inject
	internal lateinit var menuViewModelFactory: MenuViewModel.MenuViewModelFactory
	internal lateinit var menuViewModel: MenuViewModel

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		activity?.let {
			menuViewModel =
				ViewModelProviders.of(it, menuViewModelFactory)[MenuViewModel::class.java]
		}
	}
}
