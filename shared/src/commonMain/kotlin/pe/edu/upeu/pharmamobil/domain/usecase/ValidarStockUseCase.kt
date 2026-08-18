package pe.edu.upeu.pharmamobil.domain.usecase

import pe.edu.upeu.pharmamobil.domain.model.Producto

class ValidarStockUseCase {
    operator fun invoke(producto: Producto, cantidad: Int): Boolean =
        producto.hayStock(cantidad)
}
