package pe.edu.upeu.pharmamobil.domain.model

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class DetallePedidoTest {
    @Test
    fun calculaSubtotalDeUnProducto() {
        val producto = crearProducto(precio = 12.50, stock = 10)
        val detalle = DetallePedido(producto = producto, cantidad = 3)

        assertEquals(
            expected = 37.50,
            actual = detalle.subtotal(),
            absoluteTolerance = 0.001
        )
    }

    @Test
    fun rechazaProductoConStockCero() {
        val producto = crearProducto(precio = 8.90, stock = 0)

        assertFailsWith<IllegalArgumentException> {
            DetallePedido(producto = producto, cantidad = 1)
        }
    }

    @Test
    fun rechazaCantidadMayorAlStock() {
        val producto = crearProducto(precio = 5.00, stock = 2)

        assertFailsWith<IllegalArgumentException> {
            DetallePedido(producto = producto, cantidad = 3)
        }
    }

    private fun crearProducto(precio: Double, stock: Int) = Producto(
        id = 101L,
        nombre = "Paracetamol 500 mg",
        laboratorio = "Medifarma",
        precio = precio,
        stock = stock,
        requiereReceta = false
    )
}
