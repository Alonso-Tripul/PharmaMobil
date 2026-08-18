package pe.edu.upeu.pharmamobil.domain.model

import kotlin.test.Test
import kotlin.test.assertEquals

class PedidoTest {
    @Test
    fun calculaTotalYCantidadDeProductos() {
        val cliente = Cliente(
            id = 1L,
            nombreCompleto = "María López",
            dni = "74859621",
            telefono = "987654321",
            direccion = "Av. Los Jardines 250"
        )
        val analgesico = Producto(
            id = 101L,
            nombre = "Paracetamol 500 mg",
            laboratorio = "Medifarma",
            precio = 12.50,
            stock = 10,
            requiereReceta = false
        )
        val vitamina = Producto(
            id = 102L,
            nombre = "Vitamina C",
            laboratorio = "Portugal",
            precio = 8.00,
            stock = 20,
            requiereReceta = false
        )
        val pedido = Pedido(
            id = 5001L,
            cliente = cliente,
            detalles = listOf(
                DetallePedido(producto = analgesico, cantidad = 2),
                DetallePedido(producto = vitamina, cantidad = 3)
            )
        )

        assertEquals(49.00, pedido.calcularTotal(), absoluteTolerance = 0.001)
        assertEquals(5, pedido.cantidadTotalProductos())
        assertEquals(EstadoPedido.Registrado, pedido.estado)
    }
}
