package com.example.pr11_tarasova_ulyana_pr_20101_5var

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickStepsActivity(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }


    //Функция изменения состояния поля флажок:
    fun onCheckboxClicked(view: View) {
        // Получаем Функция перехода на другой экран:  флажок

        val checkBox = view as CheckBox
        val selection = findViewById<TextView>(R.id.selection)
        // Получаем, отмечен ли данный флажок
        if (checkBox.isChecked) {
            selection.text = "Включено"
            checkBox.text = "Выключить"
        } else {
            selection.text = "Выключено"
            checkBox.text = "Включить"
        }
    }

}