package com.example.p3b_tugaspertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.p3b_tugaspertemuan5.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            val username = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
            val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
            val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)


            txtWelcoming.text = "Welcome $username \nYour $email has been actived \nYour $phone has been registered"

            buttonLogout.setOnClickListener {
                finish()
            }

        }
    }
}