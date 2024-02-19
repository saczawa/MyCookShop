package uk.ac.aber.myknajpa.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ProductionViewModel: ViewModel() {


//    var isCurrentlyDragging by mutableStateOf(false)
//    private set

    var items by mutableStateOf(emptyList<CallItem>())
    private set

    var addedCall = mutableStateListOf<CallItem>()
    private set


    }

//    fun startDragging() {
//        isCurrentlyDragging = true
//    }
//
//    fun stopDragging() {
//        isCurrentlyDragging = false
//    }

//    fun addCall(callItem: CallItem){
//        addedCall.add(callItem)
//    }


