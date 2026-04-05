/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_3;

import java.util.Scanner;

/**
 *
 * @author Sony Vaio
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CCircularInt a = new CCircularInt();
        a.adicionar(10);
        a.adicionar(20);
        a.adicionar(30);
        a.adicionar(40);
        a.adicionar(50);
        a.mostrar();
        System.out.println("Digite k posicines de rotar");
        int k = scanner.nextInt();
        solucion(a, k);
        a.mostrar();
    }

    private static void solucion(CCircularInt a, int k) {
        for (int i = 1; i <= k; i++) {
            int x = a.eliminar(); 
            a.adicionar(x);       
        }
    }
}
