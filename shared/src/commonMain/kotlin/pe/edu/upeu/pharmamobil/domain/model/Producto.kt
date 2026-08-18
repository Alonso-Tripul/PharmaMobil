package pe.edu.upeu.pharmamobil.domain.model

data class Producto(
    val id: Long,
    val nombre: String,
    val laboratorio: String,
    val precio: Double,
    val stock: Int,
    val requiereReceta: Boolean
) {
    init {
        require(id > 0) { "El ID debe ser mayor que cero" }
        require(nombre.isNotBlank()) { "El nombre es obligatorio" }
        require(precio > 0) { "El precio debe ser mayor que cero" }
        require(stock >= 0) { "El stock no puede ser negativo" }
    }

    fun hayStock(cantidad: Int): Boolean {
        return cantidad > 0 && stock >= cantidad
    }
}