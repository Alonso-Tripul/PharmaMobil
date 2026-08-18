package pe.edu.upeu.pharmamobil.domain.service

import pe.edu.upeu.pharmamobil.domain.model.EstadoPedido
import pe.edu.upeu.pharmamobil.domain.model.Pedido
import pe.edu.upeu.pharmamobil.domain.result.Resultado

interface PedidoService {
    fun registrar(pedido: Pedido): Resultado<Pedido>

    fun cambiarEstado(pedidoId: Long, nuevoEstado: EstadoPedido): Resultado<Pedido>
}
