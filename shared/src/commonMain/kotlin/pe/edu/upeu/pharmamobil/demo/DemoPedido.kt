package pe.edu.upeu.pharmamobil.demo

import pe.edu.upeu.pharmamobil.domain.model.Cliente
import pe.edu.upeu.pharmamobil.domain.model.DetallePedido
import pe.edu.upeu.pharmamobil.domain.model.Pedido
import pe.edu.upeu.pharmamobil.domain.model.Producto

fun probarPedido() {
    val cliente = Cliente(
        id = 1L,
        nombreCompleto = "María López",
        dni = "74859621",
        telefono = "987654321",
        direccion = "Av. Los Jardines 250"
    )

    val producto = Producto(
        id = 101L,
        nombre = "Paracetamol 500 mg",
        laboratorio = "Medifarma",
        precio = 12.50,
        stock = 10,
        requiereReceta = false
    )

    val detalle = DetallePedido(producto = producto, cantidad = 3)
    val pedido = Pedido(id = 5001L, cliente = cliente, detalles = listOf(detalle))

    println("Producto: ${producto.nombre}")
    println("Stock disponible: ${producto.hayStock(detalle.cantidad)}")
    println("Subtotal: S/ ${detalle.subtotal()}")
    println("Total del pedido: S/ ${pedido.calcularTotal()}")
}
