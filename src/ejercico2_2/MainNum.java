/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercico2_2;

/**
 *
 * @author Joshelyn
 */
public class MainNum {
    public static void main(String[] args) {
        PilaNum miPila = new PilaNum();
        miPila.adicionar(4);
        miPila.adicionar(3);
        miPila.adicionar(2);
        miPila.adicionar(3);
        miPila.adicionar(4);

        // 
        verificarCapicua(miPila);
    }
    
    public static void verificarCapicua(PilaNum P) {
        PilaNum aux1 = new PilaNum();
        PilaNum aux2 = new PilaNum();
        PilaNum inversa = new PilaNum();

        while (!P.esvacia()) {
            int x = P.eliminar();
            aux1.adicionar(x);
            inversa.adicionar(x);
        }

        while (!aux1.esvacia()) {
            int x = aux1.eliminar();
            P.adicionar(x);
            aux2.adicionar(x);
        }

        boolean esIgual = true;
        while (!aux2.esvacia() && esIgual) {
            if (aux2.eliminar() != inversa.eliminar()) {
                esIgual = false; 
            }
        }

        if (esIgual) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
    }
}
