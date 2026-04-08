/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_2;

public class MainPalabra {
    public static void main(String[] args) {
        ColaSP p = new ColaSP();
        p.adicionar("hola");
        p.adicionar("potasio");
        p.adicionar("sal");
        p.adicionar("sistemas");
        p.mostrar();
        
        // reordenar la cola de manera que las palabras más cortas queden primero y las más largas al final.
        System.out.println("\nreordenar la cola de manera que las palabras mas cortas queden primero y las mas largas al final");
        ordenarPorLongitud(p);
        p.mostrar();
        
    }
    
    public static void ordenarPorLongitud(ColaSP p) {
        ColaSP ordenada = new ColaSP();

        while (!p.esvacia()) {
            String masCorta = buscarYQuitarMasCorta(p);
            ordenada.adicionar(masCorta);
        }
        p.vaciar(ordenada);
    }

    private static String buscarYQuitarMasCorta(ColaSP p) {
        ColaSP aux = new ColaSP();
        String menor = p.eliminar(); 
        while (!p.esvacia()) {
            String actual = p.eliminar();
            if (actual.length() < menor.length()) {
                aux.adicionar(menor); 
                menor = actual;       
            } else {
                aux.adicionar(actual);
            }
        }
        p.vaciar(aux);
        return menor;
    }
}
