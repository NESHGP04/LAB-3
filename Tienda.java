/*Laboratorio #3 
 * Marinés García 23391
 * MAIN
 */

import java.util.*;

public class Tienda{
    
    public static void Menu(){
        System.out.println("\n<<<TORNEO DE VOLEYBALL>>>");
        System.out.println("\nMENÚ");
        System.out.println("\n1.Agregar producto");
        System.out.println("\n2.Buscar producto");
        System.out.println("\n3.Listar productos por categoría");
        System.out.println("\n4.Informe");
    }
    public static void main(String[] args){

        //Declaración de variables 
        ArrayList<Producto> listaProducto = new ArrayList<Producto>();

        Pepsi pepsi1 = new Pepsi("12345", "Pepsi", 20, 15, true, 12.5f, 237, "Bebida");
        listaProducto.add(pepsi1);

        ToppingDocena cupcake = new ToppingDocena("56284", "Cupcake", 2, 3, true, 15, "Postre");
        listaProducto.add(cupcake);


    }
}