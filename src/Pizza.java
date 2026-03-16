public class Pizza {

    private String nombre;
    private String[] ingredientes;

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public void mostrar() {

        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes:");

        for(String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
}