package com.example.finalassignment.database;

import androidx.room.TypeConverter;

import java.util.Date;

public class DateConverter {

    //Todo(1) Create annotated method toDate()

    //Todo(2) Create annotated method toTimeStamp

    @TypeConverter
    public static Date toDate(Long timeStamp){
        return timeStamp == null ? null : new Date(timeStamp);
    }

    @TypeConverter
    public static Long toTimeStamp(Date date){
        return date == null ? null : date.getTime();
    }
}


