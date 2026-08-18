package pe.edu.upeu.pharmamobil.data.repository

import pe.edu.upeu.pharmamobil.domain.model.Producto
import pe.edu.upeu.pharmamobil.domain.result.Resultado

interface ProductoRepository {
    fun listar(): List<Producto>

    fun buscarPorId(id: Long): Producto?

    fun guardar(producto: Producto): Resultado<Producto>
}
