
package com.mycompany.practica_calificada;

public class Ejercicio_1 {
    //1.- Empleando arreglos, mostrar n productos con sus respectivos precios
    public static void main(String[]args){
        String utiles []={"pelota", "zapatilla","mochila","polo"};
        double precios[]={35.5,89.60,45.99,25.70};
        System.out.println("Lista de Productos y sus precios");
        for (int u=0;u<utiles.length;u++){
        System.out.println(utiles[u]+ " "+ precios[u]);
        }
    }  
}
