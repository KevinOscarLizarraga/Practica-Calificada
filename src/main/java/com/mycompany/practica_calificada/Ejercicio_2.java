
package com.mycompany.practica_calificada;

public class Ejercicio_2 {
    //2.- En un arreglo, mostrar los datos de un usuario (nombre, edad y sexo).
    public static void main(String[]args){
        String nombres []={"Victor", "Ronald","Carolina","Paola"};
        int edad []={25,30,19,22};
        char sexo []={'M','M','M','F'};
        System.out.println("Datos de los usuarios"); 
        System.out.println("NOMBRES EDAD SEXO");
        System.out.println("------- ---- ----");
        for (int u=0;u<nombres.length;u++){
        System.out.println(nombres[u]+ " "+ edad[u] + " " + sexo[u]);
        }
    } 
}
