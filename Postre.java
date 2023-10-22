/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - Hija Producto - Padre ToppingDocena, ToppingMedia, SinToppingDocena, SinToppingMedia
 */

public class Postre extends Producto {
    //Definición de variables
    protected String deco, empaque;
    protected float comision;

    //Constructor
    public Postre(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio);
        this.categoria = "Postre";
    }

    public float getComision(){
        return this.comision = precio*0.2f;
    }
}
