# Pizza-Track: Simulador de Gestión de Pedidos (Pilas)

## Objetivo del Proyecto
Desarrollar un sistema de gestión de pedidos para una pizzería utilizando la estructura de datos de **Pila (Stack)** implementada manualmente mediante **Listas Ligadas**. El sistema permite registrar pedidos y ofrece la funcionalidad de **Deshacer (Undo)** y **Rehacer (Redo)**.

---

##  Comprensión Teórica

### ¿Qué es una Pila (Stack)?
Una pila es una estructura de datos lineal que sigue el principio **LIFO** (*Last In, First Out*), lo que significa que el último elemento en entrar es el primero en salir. 

### Aplicación del Ciclo Undo/Redo
Para este proyecto se utilizan dos pilas manuales:
1.  **Pila Principal (Pedidos):** Almacena los pedidos activos. Cuando el usuario hace "Deshacer", se realiza un `pop()` en esta pila.
2.  **Pila Secundaria (Rehacer):** Almacena temporalmente los pedidos eliminados. Si el usuario decide "Rehacer", el pedido se recupera mediante un `pop()` de esta pila y se reintegra a la principal.

---

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 
* **Entorno:** Visual Studio Code
* **Control de Versiones:** Git y GitHub

---

## 🚀 Instrucciones de Ejecución
1.  Clonar el repositorio o descargar los archivos fuente.
2.  Asegurarse de tener instalado el JDK de Java.
3.  Abrir la carpeta del proyecto en VS Code.
4.  Ejecutar la clase `Main.java`.
5.  Interactuar con el menú en consola seleccionando las opciones del 1 al 5.

---

## 📸 Capturas de Pantalla
> *Aquí puedes insertar la ruta de la imagen de tu ejecución exitosa*
![Ejecución Pizza Track](https://via.placeholder.com/600x400?text=Insertar+Captura+de+Consola+Aqui)

---

## 🎥 Sustentación Individual
**Enlace al video explicativo:** [Haz clic aquí para ver el video](TU_LINK_DE_YOUTUBE_O_DRIVE_AQUI)

*En el video se explica:*
* Presentación personal.
* Lógica de punteros en los métodos `push()` y `pop()`.
* Demostración del ciclo completo: Registro -> Deshacer -> Rehacer.

---

## 👤 Autores
* **Esneyder Floez Amaya** - https://github.com/esneyderflorez-ops/ProyectoPizzaTrack.git
