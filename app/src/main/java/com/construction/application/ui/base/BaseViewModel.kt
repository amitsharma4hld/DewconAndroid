package com.construction.application.ui.base

import androidx.lifecycle.ViewModel
import com.construction.application.data.repository.BaseRepository

abstract class BaseViewModel(
    private val  repository: BaseRepository
):ViewModel(){

}