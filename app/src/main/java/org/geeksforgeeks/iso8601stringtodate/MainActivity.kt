package org.geeksforgeeks.iso8601stringtodate

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mDateFormat1 = findViewById<TextView>(R.id.date_format_1)
        val mDateFormat2 = findViewById<TextView>(R.id.date_format_2)

        // ISO 8601 formatted date
        val mDate1 = "2021-09-15T14:00:00Z"
        mDateFormat1.text = mDate1

        val mFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
        val mDate2: Date? = mFormat.parse(mDate1)
        mDateFormat2.text = "$mDate2"
    }
}