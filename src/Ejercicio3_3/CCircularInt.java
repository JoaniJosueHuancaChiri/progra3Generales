/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_3;

/**
 *
 * @author Sony Vaio
 */
public class CCircularInt {

    private int max = 20;
    private int v[] = new int[max + 1];
    private int ini, fin;

    public CCircularInt() {
        ini = 0;
        fin = 0;
    }

    int nroelem() {
        if (ini == 0 && fin == 0) {
            return 0;
        } else {
            if (fin > ini) {
                return fin - ini;
            } else {
                return max - ini + fin;
            }
        }
    }

    boolean esvacia() {
        if (nroelem() == 0) {
            return true;
        }
        return false;
    }

    boolean esllena() {
        if (nroelem() == max) {
            return true;
        }
        return false;
    }

    void adicionar(int elem) {
        if (!esllena()) {
            if (fin == max) {
                fin = 1;
            } else {
                fin = fin + 1;
            }
            v[fin] = elem;
        } else {
            System.out.println("cola llena");
        }
    }

    int eliminar() {
        int elem =0;

        if (!esvacia()) {
            ini = ini + 1;
            elem = v[ini];

            if (ini == max) {
                ini = 1;
            }
            if (ini == fin) {
                ini = fin = 0;
            }
        } else {
            System.out.println("cola vacia");
        }

        return elem;
    }

    void mostrar() {
        int n = nroelem();
        for (int i = 1; i <= n; i++) {
            int x = eliminar();
            System.out.println(x);
            adicionar(x);
        }
    }

    void vaciar(CCircularInt z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
