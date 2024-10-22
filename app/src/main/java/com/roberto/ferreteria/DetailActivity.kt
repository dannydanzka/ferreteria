package com.roberto.ferreteria

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Obtener el ID del producto pasado como extra
        val productoId = intent.getIntExtra("PRODUCTO_ID", -1)

        // Mapear el ID a un nombre de producto
        val nombresProductos = arrayOf(
            "Instrumentos de Nivelación",
            "Instrumentos de Medición",
            "Destornilladores",
            "Herramienta Mecánica",
            "Carpintería y Construcción",
            "Sargentos y Tornillos"
        )

        // Obtener el nombre del producto en base al ID
        val productoInfo = findViewById<TextView>(R.id.tvProductoDetalle)
        if (productoId in 1..6) {
            productoInfo.text = nombresProductos[productoId - 1]
        } else {
            productoInfo.text = "Producto no encontrado"
        }

        // Configurar botón de regresar
        findViewById<Button>(R.id.btnRegresar).setOnClickListener {
            finish()
        }
    }
}
