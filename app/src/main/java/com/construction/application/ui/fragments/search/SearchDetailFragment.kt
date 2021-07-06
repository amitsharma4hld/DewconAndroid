package com.construction.application.ui.fragments.search

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.construction.application.R
import com.construction.application.databinding.FragmentSearchDetailBinding
import com.construction.application.ui.report.ReportViewModel


class SearchDetailFragment  : Fragment(R.layout.fragment_search_detail) {

    private lateinit var binding: FragmentSearchDetailBinding
    // @Inject lateinit var remoteDataSource: RemoteDataSource
    private  val viewModel: ReportViewModel by viewModels()

    private var activityNote:String? = null
    private var assignmentString:String? = null
    private var department:String? = null
    private var location:String? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSearchDetailBinding.bind(view)

        arguments?.let {
            activityNote = SearchDetailFragmentArgs.fromBundle(it).activityNote
            assignmentString = SearchDetailFragmentArgs.fromBundle(it).assignment
            department = SearchDetailFragmentArgs.fromBundle(it).department
            location = SearchDetailFragmentArgs.fromBundle(it).location
        }
        binding.tvActivityNote.text = activityNote
        binding.tvAssignmentVlaue.text = assignmentString
        binding.tvDepartmentValue.text = department
        binding.tvLocationValue.text = location
    }

    override fun onStart() {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        super.onStart()
    }
}