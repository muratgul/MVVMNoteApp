package com.muratgul.mvvmnoteapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.util.*

@Entity(tableName = "notes")
@Parcelize
data class Note(
        @PrimaryKey
        var uuid: String = UUID.randomUUID().toString(),
        var noteTitle: String = "",
        var noteBody: String = ""
) : Parcelable