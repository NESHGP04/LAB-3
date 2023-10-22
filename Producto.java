/*Laboratorio #3 
 * Marinés García 23391
 * CLASS - Padre Bebida, Snack y Postre
 */

public abstract class Producto {

    //Declaración de variables
    protected String id, nombre;
    protected int disponible, vendidos;
    protected float precio;
    protected boolean estado;
    protected String categoria;

    public Producto(String id, String nombre, int disponible, int vendidos, boolean estado, float precio){
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
        this.vendidos = vendidos;
        this.estado = estado;
        this.precio = precio;
    }

    public String toString(){
        return this.nombre + " con ID: " + this.id + "\nQ" + this.precio + "\nDisponibles: " + this.disponible + "\nVendidos:" + this.vendidos;
    }

    public void setVentas(int vendidos, float precio){
        System.out.println("Las ventas de Bebidas son: " + (this.vendidos*this.precio));
    }

    public String getNombre(){
        return nombre;
    }
}
