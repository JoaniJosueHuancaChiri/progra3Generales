/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_4;

public class MainNum {
    public static void main(String[] args) {
        ColaCN n = new ColaCN();
        n.adicionar(1);
        n.adicionar(8);
        n.adicionar(5);
        n.adicionar(2);
        n.adicionar(4);
        n.adicionar(7);
        n.adicionar(9);
        n.adicionar(6);
        //n.mostrar();
        
        // Separar pares e impares manteniendo el orden relativo Dada una cola circular que
        // contiene números del 0 al 9, reorganizar la cola de manera que:
        // Primero aparezcan todos los números pares
        // Luego todos los números impares
        // Manteniendo el orden original dentro de cada grupo
        reorganizar(n);
        System.out.println("Cola reorganizada");
        n.mostrar();                
    }
    
    public static void reorganizar(ColaCN cola) {
        ColaCN pares = new ColaCN();
        ColaCN impares = new ColaCN();

        while (!cola.esvacia()) {
            int x = cola.eliminar();
            if (x % 2 == 0) {
                pares.adicionar(x);
            } else {
                impares.adicionar(x);
            }
        }
        cola.vaciar(pares);
        cola.vaciar(impares);
    }

}
