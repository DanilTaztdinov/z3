package com.bignerdranch.android.criminalinternt

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.Room
import java.util.UUID

private const val DATABASE_NAME = "crimedatabase"
class CrimeRepository private constructor(context:Context)
{
    private val database:CrimeDatabase = Room.databaseBuilder(
        context.applicationContext,
        CrimeDatabase::class.java,
        DATABASE_NAME
    ).build()
    private val crimeDao = database.crimeDao()
    fun getCrimes(): LiveData<List<Crime>> = crimeDao.getCrimes()
    fun getCrime(id:UUID): LiveData<Crime?> = crimeDao.getCrime(id)
    companion object {
        private var INSTANCE: CrimeRepository? = null
        fun initialize(context: Context) {
            if (INSTANCE == null)
            {
                INSTANCE =
                    CrimeRepository(context)
            }
        }
        fun get(): CrimeRepository{
            return INSTANCE ?:
            throw
            IllegalStateException("CrimeRepository must be initialized")
        }
    }
}