package pe.edu.upeu.pharmamobil.domain.model

import kotlin.test.Test
import kotlin.test.assertEquals

class ClienteTest {
    @Test
    fun devuelveTelefonoRegistrado() {
        val cliente = crearCliente(telefono = "987654321")

        assertEquals("987654321", cliente.telefonoRegistrado())
    }

    @Test
    fun devuelveMensajeCuandoNoHayTelefono() {
        val cliente = crearCliente(telefono = null)

        assertEquals("Sin teléfono", cliente.telefonoRegistrado())
    }

    private fun crearCliente(telefono: String?) = Cliente(
        id = 1L,
        nombreCompleto = "María López",
        dni = "74859621",
        telefono = telefono,
        direccion = "Av. Los Jardines 250"
    )
}
