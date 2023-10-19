/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - Hija Bebida
 */

public class Gatorade extends Bebida implements Tipo {
    
    public Gatorade(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, float ml, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio, ml, categoria);
    }

    //Getters
    public String getTipo(){
        return this.tipo;
    }

    //Sobreescribe el tipo de bebida 
    @Override
    public void natural(){
        this.tipo = null;
    }
    @Override
    public void electrico(){
        this.tipo = "Electrico";
    }
    @Override
    public void licor(){
        this.tipo = null;
    }
    @Override
    public void agua(){
        this.tipo = null;
    }
}
