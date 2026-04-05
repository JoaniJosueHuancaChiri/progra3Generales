/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_1;

/**
 *
 * @author Sony Vaio
 */
public class Main {
    public static void main(String[] args) {
        ColaInt a=new ColaInt();
        a.adicionar(2);
        a.adicionar(2);
        a.adicionar(3);
        a.adicionar(3);
        a.adicionar(3);
        a.adicionar(5);
        a.adicionar(6);
        a.adicionar(6);
        a.adicionar(8);
        a.mostrar();
        System.out.println();
        solucion(a);
        a.mostrar();
    }

    private static void solucion(ColaInt a) {
        ColaInt aux=new ColaInt();
        int n=a.eliminar();
        aux.adicionar(n);
        while (!a.esvacia()) {            
            int p=a.eliminar();
            if (p!=n) {
                aux.adicionar(p);
                n=p;
            }
        }
        a.vaciar(aux);
    }
}
