public class SistemaPedidos {

    private Pila pilaPedidos;    // Pila Principal (Undo)
    private Pila pilaDeshacer;   // Pila Secundaria (Redo)

    public SistemaPedidos() {

        pilaPedidos = new Pila();
        pilaDeshacer = new Pila();
    }

    public void registrarPizza(Pizza pizza) {

        pilaPedidos.push(pizza);
        // Limpiamos la pila de rehacer al registrar una nueva acción
        System.out.println("Pizza registrada.");
    }

    public void deshacer() {
        // Sacamos de la principal y movemos a la secundaria
        Pizza pizza = pilaPedidos.pop();

        if(pizza != null) {

            pilaDeshacer.push(pizza);
            System.out.println("Pedido deshecho.");
        } else {
            System.out.println("No hay pedidos.");
        }
    }

    public void rehacer() {
        // Sacamos de la secundaria y devolvemos a la principal
        Pizza pizza = pilaDeshacer.pop();

        if(pizza != null) {

            pilaPedidos.push(pizza);
            System.out.println("Pedido restaurado.");
        } else {
            System.out.println("No hay pedidos para rehacer.");
        }
    }

    public void mostrarPedidoActual() {

        Pizza pizza = pilaPedidos.peek();

        if(pizza != null) {
            pizza.mostrar();
        } else {
            System.out.println("No hay pedidos.");
        }
    }
}