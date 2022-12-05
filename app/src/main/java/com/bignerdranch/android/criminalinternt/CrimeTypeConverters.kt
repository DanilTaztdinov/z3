package com.bignerdranch.android.criminalinternt

import androidx.room.TypeConverter
import java.util.Date
import java.util.UUID

class CrimeTypeConverters {
    @TypeConverter
    fun fromDate(date:Date?):Long?{
        return date?.time
    }
    @TypeConverter
    fun toDate(millisSinceEpoch:Long?): Date?
    {
        return millisSinceEpoch?.let {
            Date(it)
        }
    }
    @TypeConverter
    fun toUUID(uuid:String?) : UUID? {
        return UUID.fromString(uuid)
    }
    @TypeConverter
    fun fromUUTD(uuid: UUID?) : String?{
        return uuid?.toString()
    }
}