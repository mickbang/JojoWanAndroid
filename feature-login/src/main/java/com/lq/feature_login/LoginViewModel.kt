package com.lq.feature_login

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


data class LoginUiState(
    val userName: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
)


class LoginViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()


    fun updateUserName(userName: String) {
        _uiState.update {
            it.copy(userName = userName)
        }
    }

    fun updatePassword(password: String) {
        _uiState.update {
            it.copy(password = password)
        }
    }

    fun login(){
        _uiState.update {
            it.copy(isLoading = true)
        }

    }
}