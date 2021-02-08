package com.example.guru2quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    //버튼별로 변수 선언
    lateinit var btnQuizPaper:Button
    lateinit var btnQuizPlastic:Button
    lateinit var btnQuizGlass:Button
    lateinit var btnQuizCan:Button
    lateinit var btnQuizVinyl:Button
    lateinit var btnQuizStyrofoam:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //변수와 xml의 아이디 연결하기
        btnQuizPaper=findViewById(R.id.btnQuizPaper)
        btnQuizPlastic=findViewById(R.id.btnQuizPlastic)
        btnQuizGlass=findViewById(R.id.btnQuizGlass)
        btnQuizCan=findViewById(R.id.btnQuizCan)
        btnQuizVinyl=findViewById(R.id.btnQuizVinyl)
        btnQuizStyrofoam=findViewById(R.id.btnQuizStyrofoam)

        //종이 버튼을 누르면 종이 퀴즈 페이지로 이동
        btnQuizPaper.setOnClickListener {
            var intent = Intent(this, pageQuizPaper::class.java)
            startActivity(intent)
        }
    }
}