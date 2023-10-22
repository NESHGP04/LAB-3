public class SinToppingMedia extends Postre implements Decoracion, Empaque {
    
    public SinToppingMedia(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio, categoria);
    }

    @Override
    public void topping(){
        this.deco = null;
    }
    @Override
    public void sinTopping(){
        this.deco = "No topping";
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