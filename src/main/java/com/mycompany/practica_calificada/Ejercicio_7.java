
package com.mycompany.practica_calificada;

import java.util.Scanner;

public class Ejercicio_7 {
    /*7.- Ingresar por teclado 5 notas y mostrar el promedio.*/
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        float notas[]=new float[6]; int con=1;
        float promedio,sum=0;
        while(con<6) {
        System.out.println("Ingrese la " + con + "° nota : "); notas[con]=dato.nextFloat();
        sum=sum+notas[con]; con++;
        }
        promedio=sum/5;
        System.out.println("Su promedio es : " + promedio); 
    }
}
