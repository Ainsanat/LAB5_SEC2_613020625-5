package com.example.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_secend.*

class SecendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secend)

        var data = intent.extras
        var newStudent = data?.getParcelable<Student>("stdData")
        idText.text = "Student ID : ${newStudent?.id}"
        nameText.text = "Student Name : ${newStudent?.name}"
        ageText.text = "Student Age : ${newStudent?.age}"
    }
    fun onClickClose(v: View){
        finish()
    }
}