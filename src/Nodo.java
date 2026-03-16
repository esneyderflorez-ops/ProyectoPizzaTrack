public class Nodo {

    Pizza dato;      // Información almacenada (Objeto Pizza)
    Nodo siguiente;  // Puntero de referencia al siguiente nodo en la memoria

    public Nodo(Pizza dato) {
        this.dato = dato;
        this.siguiente = null;  // Por defecto no apunta a nada hasta ser apilado
    }
}