package io.github.collins993.mvvmnewsapp.db

import androidx.room.TypeConverter
import io.github.collins993.mvvmnewsapp.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}