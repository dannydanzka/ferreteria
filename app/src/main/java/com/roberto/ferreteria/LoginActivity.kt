package com.roberto.ferreteria

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var email: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.edtCorreo)
        password = findViewById(R.id.edtContrasena)

        findViewById<Button>(R.id.btnIngresar).setOnClickListener {
            validarUsuario()
        }
    }

    private fun validarUsuario() {
        val correo = email.text.toString()
        val contrasena = password.text.toString()

        if (correo == "usr" && contrasena == "12345") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Correo o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }
}
