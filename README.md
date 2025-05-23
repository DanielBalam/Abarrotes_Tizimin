## Proyecto "Abarrotes Tizimin"

**Licenciatura:** Licenciatura en Ingeniería de Software  

**Asesor:**  José Luis Lopez Martínez

##### Integrantes:
* Daniel de Jesús Balam Pech
* Luis Ángel Náhuat Tah

**Fecha de entrega: 20/05/2025**
## Introducción

Este proyecto tiene como finalidad la creacion de un software que nos ayude a gestionar de manera eficiente un tienda de abarrotes, tendra varios puntos importantes a cubrir como lo son el registro de articulos, realizacion de ventas y impresión de ticket. Lo que se busca en este caso es que el software sea amigable al usuario y que tenga una interfaz sencilla y funcional.

## Objetivo

El objetivo de esto es crear un programa de ventas de una tienda de abarrotes basado con ciertos diagramas vistos en clase, algunos de los puntos principales que debe cumplir son: el registro de clientes, registro de articulos, realizar ventas, generar ticket y tener un menu amigable y facil de entender.

## Vistas del proyecto

![Vista del proyecto](Imagen/VistaProyecto.png)

## Requerimientos Funcionales y no funcionales

#### Requerimientos Funcionales

- **Registro de Clientes**
    El sistema debe permitir registrar un cliente solicitando: Identificador, Nombre, Apellido Paterno, Dirección (Calle, Número, Colonia, Código Postal, Ciudad, Estado, Teléfono).

- **Registro de Artículos**
    El sistema debe permitir registrar un artículo solicitando: Identificador, Nombre del artículo,
    Precio al público, Precio del proveedor y Cantidad total en existencia.

- **Realización de Compras**
    El sistema debe permitir realizar una compra donde se proporcione el artículo y la cantidad deseada.
    
    El sistema debe verificar la existencia del artículo en inventario antes de confirmar la compra.

- **Generación de Ticket de Compra**
    Al finalizar una compra, el sistema debe generar un ticket que incluya:
    
    1. Nombre del artículo
    2. Cantidad adquirida
    3. Precio de cada articulo
    4. Importe total de la compra
    5. Fecha de Compra
    6. Nombre del cliente

- **Gestión de Menú Principal**
    El sistema debe mostrar un menú con las siguientes opciones:
    
    1. Registrar un cliente
    2. Registrar un artículo
    3. Realizar compra
    4. Salir

- **Actualización de Inventario**
    Después de una compra, el sistema debe descontar del inventario la cantidad adquirida.

#### Requerimientos No Funcionales

- **Interfaz Gráfica**
    El sistema debe contar con una interfaz gráfica amigable utilizando una librería como JavaFX o Swing.

- **Accesibilidad**
    El menú debe ser claro y fácil de navegar para usuarios con conocimientos básicos de computación.

- **Fiabilidad**
    El sistema debe validar entradas de datos para evitar errores como identificadores duplicados, precios negativos o cantidades no disponibles.

- **Rendimiento**
    Las operaciones como registrar, buscar artículos y procesar compras deben ejecutarse de forma rápida (sin demoras perceptibles para el usuario).

- **Disponibilidad Local**
    El sistema debe poder ejecutarse localmente en una computadora sin necesidad de conexión a internet.

- **Persistencia de Datos** (opcional dependiendo del alcance inicial)
    Idealmente, el sistema debería almacenar los datos de clientes, artículos y compras de forma
    persistente (archivos o bases de datos), aunque esto no fue solicitado explícitamente.

## Diagramas utilizados

##### Diagrama de casos de uso:

![Diagrama de casos de uso](Imagen/DiagramaCasosdeUso.png)

##### Diagrama de clase:

![Diagrama de clase](Imagen/DiagramaDeClases.png)

##### Diagrama de secuencia:

![Diagrama de secuencia](Imagen/DiagramaDeSecuencia.JPEG)

##### Diagrama de estados:

![Diagrama de estado](Imagen/DiagramaEstado_cliente.png)

![Diagrama de estado](Imagen/DiagramaEstado_articulo.png)

![Diagrama de estado](Imagen/DiagramaEstado_compra.png)

##### Diagrama de colaboración:

![Diagrama de colaboracion](Imagen/DiagramaColaboracion.jpeg)

##### Diagrama de actividad:

![Diagrama de actividades](Imagen/DiagramaActividades.jpeg)
## Patrones de diseño

**FACTORY:**
Es un patrón de diseño creacional que proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

![Metodo Factory](Imagen/MetodoFactory.png)

**SINGLETON:**
Es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.

![Metodo Singleton](Imagen/MetodoSingleton.png)

**MCV:**
Es un patrón de diseño que organiza una aplicación en tres componentes: el **Modelo**, que gestiona los datos y la lógica del negocio; la **Vista**, que presenta la información al usuario; y el **Controlador**, que actúa como intermediario entre ambos, procesando las acciones del usuario y actualizando el modelo o la vista según sea necesario.

![Metodo MVC](Imagen/MetodoMVC.png)

## Conclusiones

En conclusión, este proyecto busca fomentar el uso de ciertos diagramas para facilitar el desarrollo de programas, aprovechando la visualización estructurada de las clases que ya conocemos. Además, integra diagramas de estado y colaboración para mejorar la planificación y organización en cada uno de nuestros proyectos.