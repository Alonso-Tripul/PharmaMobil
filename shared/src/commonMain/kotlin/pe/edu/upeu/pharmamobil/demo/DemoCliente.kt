package pe.edu.upeu.pharmamobil.demo

import pe.edu.upeu.pharmamobil.domain.model.Cliente

fun probarCliente() {
    val cliente = Cliente(
        id = 1L,
        nombreCompleto = "María López",
        dni = "74859621",
        telefono = "987654321",
        direccion = "Av. Los Jardines 250"
    )

    println("Cliente: ${cliente.nombreCompleto}")
    println("Teléfono: ${cliente.telefonoRegistrado()}")
}