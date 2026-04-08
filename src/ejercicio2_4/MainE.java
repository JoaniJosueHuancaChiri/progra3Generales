/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_4;

/**
 *
 * @author Joshelyn
 */
public class MainE {
    public static void main(String[] args) {
        PilaE p = new PilaE();
        p.adicionar(new Estudiante("Juan", 21, "Informatica", 3, 82));
        p.adicionar(new Estudiante("Ana", 19, "Informatica", 1, 90));
        p.adicionar(new Estudiante("Carla", 17, "Informatica", 2, 60));
        p.adicionar(new Estudiante("Jose", 18, "Informatica", 1, 71));
        p.adicionar(new Estudiante("Luis", 23, "Informatica", 5, 50));
        //p.mostrar();
        
//        b) Mostrar únicamente los estudiantes que aprobaron(notaFinal ≥ 51), sin perder el
//        contenido original de la pila.
        mostrarAprobados(p);
//        c) Eliminar de la pila a todos los estudiantes menores de 18 años. La pila
//        resultado debe mantener el orden original.
        System.out.println("\nc) Eliminar de la pila a todos los estudiantes menores de 18 anios.");
        eliminarMenores(p);
        p.mostrar();
//        d) Determinar el estudiante con la mayor notaFinal y colocarlo en el tope de la pila,
//        manteniendo el orden del resto.
        System.out.println("\nd) Determinar el estudiante con la mayor notaFinal y colocarlo en el tope de la pila");
        mayorNotaAlTope(p);
        p.mostrar();
    }
    
    // b)
    public static void mostrarAprobados(PilaE p) {
        PilaE aux = new PilaE();
        System.out.println("--- ESTUDIANTES APROBADOS ---");

        while (!p.esvacia()) {
            Estudiante est = p.eliminar();
            if (est.getNotaFinal() >= 51) {
                est.mostrar();
            }
            aux.adicionar(est);
        }
        p.vaciar(aux);
    }
    
    // c)
    public static void eliminarMenores(PilaE p) {
        PilaE aux = new PilaE();
        while (!p.esvacia()) {
            Estudiante est = p.eliminar();
            if (est.getEdad() >= 18) {
                aux.adicionar(est);
            }
        }
        p.vaciar(aux);
    }
    
    // d)
    public static void mayorNotaAlTope(PilaE p) {
        if (p.esvacia()) return;

        PilaE aux1 = new PilaE();
        PilaE aux2 = new PilaE();
        int maxNota = -1;

        while (!p.esvacia()) {
            Estudiante est = p.eliminar();
            if (est.getNotaFinal() > maxNota) {
                maxNota = est.getNotaFinal();
            }
            aux1.adicionar(est);
        }

        Estudiante elMejor = null;
        while (!aux1.esvacia()) {
            Estudiante est = aux1.eliminar();
            if (est.getNotaFinal() == maxNota && elMejor == null) {
                elMejor = est;
            } else {
                aux2.adicionar(est);
            }
        }

        while (!aux2.esvacia()) {
            aux1.adicionar(aux2.eliminar());
        }

        while (!aux1.esvacia()) {
            p.adicionar(aux1.eliminar());
        }

        if (elMejor != null) {
            p.adicionar(elMejor);
        }
    }
}
