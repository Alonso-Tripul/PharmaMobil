package pe.edu.upeu.pharmamobil.domain.result

sealed interface Resultado<out T> {
    data class Exito<T>(val datos: T) : Resultado<T>

    data class Error(val mensaje: String) : Resultado<Nothing> {
        init {
            require(mensaje.isNotBlank()) { "El mensaje de error es obligatorio" }
        }
    }
}
