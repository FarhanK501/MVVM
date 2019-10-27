package com.farhank501.demo.menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.menu_item_view.view.*
import javax.inject.Inject

class MenuAdapter @Inject constructor() : RecyclerView.Adapter<MenuAdapter.MenuHolder>() {

	private lateinit var menus: List<MenuModel>
	fun setData(menus: List<MenuModel>) {
		this.menus = menus
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHolder {
		val v = LayoutInflater.from(parent.context).inflate(R.layout.menu_item_view, parent, false)
		return MenuHolder(v)
	}

	override fun getItemCount(): Int {
		return menus.size
	}

	override fun onBindViewHolder(holder: MenuHolder, position: Int) {
		holder.bindViews(menus[position])
	}

	inner class MenuHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		fun bindViews(menu: MenuModel) {
			itemView.menuImageView.setImageResource(menu.menuIcon)
			itemView.menuTextView.text = menu.menuTitle
		}
	}
}