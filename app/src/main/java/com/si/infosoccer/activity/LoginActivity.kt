package com.si.infosoccer.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.si.infosoccer.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        googleLL.setOnClickListener{
            // Google 로그인
        }
        naverLL.setOnClickListener{
            // Naver 로그인
        }
        kakaoLL.setOnClickListener {
            // Kakao 로그인
        }
        kakaoLL.setOnClickListener {
            // 이외 로그인
        }
    }
}