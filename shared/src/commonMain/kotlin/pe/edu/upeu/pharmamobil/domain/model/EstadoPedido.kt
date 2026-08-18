package pe.edu.upeu.pharmamobil.domain.model

sealed class EstadoPedido {
    data object Registrado : EstadoPedido()
    data object Preparando : EstadoPedido()
    data object EnCamino : EstadoPedido()
    data object Entregado : EstadoPedido()

    data class Cancelado(
        val motivo: String
    ) : EstadoPedido() {
        init {
            require(motivo.isNotBlank()) {
                "Debe indicar el motivo de la cancelación"
            }
        }
    }
}