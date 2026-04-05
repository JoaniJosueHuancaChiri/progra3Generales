/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_1;

/**
 *
 * @author Sony Vaio
 */

public class ColaInt {

    private int max = 40;
    private int v[] = new int[max + 1];
    private int ini, fin;

    public ColaInt() {
        ini = 0;
        fin = 0;
    }

    boolean esvacia() {
        if (ini == 0 && fin == 0) {
            return true;
        }
        return false;
    }

    boolean esllena() {
        if (fin == max) {
            return true;
        }
        return false;
    }

    int nroelem() {
        return fin - ini;
    }

    void adicionar(int elem) {
        if (!esllena()) {
            v[fin + 1] = elem;
            fin = fin + 1;
        } else {
            System.out.println("cola llena");
        }
    }

    int eliminar() {
        int elem=0;

        if (!esvacia()) {
            elem = v[ini + 1];
            ini = ini + 1;

            if (ini == fin) {
                ini = 0;
                fin = 0;
            }
        } else {
            System.out.println("cola vacia");
        }

        return elem;
    }


    void mostrar() {
        ColaInt aux = new ColaInt();

        while (!esvacia()) {
            int jx = eliminar();
            System.out.println(jx);
            aux.adicionar(jx);
        }

        vaciar(aux);
    }

    void vaciar(ColaInt z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
