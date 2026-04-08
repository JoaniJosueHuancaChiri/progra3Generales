/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_2;

public class ColaSP {
    private int max = 25;
    private String v[] = new String[max + 1];
    private int ini, fin;

    public ColaSP() {
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

    void adicionar(String elem) {
        if (!esllena()) {
            v[fin + 1] = elem;
            fin = fin + 1;
        } else {
            System.out.println("cola llena");
        }
    }

    String eliminar() {
        String elem = "";

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
        ColaSP aux = new ColaSP();
        System.out.println("Palabras");
        while (!esvacia()) {
            String x = eliminar();
            System.out.println(x);
            aux.adicionar(x);
        }

        vaciar(aux);
    }

    void vaciar(ColaSP z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
