package com.construction.application.ui.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.construction.application.R
import com.construction.application.data.HomeMenu


class HomeMenuRecycleAdapter(val menusList: List<HomeMenu>):  RecyclerView.Adapter<HomeMenuRecycleAdapter.RecordsViewHolder>()
{
    class RecordsViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordsViewHolder {
        return RecordsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.home_menu_grid_item, parent, false)
        )
    }

    override fun getItemCount() = menusList.size

    override fun onBindViewHolder(holder: RecordsViewHolder, position: Int) {
        val prentalRecord = menusList[position]
        holder.view.findViewById<TextView>(R.id.tv_menu_name).text = prentalRecord.name
        holder.view.findViewById<ImageView>(R.id.iv_menu_icon).setImageResource(menusList[position].image)

        holder.itemView.setOnClickListener { v ->
                 when (position) {
                0 -> {
                    val action = HomeFragmentDirections.actionHomeFragmentToTwwValueContractFragment()
                    Navigation.findNavController(holder.itemView).navigate(action)
                }
                1 -> {
                    val action = HomeFragmentDirections.actionHomeFragmentToServiceLineReportFragment()
                    Navigation.findNavController(holder.itemView).navigate(action)
                }
                2 -> {
                    val action = HomeFragmentDirections.actionHomeFragmentToTopSoilSeedFragment()
                    Navigation.findNavController(holder.itemView).navigate(action)
                }
                3 -> {

                }
                4 -> {

                }
                5 -> {

                }
                6 -> {

                }
                7 -> {

                }
                8 -> {

                }
                9 -> {

                }
                10 -> {
                    val action = HomeFragmentDirections.actionHomeFragmentToPoliceBackupFragment()
                    Navigation.findNavController(holder.itemView).navigate(action)
                }
                11 -> {

                }


            }

        }

    }
}