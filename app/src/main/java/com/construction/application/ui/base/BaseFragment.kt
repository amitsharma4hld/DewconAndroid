/*
package com.construction.application.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.construction.application.data.db.AppDatabase
import com.construction.application.data.network.RemoteDataSource
import com.construction.application.data.repository.BaseRepository


abstract class BaseFragment<VM:BaseViewModel,B:ViewBinding,R: BaseRepository>: Fragment() {
    //protected lateinit var userPreferences: UserPreferences
    protected lateinit var binding: B
    protected lateinit var viewModel:VM
    protected val remoteDataSource = RemoteDataSource()
    protected val roomDb = AppDatabase
   // private lateinit var auth: FirebaseAuth
   // private lateinit var googleSignInClient: GoogleSignInClient

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //userPreferences = UserPreferences(requireContext())
        binding = getFragmentBinding(inflater,container)
        val factory = ViewModelFactory(getFragmentRepository())
        viewModel = ViewModelProvider(this,factory).get(getViewModel())
       */
/* lifecycleScope.launch {
            userPreferences.authToken.first()
            userPreferences.userId.first()
        }*//*

        return binding.root
    }


    abstract fun getViewModel():Class<VM>

    abstract fun getFragmentBinding(inflater: LayoutInflater, container: ViewGroup?) : B

    abstract fun getFragmentRepository():R

}*/
