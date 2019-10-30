package com.tjoeun.a20191030_02_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            var inputid = idEdt.text.toString()
            var inputPw = pwEdt.text.toString()

            Toast.makeText(this, String.format("ID : %s, PW : %s", inputid, inputPw), Toast.LENGTH_SHORT).show()

        }
    }
}
