public class NatFam extends Snack implements Sabor, Size {

    public NatFam(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, float gr, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio, gr, categoria);
    }

    @Override
    public void barbacoa() {
        this.sabor = null;
    }
    @Override
    public void picante() {
        this.sabor = null;
    }
    @Override
    public void naturalS() {
        this.sabor = "Natural";
    }

    @Override
    public void individual(){
        this.size = null;
    }
    @Override
    public void familiar() {
        this.sabor = "Familiar";
    }
}
