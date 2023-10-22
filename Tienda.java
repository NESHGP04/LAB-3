/*Laboratorio #3 
 * Marinés García 23391
 * MAIN
 */

import java.util.*;
import java.io.*;

public class Tienda {

    //Método para llamar Menú
    public static void menu() {
        System.out.println("\n<<<INVENTARIO>>>");
        System.out.println("\nMENÚ");
        System.out.println("\n1.Agregar producto");
        System.out.println("2.Buscar producto");
        System.out.println("3.Listar productos por categoría");
        System.out.println("4.Informe");
        System.out.println("5.Salir");
    }

    public static void main(String[] args) {

        // Declaración de variables
        ArrayList<Producto> listaProducto = new ArrayList<>();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        boolean estadoSc;
        Producto p = null;

        while (!salir) {
            menu();
            System.out.println("\nIngrese un índice: ");
            int opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                //Agregar producto
                case 1: 
                    System.out.println("\n==AGREGA PRODUCTO==");
                    System.out.println("\nIngrese el nombre del producto: ");
                    String name = sc.nextLine();
                    System.out.println("\nIngrese el ID del producto: ");
                    String idSc = sc.nextLine();
                    System.out.println("\nIngrese la cantidad de " + name + " vendidas");
                    int vendidasSc = sc.nextInt();
                    System.out.println("\nIngrese la cantidad de " + name + " disponibles");
                    int disponiblesSc = sc.nextInt();

                    // Cambia estado del producto
                    if (disponiblesSc == 0) {
                        System.out.println("\nNo hay suficientes " + name + " en stock");
                        estadoSc = false;
                    } else {
                        estadoSc = true;
                    }

                    System.out.println("\nIngrese el precio de " + name);
                    float precioSc = sc.nextFloat();
                    System.out.println("\nIngrese si " + name + " es una bebida, postre o snack: ");
                    String categoriaSc = sc.nextLine();

                    // Pasar int y float --> String
                    String strVend = String.valueOf(vendidasSc);
                    String strDisp = String.valueOf(disponiblesSc);
                    String strPrecio = String.valueOf(precioSc);

                    // Agrega info de bebidas
                    if (categoriaSc.equals("Bebida") || categoriaSc.equals("bebida")) {
                        System.out.println("\nIngrese los ml de " + name);
                        float mlSc = sc.nextFloat();
                        System.out.println("\nIngrese el tipo de bebida que es " + name
                                + "\n1.Natural \n2.Con licor \n3.Energética \n4. Agua pura");
                        int tipoSc = sc.nextInt();

                        // Pasar int y float --> String
                        String strMl = String.valueOf(mlSc);
                        String strTipo = String.valueOf(tipoSc);

                        if (tipoSc == 1) {// Info de bebidas naturales
                            // Pepsi pepsi1 = new Pepsi(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                            // p = new Pepsi(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                            // mlSc, categoriaSc);
                            p = new Bebida(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                            //pepsi1.natural(); //propiedades de producto
                            // p = new Cola(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc,
                            // categoriaSc);
                        } else if (tipoSc == 2) {
                            Vino vino = new Vino(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                            p = new Vino(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                            vino.licor(); //propiedades de producto

                        } else if (tipoSc == 3) {
                            Gatorade gatorade = new Gatorade(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc,mlSc, categoriaSc);
                            gatorade.electrico(); //propiedades de producto
                            p = new Gatorade(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                        } else if (tipoSc == 4) {
                            // Agua agua = new Agua(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                            // agua.agua();
                            // p = new Agua(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                            p = new Bebida(idSc, idSc, disponiblesSc, vendidasSc, estadoSc, precioSc, mlSc, categoriaSc);
                        } else {
                            System.out.println("Ingrese una opción válida...");
                        }

                        // Agrega Snacks
                    } else if (categoriaSc.equals("Snack") || categoriaSc.equals("snack")) {
                        System.out.println("\nIngrese los gramos de " + name);
                        float grSc = sc.nextFloat();
                        System.out.println("\nIngrese el sabor de " + name + "\n1.Barbacoa \n2.Picante \n3.Natural");
                        int saborSc = sc.nextInt();

                        String strGr = String.valueOf(grSc);

                        if (saborSc == 1) { // Agrega Snacks de barbacoa
                            System.out.println("\nIngrese el tamaño de " + name + "\n1.Individual \n2.Familiar");
                            int sizeSc = sc.nextInt();
                            if (sizeSc == 1) {
                                BarbInd barbIndSc = new BarbInd(idSc, name, disponiblesSc, vendidasSc, estadoSc,precioSc, grSc, categoriaSc);
                                barbIndSc.individual(); //propiedades de producto
                                barbIndSc.barbacoa(); //propiedades de producto
                                p = new BarbInd(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                            } else if (sizeSc == 2) {
                                BarbFam barbFamSc = new BarbFam(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                                barbFamSc.familiar(); //propiedades de producto
                                barbFamSc.barbacoa(); //propiedades de producto
                                p = new BarbFam(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                            }
                        } else if (saborSc == 2) { // Agrega Snacks picantes
                            System.out.println("\nIngrese el tamaño de " + name + "\n1.Individual \n2.Familiar");
                            int sizeSc = sc.nextInt();
                            if (sizeSc == 1) {
                                PicanteInd picanteInd = new PicanteInd(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                                picanteInd.individual(); //propiedades de producto
                                picanteInd.picante(); //propiedades de producto
                                p = new PicanteInd(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                            } else if (sizeSc == 2) {
                                PicanteFam picanteFam = new PicanteFam(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                                picanteFam.familiar(); //propiedades de producto
                                picanteFam.picante(); //propiedades de producto
                                p = new PicanteFam(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                            }
                        } else if (saborSc == 3) { // Agrega Snacks de sabor natural
                            System.out.println("\nIngrese el tamaño de " + name + "\n1.Individual \n2.Familiar");
                            int sizeSc = sc.nextInt();
                            if (sizeSc == 1) {
                                NatInd natInd = new NatInd(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                                natInd.individual(); //propiedades de producto
                                natInd.picante(); //propiedades de producto
                                p = new NatInd(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                            } else if (sizeSc == 2) {
                                NatFam natFam = new NatFam(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                                natFam.familiar(); //propiedades de producto
                                natFam.picante(); //propiedades de producto
                                p = new NatFam(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, grSc, categoriaSc);
                            }
                        } else {
                            System.out.println("Ingrese una opción válida...");
                        }

                    // Agregar postres
                    } else if (categoriaSc.equals("Postre ") || categoriaSc.equals("postre")) {
                        System.out.println("\nIngrese (1) si " + name + " tiene topping o ingrese (2) si no tiene topping");
                        int toppingSc = sc.nextInt();

                        if (toppingSc == 1) { // postres con topping
                            System.out.println("\nIngrese el empaque de " + name + "\n1.Docena \n2.Media docena");
                            int empaqueSc = sc.nextInt();
                            if (empaqueSc == 1) {
                                ToppingDocena toppingDocena = new ToppingDocena(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, categoriaSc);
                                toppingDocena.topping(); //propiedades de producto
                                toppingDocena.docena(); //propiedades de producto
                                p = new ToppingDocena(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, categoriaSc);
                            } else if (empaqueSc == 2) {
                                ToppingMedia toppingDocena = new ToppingMedia(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, categoriaSc);
                                toppingDocena.topping(); //propiedades de producto
                                toppingDocena.media(); //propiedades de producto
                                p = new ToppingMedia(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, categoriaSc);
                            }
                        } else if (toppingSc == 2) { // postres sin topping
                            System.out.println("\nIngrese el empaque de " + name + "\n1.Docena \n2.Media docena");
                            int empaqueSc = sc.nextInt();
                            if (empaqueSc == 1) {//Postres docena
                                SinToppingDocena toppingDocena = new SinToppingDocena(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, categoriaSc);
                                toppingDocena.sinTopping(); //propiedades de producto
                                toppingDocena.docena(); //propiedades de producto
                                p = new SinToppingDocena(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, categoriaSc);
                            } else if (empaqueSc == 2){ //postres media docena
                                SinToppingMedia toppingDocena = new SinToppingMedia(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc, categoriaSc);
                                toppingDocena.sinTopping(); //propiedades de producto
                                toppingDocena.media(); //propiedades de producto
                                p = new SinToppingMedia(idSc, name, disponiblesSc, vendidasSc, estadoSc, precioSc,categoriaSc);
                            }
                        }
                    } else {
                        System.out.println("Ingrese una opción válida...");
                    }
                    // Agrega productos a lista
                    listaProducto.add(p);

                    // Agregar prodictos a CSV
                    String outputPathClass = "Inventario productos2.csv";

                    try {
                        FileWriter fileWriter = new FileWriter(outputPathClass);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                        // Write header line to the CSV file
                        String header = "id_producto,nombre,cantidad_disponible,cantidad_vendidos,estado,precio,categoria,ml,tipo,gramos,sabor,tamaño,topping,empaque";
                        bufferedWriter.write(header);
                        bufferedWriter.newLine(); // Move to the next line

                        // Write data to the CSV file
                        String[] data = { idSc, name, strDisp, strVend, strPrecio, categoriaSc };
                        String dataLine = String.join(",", data);
                        bufferedWriter.write(dataLine);
                        bufferedWriter.newLine();

                        // Close the BufferedWriter
                        bufferedWriter.close();

                        System.out.println("CSV file created successfully.");

                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("Error occurred while writing to the CSV file.");
                    }
                    break;

                // Buscar producto
                case 2:
                    System.out.println("\n==BUSCAR PRODUCTO==");
                    System.out.println("\nIngrese el ID del producto a buscar: ");
                    String buscarProducto = sc.nextLine();
                    boolean buscarPub = listaProducto.contains(buscarProducto);

                    if (buscarPub) {
                        System.out.println("Información de su producto: ");
                        listaProducto.toString();
                    } else {
                        System.out.println("No se encuentra en el sistema, favor buscar otro.");
                    }
                    break;

                // Lista de productos por categoría
                case 3:
                    System.out.println("==LISTA DE PRODUCTOS POR CATEGORÍA==");
                    System.out.println("\nIngrese la categoría a buscar: ");
                    String buscarCategoria = sc.nextLine();
                    boolean buscarCat = listaProducto.contains(buscarCategoria);

                    if (buscarCat) {
                        System.out.println("Listado de " + buscarCategoria + ": ");
                        listaProducto.toString();
                    } else {
                        System.out.println("No se encuentra en el sistema, favor buscar otro.");
                    }
                    break;

                // Informe
                case 4:
                    System.out.println("\n==INFORME==");

                    // Muestra ventas
                    System.out.println("\nVentas actuales: ");
                    Producto productoVenta = null;
                    // productoVenta.setVentas();

                    // Muestra comisión
                    Postre comisionP = null;
                    comisionP.getComision();
                    System.out.println("\nSu comisión es de: Q" + comisionP);

                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa!");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }
        }
        sc.close();
    }// FIN MAIN

} // FIN PROGRAMA
