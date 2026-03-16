public class Pila {

    private Nodo tope;  // Puntero que siempre apunta al nodo superior de la pila

    public Pila() {
        tope = null;  // Inicialmente la pila está vacía
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);  // Creamos un nuevo contenedor (nodo)
        // LÓGICA DE PUNTEROS:
        nuevo.siguiente = tope; // El nuevo nodo apunta al que antes era el tope
        tope = nuevo;           // El tope se actualiza para ser ahora el nuevo nodo
    }

    public Pizza pop() {

        if(isEmpty()) {
            return null;
        }
        // LÓGICA DE PUNTEROS:

        Pizza dato = tope.dato;  // Extraemos el valor del nodo actual en el tope
        tope = tope.siguiente;   // El tope "salta" al siguiente nodo, eliminando el actual

        return dato;
    }

    public Pizza peek() {

        if(isEmpty()) {
            return null;
        }

        return tope.dato;  // Solo devuelve el valor sin mover punteros
    }
}