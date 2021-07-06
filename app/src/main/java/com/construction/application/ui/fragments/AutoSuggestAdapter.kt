package com.construction.application.ui.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import com.construction.application.R
import com.construction.application.data.responses.SearchResponse

class AutoSuggestAdapter(private val context: Context,
                         private val dataSource: ArrayList<SearchResponse.SearchResponseItem>) : BaseAdapter(),
    Filterable
{
    private var mPois: List<SearchResponse.SearchResponseItem> = dataSource

    var countryFilterList = ArrayList<String>()

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    //1
    override fun getCount(): Int {
        return dataSource.size
    }

    //2
    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    //3
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //4
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        val rowView = inflater.inflate(R.layout.item_list_autosuggestions, parent, false)
        val titleTextView = rowView.findViewById(R.id.tv_search_auto_suggestion) as TextView
        val recipe = getItem(position) as SearchResponse.SearchResponseItem
        titleTextView.text = recipe.Work_Address
        return rowView
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val queryString = constraint?.toString()?.toLowerCase()
                val filterResults = FilterResults()
                filterResults.values = if (queryString==null || queryString.isEmpty())
                    dataSource
                else
                    dataSource.filter {
                        it.Work_Address.toLowerCase().contains(queryString)
                    }
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                mPois = results?.values as List<SearchResponse.SearchResponseItem>
                notifyDataSetChanged()
            }

        }
    }

}