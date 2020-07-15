package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import kotlinx.android.synthetic.main.activity_resuly.*

class resulyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resuly)
        window.insetsController?.hide(WindowInsets.Type.statusBars())

        val username = intent.getStringExtra(Constants.USER_NAME)
        resTvUsername.text = username
        val totalQues = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANS, 0)

        restv.text = "Ypur score is $correctAns out of $totalQues"

        btn_finish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}