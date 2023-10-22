/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - Hija Producto - Padre BarbInd, BarbFam, Picanteind, picanteFam, NatInd y NatFam
 */

public class Snack extends Producto {
    
    //Definición de variables
    protected float gr;
    protected String sabor;
    protected String size;

    //Constructor
    public Snack(String id, String nombre, int disponible, int vendidos, boolean estado, float precio, float gr, String categoria){
        super(id, nombre, disponible, vendidos, estado, precio);
        this.gr = gr;
        this.categoria = "Snack"; 
    }
}
