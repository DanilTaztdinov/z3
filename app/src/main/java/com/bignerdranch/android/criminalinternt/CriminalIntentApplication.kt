package com.bignerdranch.android.criminalinternt

import android.app.Application

class CrimeIntentApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}