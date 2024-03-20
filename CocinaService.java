public class CocinaService {

    private Chef chef;
    private Despensa despensa;

    public CocinaService() {
    }
    public CocinaService(Chef chef, Despensa despensa) {
        this.chef = chef;
        this.despensa = despensa;
    }

    public void prepararPlatos(Receta receta){
        Ingrediente[] ingredientes = receta.getIngredientes();
        boolean suficientesIngredientes = true;
        for(Ingrediente ingrediente : ingredientes){
            if (!despensa.contieneSuficienteIngrediente(ingrediente)) {
                suficientesIngredientes = false;
                System.out.println("No hay suficiente " + ingrediente.getNombre() + " en la despensa.");
                System.out.println("Faltan " + (ingrediente.getCantidad() - despensa.getCantidadIngrediente(ingrediente)) + " unidades.");
            }
        }
        if (suficientesIngredientes) {
            // Preparar la receta
            for (Ingrediente ingrediente : ingredientes) {
                despensa.sacarIngrediente(ingrediente);
            }
            System.out.println("Receta preparada correctamente por el Chef " + chef.getNombre());
        } else {
            System.out.println("El Chef " + chef.getNombre() + " no pudo preparar la receta debido a la falta de ingredientes.");
        }
    }
}




