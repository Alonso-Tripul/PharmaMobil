# PharmaMobil

Proyecto académico Kotlin Multiplatform para modelar clientes, medicamentos y
pedidos de una farmacia móvil. El código compartido se encuentra en el módulo
`shared` y funciona para Android e iOS.

## Funcionalidades desarrolladas

- Registro y validación básica de clientes.
- Productos farmacéuticos con precio, laboratorio, stock y control de receta.
- Validación de stock disponible antes de agregar un producto al pedido.
- Cálculo del subtotal por producto y del total general del pedido.
- Estados del pedido: registrado, preparando, en camino, entregado y cancelado.
- Casos de uso para calcular subtotales y validar stock.
- Pruebas unitarias multiplataforma con `kotlin.test`.

## Estructura principal

```text
shared/src/commonMain/kotlin/pe/edu/upeu/pharmamobil/
├── data/repository/ProductoRepository.kt
├── demo/
│   ├── DemoCliente.kt
│   └── DemoPedido.kt
└── domain/
    ├── model/
    │   ├── Cliente.kt
    │   ├── DetallePedido.kt
    │   ├── EstadoPedido.kt
    │   ├── Pedido.kt
    │   └── Producto.kt
    ├── result/Resultado.kt
    ├── service/PedidoService.kt
    └── usecase/
        ├── CalcularSubtotalUseCase.kt
        └── ValidarStockUseCase.kt
```

Las pruebas están en:

```text
shared/src/commonTest/kotlin/pe/edu/upeu/pharmamobil/domain/model/
```

## Pruebas solicitadas

El proyecto incluye pruebas para comprobar que:

1. Un producto de precio `S/ 12.50` y cantidad `3` devuelve un subtotal de
   `S/ 37.50`.
2. Un producto con stock `0` no se encuentra disponible.
3. No se puede crear un detalle cuando la cantidad supera el stock.
4. El total del pedido corresponde a la suma de todos sus subtotales.
5. El teléfono del cliente devuelve el número registrado o el texto
   `Sin teléfono` cuando es nulo.

## Ejecución

Desde Android Studio, ejecute las pruebas como **Android Host Test**. También se
pueden ejecutar desde una terminal ubicada en la raíz del proyecto:

```bash
./gradlew :shared:testAndroidHostTest
```

En Windows PowerShell:

```powershell
.\gradlew.bat :shared:testAndroidHostTest
```

Para compilar la aplicación Android:

```bash
./gradlew :androidApp:assembleDebug
```

## Tecnologías

- Kotlin Multiplatform
- Compose Multiplatform
- Android Gradle Plugin
- `kotlin.test`

## Documentación

La evidencia de la sesión, las capturas y la matriz de pruebas se encuentran en
la carpeta [`docs`](./docs):

- [`Documentacion_PharmaMobil.pdf`](./docs/Documentacion_PharmaMobil.pdf)
- [`Documentacion_PharmaMobil.docx`](./docs/Documentacion_PharmaMobil.docx)
