package pe.edu.upeu.pharmamobil.domain.model

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EstadoPedidoTest {
    @Test
    fun guardaMotivoDeCancelacion() {
        val estado = EstadoPedido.Cancelado("Cliente solicitó la anulación")

        assertEquals("Cliente solicitó la anulación", estado.motivo)
    }

    @Test
    fun rechazaMotivoVacio() {
        assertFailsWith<IllegalArgumentException> {
            EstadoPedido.Cancelado("   ")
        }
    }
}
