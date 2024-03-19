public class Despensa {
    private Ingrediente[] ingredientes;

    private int cantidadIngredientes;

    public Despensa(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    public void addIngrediente(Ingrediente ingrediente){
        ingredientes[cantidadIngredientes] = ingrediente;
        cantidadIngredientes++;
    }

    public void mostrarIngredientes(){
        for (int i = 0; i < cantidadIngredientes; i++) {
            System.out.println(ingredientes[i].toString());
        }
    }

    public void getIngrediente(String nombre, int cantidad){
        for (int i = 0; i < cantidadIngredientes; i++) {
            if (ingredientes[i].getNombre().equals(nombre)){
                ingredientes[i].sacarIngrediente(cantidad);
            }
        }
    }





}
