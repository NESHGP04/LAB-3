/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - Hija Producto - Padre Pepsi, Cola, Vino y Gatorade
 */

public class Bebida extends Producto {

    //Definición de variables
    float ml;
    String tipo;

    public Bebida(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, float ml, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio);
        this.ml = ml;
        this.categoria = "Bebida";
    }

}
