package com.construction.application.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.construction.application.data.repository.BaseRepository
import com.construction.application.data.repository.ReportRepository
import com.construction.application.ui.report.ReportViewModel

class ViewModelFactory (
    private val repository: BaseRepository
    ): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
       return when {
            modelClass.isAssignableFrom(ReportViewModel::class.java) -> ReportViewModel(repository as ReportRepository) as T
           /* modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(repository as HomeRepository) as T
            modelClass.isAssignableFrom(NeedsDonationViewModel::class.java) -> NeedsDonationViewModel(repository as NeedsAndDonationRepository) as T
            modelClass.isAssignableFrom(ListNgoModel::class.java) -> ListNgoModel(repository as ListRepository) as T
*/
           // modelClass.isAssignableFrom()
            // create viewModel instance for all viewModelFactory
            else -> throw  IllegalArgumentException("ViewModelClass Not Found")
        }
    }
}
