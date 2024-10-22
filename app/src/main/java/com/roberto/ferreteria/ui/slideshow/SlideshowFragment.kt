package com.roberto.ferreteria.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.roberto.ferreteria.R

class SlideshowFragment : Fragment() {

    private lateinit var nombre: EditText
    private lateinit var telefono: EditText
    private lateinit var correo: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_slideshow, container, false)

        // Inicializar vistas
        nombre = view.findViewById(R.id.edtNombre)
        telefono = view.findViewById(R.id.edtTelefono)
        correo = view.findViewById(R.id.edtCorreo)

        view.findViewById<Button>(R.id.btnEnviar).setOnClickListener {
            enviarFormulario()
        }

        return view
    }

    private fun enviarFormulario() {
        val nombreText = nombre.text.toString()
        val telefonoText = telefono.text.toString()
        val correoText = correo.text.toString()

        if (nombreText.isNotEmpty() && telefonoText.isNotEmpty() && correoText.isNotEmpty()) {
            // Mostrar mensaje de confirmación
            Toast.makeText(activity, "Formulario enviado correctamente.", Toast.LENGTH_SHORT).show()

            // Limpiar los campos
            nombre.text.clear()
            telefono.text.clear()
            correo.text.clear()
        } else {
            Toast.makeText(activity, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show()
        }
    }
}
