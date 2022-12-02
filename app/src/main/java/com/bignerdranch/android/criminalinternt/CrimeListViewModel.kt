package com.bignerdranch.android.criminalinternt

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {

    val crimes = mutableListOf<Crime>()

    init {
        val crime = Crime()
        crime.title = "Crime #$1"
        crime.isSolved = false
    }
}