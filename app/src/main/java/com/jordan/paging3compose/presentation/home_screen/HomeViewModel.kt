package com.jordan.paging3compose.presentation.home_screen

import androidx.lifecycle.ViewModel
import com.jordan.paging3compose.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: Repository
): ViewModel() {
    val getAllImages = repository.getAllImages()
}