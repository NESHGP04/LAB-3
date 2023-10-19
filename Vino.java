/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - Hija Bebida
 */

public class Vino extends Bebida implements Tipo{

    public Vino(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, float ml, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio, ml, categoria);
    }

    //Sobreescribe el tipo de bebida 
    @Override
    public void natural(){
        this.tipo = null;
    }
    @Override
    public void electrico(){
        this.tipo = null;
    }
    @Override
    public void licor(){
        this.tipo = "Con licor";
    }
    @Override
    public void agua(){
        this.tipo = null;
    }
}
