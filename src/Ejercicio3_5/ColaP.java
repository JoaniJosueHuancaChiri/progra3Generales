/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_5;

/**
 *
 * @author Sony Vaio
 */

public class ColaP {

    private int max = 40;
    private Paciente v[] = new Paciente[max + 1];
    private int ini, fin;

    public ColaP() {
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

    void adicionar(Paciente elem) {
        if (!esllena()) {
            v[fin + 1] = elem;
            fin = fin + 1;
        } else {
            System.out.println("cola llena");
        }
    }

    Paciente eliminar() {
        Paciente elem = new Paciente();

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
        ColaP aux = new ColaP();

        while (!esvacia()) {
            Paciente jx = eliminar();
            jx.mostrar();
            aux.adicionar(jx);
        }

        vaciar(aux);
    }

    void vaciar(ColaP z) {
        while (!z.esvacia()) {
            adicionar(z.eliminar());
        }
    }
}
