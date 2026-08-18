package pe.edu.upeu.pharmamobil.domain.model

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ProductoTest {
    @Test
    fun productoConStockCeroNoEstaDisponible() {
        val producto = crearProducto(stock = 0)

        assertFalse(producto.hayStock(cantidad = 1))
    }

    @Test
    fun productoConStockSuficienteEstaDisponible() {
        val producto = crearProducto(stock = 10)

        assertTrue(producto.hayStock(cantidad = 3))
    }

    @Test
    fun cantidadCeroNoEsUnaSolicitudValida() {
        val producto = crearProducto(stock = 10)

        assertFalse(producto.hayStock(cantidad = 0))
    }

    private fun crearProducto(stock: Int) = Producto(
        id = 101L,
        nombre = "Paracetamol 500 mg",
        laboratorio = "Medifarma",
        precio = 12.50,
        stock = stock,
        requiereReceta = false
    )
}
