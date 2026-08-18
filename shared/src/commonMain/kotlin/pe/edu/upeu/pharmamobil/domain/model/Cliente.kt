package pe.edu.upeu.pharmamobil.domain.model

data class Cliente(
    val id: Long,
    val nombreCompleto: String,
    val dni: String,
    val telefono: String?,
    val direccion: String
) {
    init {
        require(id > 0) { "El ID debe ser mayor que cero" }
        require(nombreCompleto.isNotBlank()) { "El nombre es obligatorio" }
        require(dni.length == 8) { "El DNI debe tener 8 dígitos" }
    }

    fun telefonoRegistrado(): String {
        return telefono?.takeIf { it.isNotBlank() } ?: "Sin teléfono"
    }
}