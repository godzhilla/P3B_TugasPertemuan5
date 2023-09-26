package com.example.p3b_tugaspertemuan5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.p3b_tugaspertemuan5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    COMPANION ADALAH SEMACAM OBJEK STATIC YANG DAPAT DIGUANAKN DI BERBAGAI FILE
//    cOMPANION INI DAPAT DIAKSES DENGAN CARA MELAKUKAN IMPORT BUNDLE()
//    TUJUAN DIBUATNYA COMPANION INI ADALAH UNTUK MENGIRIMKAN DATA KE HOMEPAGE DARI MAINACTIVITY


    private lateinit var binding : ActivityMainBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            // ini mendapatkan komponen btnRegister
            /* btnREgister ini memiliki beberapa fungsi dan method
            * salah satunya setOnClik listerner
            *
            * set on click listener ini digunakan untuk membuat listener ketika
            * objek terbut di klik oleh user*/
            btnRegister.setOnClickListener {
                /*kita disini akan membuat varibael objek untuk intent
                * intent ini akan digunakan untuk melakukan start activity page berikutnya*/
                val iniVariableObjectIntent = Intent(this@MainActivity, HomePage::class.java)
                iniVariableObjectIntent.putExtra(EXTRA_USERNAME, editTextUsername.text.toString())
                iniVariableObjectIntent.putExtra(EXTRA_EMAIL, editTextEmail.text.toString())
                iniVariableObjectIntent.putExtra(EXTRA_PHONE, editTextPhone.text.toString())
                clear_form()
                startActivity(iniVariableObjectIntent)
            }


            textViewCondition.setOnClickListener(){
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/")
            }

            textViewLogin.setOnClickListener(){
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/")
            }

            textViewTerms.setOnClickListener(){
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://www.google.com/")
            }
        }
    }

    fun clear_form(){
        with(binding){
            editTextEmail.text.clear()
            editTextPhone.text.clear()
            editTextUsername.text.clear()
            editTextPassword.text.clear()

        }
    }
}