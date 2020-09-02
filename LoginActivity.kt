package com.example.kotlinmessenger

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.user_name_edittext_register
import kotlinx.android.synthetic.main.activity_login.register_button
import kotlinx.android.synthetic.main.activity_login.password_edittext_register

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        register_button.setOnClickListener {
            val email = user_name_edittext_register.text.toString()
            val password = password_edittext_register.text.toString()

            Log.d("Login", "Attempt login with email/pw: $email/$password")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener{
//
//            }



            Log.d("Login", "Attempt login with email/pw: $email/$password")

            back_to_register_textview.setOnClickListener{
                finish()
            }
        }

    }
}