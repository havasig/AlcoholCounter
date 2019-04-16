package com.example.alcoholcounter.database;


import android.arch.persistence.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Date;


public class Converters {
    @TypeConverter
    public static Unit fromUnitString(String value) {
        Type listType = new TypeToken<Unit>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromUnit(Unit unit) {
        Gson gson = new Gson();
        String json = gson.toJson(unit);
        return json;
    }
    @TypeConverter
    public static Date fromDateString(String value) {
        Type listType = new TypeToken<Date>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromDate(Date date) {
        Gson gson = new Gson();
        String json = gson.toJson(date);
        return json;
    }
    @TypeConverter
    public static com.example.alcoholcounter.database.Type fromTypeString(String value) {
        Type listType = new TypeToken<com.example.alcoholcounter.database.Type>() {}.getType();
        return new Gson().fromJson(value, listType);
    }

    @TypeConverter
    public static String fromType(com.example.alcoholcounter.database.Type type) {
        Gson gson = new Gson();
        String json = gson.toJson(type);
        return json;
    }
}