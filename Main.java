public class Main {
    public static void main(String[] args) {

        //----------------------- Ejercicio 1 -----------------------
        Ingrediente ingrediente1 = new Ingrediente("Azucar", 100);
        System.out.println(ingrediente1.toString());

        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("Sal");
        ingrediente2.setCantidad(200);
        System.out.println(ingrediente2.toString());

        //----------------------- Ejercicio 2 -----------------------


        ingrediente2.sacarIngrediente(300);

        Despensa despensa = new Despensa(new Ingrediente[10]);
        despensa.addIngrediente(ingrediente1);
        despensa.addIngrediente(ingrediente2);

        despensa.mostrarIngredientes();

        despensa.getIngrediente("Azucar", 25);

        despensa.mostrarIngredientes();

        //----------------------- Ejercicio 3 -----------------------

        HuevoFrito huevoFrito = new HuevoFrito();
        huevoFrito.mostrarReceta();

        HuevoDuro huevoDuro = new HuevoDuro();
        huevoDuro.mostrarReceta();

        Torta torta = new Torta();
        torta.mostrarReceta();
        




    }
}
