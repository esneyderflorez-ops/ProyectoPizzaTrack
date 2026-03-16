import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaPedidos sistema = new SistemaPedidos();

        int opcion;

        do {

            System.out.println("\n===== PIZZA TRACK =====");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer Pedido");
            System.out.println("3. Rehacer Pedido");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {

                case 1:

                    System.out.print("Nombre de la pizza: ");
                    String nombre = scanner.nextLine();

                    String[] ingredientes = new String[3];

                    for(int i = 0; i < 3; i++) {

                        System.out.print("Ingrediente " + (i+1) + ": ");
                        ingredientes[i] = scanner.nextLine();
                    }

                    Pizza pizza = new Pizza(nombre, ingredientes);
                    sistema.registrarPizza(pizza);

                    break;

                case 2:
                    sistema.deshacer();
                    break;

                case 3:
                    sistema.rehacer();
                    break;

                case 4:
                    sistema.mostrarPedidoActual();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while(opcion != 5);

        scanner.close();
    }
}