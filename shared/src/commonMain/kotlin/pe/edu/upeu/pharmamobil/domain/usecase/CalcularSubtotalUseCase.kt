package pe.edu.upeu.pharmamobil.domain.usecase

import pe.edu.upeu.pharmamobil.domain.model.DetallePedido

class CalcularSubtotalUseCase {
    operator fun invoke(detalle: DetallePedido): Double = detalle.subtotal()
}
