/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2_3;

/**
 *
 * @author Sony Vaio
 */
public class Main {
    public static void main(String[] args) {
        PilaN a=new PilaN();
        a.adicionar(5);
        a.adicionar(4);
        a.adicionar(9);
        a.adicionar(2);
        a.adicionar(7);
        a.mostrar();
        System.out.println();
        solucion1(a);
        a.mostrar();
    }

    private static void solucion1(PilaN a) {
        PilaN aux=new PilaN();
        int may=0;
        while (!a.esvacia()) {            
            int p=a.eliminar();
            if (p>may) {
                may=p;
            }
            aux.adicionar(p);
        }
        while (!aux.esvacia()) {            
            int p=aux.eliminar();
            if (p!=may) {
                a.adicionar(p);
            }
        }
    }
}
