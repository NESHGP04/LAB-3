public class BarbInd extends Snack implements Sabor, Size {

    public BarbInd(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, float gr, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio, gr, categoria);
    }

    @Override
    public void barbacoa() {
        this.sabor = "Barbacoa";
    }
    @Override
    public void picante() {
        this.sabor = null;
    }
    @Override
    public void naturalS() {
        this.sabor = null;
    }

    @Override
    public void individual(){
        this.size = "Individual";
    }
    @Override
    public void familiar() {
        this.sabor = null;
    }
}
