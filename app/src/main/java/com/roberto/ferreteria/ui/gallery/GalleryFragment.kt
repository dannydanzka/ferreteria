package com.roberto.ferreteria.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.roberto.ferreteria.DetailActivity
import com.roberto.ferreteria.R

class GalleryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gallery, container, false)

        // Configurar los clics en cada imagen para abrir el detalle
        view.findViewById<ImageView>(R.id.imgHerramienta1).setOnClickListener {
            abrirDetalle(1)
        }
        view.findViewById<ImageView>(R.id.imgHerramienta2).setOnClickListener {
            abrirDetalle(2)
        }
        view.findViewById<ImageView>(R.id.imgHerramienta3).setOnClickListener {
            abrirDetalle(3)
        }
        view.findViewById<ImageView>(R.id.imgHerramienta4).setOnClickListener {
            abrirDetalle(4)
        }
        view.findViewById<ImageView>(R.id.imgHerramienta5).setOnClickListener {
            abrirDetalle(5)
        }
        view.findViewById<ImageView>(R.id.imgHerramienta6).setOnClickListener {
            abrirDetalle(6)
        }

        return view
    }

    private fun abrirDetalle(productoId: Int) {
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra("PRODUCTO_ID", productoId)
        startActivity(intent)
    }
}
