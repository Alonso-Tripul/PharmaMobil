package pe.edu.upeu.pharmamobil.domain.model

data class Pedido(
    val id: Long,
    val cliente: Cliente,
    val detalles: List<DetallePedido>,
    val estado: EstadoPedido = EstadoPedido.Registrado
) {
    init {
        require(id > 0) { "El ID debe ser mayor que cero" }
        require(detalles.isNotEmpty()) {
            "El pedido debe contener al menos un producto"
        }
    }

    fun calcularTotal(): Double {
        return detalles.sumOf { it.subtotal() }
    }

    fun cantidadTotalProductos(): Int {
        return detalles.sumOf { it.cantidad }
    }
}