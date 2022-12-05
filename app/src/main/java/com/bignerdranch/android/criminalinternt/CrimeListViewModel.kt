package com.bignerdranch.android.criminalinternt

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel()
{
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()
}