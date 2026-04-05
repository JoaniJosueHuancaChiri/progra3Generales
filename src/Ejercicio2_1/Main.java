/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2_1;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilaN a = new PilaN();
        a.adicionar(1);
        a.adicionar(3);
        a.adicionar(5);
        a.adicionar(7);
        a.adicionar(9);
        a.mostrar();
        System.out.println();
        solucion(a);
        a.mostrar();
    }

    private static void solucion(PilaN a) {
        PilaN aux=new PilaN();
        int n = a.nroelem();
        for (int i = 1; i <= n; i++) {
            int p = a.eliminar();
            if (i % 2 != 0) {
                aux.adicionar(p);
            }
        }
        a.vaciar(aux);
    }
}
