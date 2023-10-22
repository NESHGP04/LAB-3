/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - Hija Bebida 
 */

public class Pepsi extends Bebida implements Tipo{

    public Pepsi(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, float ml, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio, ml, categoria);
    }

    //Sobreescribe el tipo de bebida 
    @Override
    public void natural(){
        this.tipo = "Natural";
    }
    @Override
    public void electrico(){
        this.tipo = "";
    }
    @Override
    public void licor(){
        this.tipo = "";
    }
    @Override
    public void agua(){
        this.tipo = "";
    }

    public float getPrecio(){
        return precio;
    }

    public String getNombre(){
        return nombre;
    }
}
