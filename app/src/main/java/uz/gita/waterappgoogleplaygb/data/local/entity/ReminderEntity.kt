package uz.gita.waterappgoogleplaygb.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "reminder")
data class ReminderEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val time: String
)
