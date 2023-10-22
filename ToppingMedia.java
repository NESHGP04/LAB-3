public class ToppingMedia extends Postre implements Decoracion, Empaque {
    
    public ToppingMedia(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, String categoria){
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
        this.deco = null;
    }
    @Override
    public void media(){
        this.deco = "Media docena";
    }

    public float getPrecio(){
        return precio;
    }
} 
