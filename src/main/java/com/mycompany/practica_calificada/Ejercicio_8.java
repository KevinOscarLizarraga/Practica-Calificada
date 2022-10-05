
package com.mycompany.practica_calificada;

public class Ejercicio_8 {
    /*8.- PROPUESTO: Un cliente realiza la siguiente compra de artefactos, plancha,
    licuadora, lavadora y cocina, si la compra supera los 1200, recibe un descuento
    de 17 %, mostrar el precio de cada artefacto, así como el monto, el descuento y
    el pago total si le corresponde un descuento.*/
    public static void main(String[] args) {
        System.out.println("Precio de los Productos");
        double total = 0;
        double ds = 0;
        double Fi;
        double p = (int) (Math.random()*600+300);
        double li = (int) (Math.random()*400+100);
        double la = (int) (Math.random()*1300+500);
        double c = (int) (Math.random()*600+300);
        total = p + li +la +c;
        if (1700 < total) {
            ds = total * 17/100;
        } else {
            ds = 0;
        }
        Fi = total - ds;
        System.out.println("Precio de la Plancha : " + p);
        System.out.println("Precio de la Licuadora : " + li);
        System.out.println("Precio de la Lavadora : " + la);
        System.out.println("Precio de la Cocina : " + c);
        System.out.println("Monto a pagar : " + total);
        System.out.println("Descuento : " + ds);
        System.out.println("Total a Pagar : " + Fi);
    }
}
