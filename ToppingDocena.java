
public class ToppingDocena extends Postre implements Decoracion, Empaque {
    
    public ToppingDocena(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio, categoria);
    }

    @Override
    public void topping(){
        this.deco = "Topping";
    }
    @Override
    public void sinTopping(){
        this.deco = null;
    }

    @Override
    public void docena(){
        this.deco = "Docena";
    }
    @Override
    public void media(){
        this.deco = null;
    }
}
