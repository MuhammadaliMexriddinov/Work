package uz.gita.waterappgoogleplaygb.utils.extensions


import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


@SuppressLint("SimpleDateFormat")
fun getCurrentDate(): String {
    val c = Calendar.getInstance().time
    return SimpleDateFormat("MMMM dd,yyyy").format(c).uppercase()
}

@SuppressLint("SimpleDateFormat")
fun getCurrentDate(date: Date): String {
    return SimpleDateFormat("MMMM dd,yyyy").format(date).uppercase()
}

@SuppressLint("SimpleDateFormat")
fun getDateFormat(date: Date): String {
    return SimpleDateFormat("MMM dd,yyyy").format(date)
}

@SuppressLint("SimpleDateFormat")
fun String.toDate(): Date {
    val format = SimpleDateFormat("MMMM dd,yyyy")
    format.parse(this)
    return format.calendar.time
}


@SuppressLint("SimpleDateFormat")
fun getCurrentTime(): String {
    val c = Calendar.getInstance().time
    return SimpleDateFormat("HH:mm").format(c)
}

fun getInitialDelayTime(time: String): Int {
    val hour = time.substring(0, 2).toInt()
    val min = time.substring(3).toInt()
    val currentTime = getCurrentTime()
    val curHour = currentTime.substring(0, 2).toInt()
    val curMin = currentTime.substring(3).toInt()
    return hour * 3600 + min * 60 - (curHour * 3600 + curMin * 60)
}

fun String.toTime(): List<String> {
    return this.split(":")
}

fun returnDateAndThen(): Pair<String?, String?>? {
    val simpleDateFormat = SimpleDateFormat("MMMM dd,yyyy")
    val date = Date()
    return Pair(
        simpleDateFormat.format(date),
        simpleDateFormat.format(Date(date.year, date.month + 1, date.day))
    )
}
