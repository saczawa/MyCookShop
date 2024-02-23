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

//mvvm
//        plik class Products - zaslepka
//
//        model
//        lista z orderami (czas powstania(data class), czas zrealizowania(), zawartosc)
//        listv calls
//
//        class Call(czas, product, ilosc, status)
//
//        enum status (cooking, ready, yellow, red) wasted-> callHistory[]
//
//        stale dane - np cooking time, name, koszt, cena, typ
//        zmienne dane - total, waste, sold
//
//        callCook [call1, call2, call3]
//        callMid [call1, call2, call3]
//        callFront [call1, call2, call3]
//
//        class Money (stan konta)
//
//        class GameTime (multplier, czas gry, day )
