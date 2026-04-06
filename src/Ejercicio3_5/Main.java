/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_5;

/**
 *
 * @author Sony Vaio
 */
public class Main {

    public static void main(String[] args) {
        ColaP a = new ColaP();
        a.adicionar(new Paciente("Pedro", 13, "pediatria", "si"));
        a.adicionar(new Paciente("Lucas", 33, "traumatologia", "no"));
        a.adicionar(new Paciente("Tomas", 27, "Cardiologia", "no"));
        a.adicionar(new Paciente("Oscar", 28, "Neurologia", "si"));
        a.mostrar();
        System.out.println();
        CCircularConsultorio b = new CCircularConsultorio();
        b.adicionar(new Consultorio(111, "pediatria", "si"));
        b.adicionar(new Consultorio(222, "Cardiologia", "si"));
        b.adicionar(new Consultorio(333, "traumatologia", "no"));
        b.mostrar();
        System.out.println("solucion b");
        solucion(b);
        System.out.println("solucion c");
        atender(a, b);
        System.out.println();
        a.mostrar();
        b.mostrar();
        System.out.println("solucion d");
        pacientesU(a);
        System.out.println("solucion e");
        noAtendidos(a, b);
    }

    private static void solucion(CCircularConsultorio b) {
        int n = b.nroelem();
        for (int i = 1; i <= n; i++) {
            Consultorio c = b.eliminar();
            if (c.getDisponible().equalsIgnoreCase("si")) {
                c.mostrar();
            }
            b.adicionar(c);
        }
    }

    private static void atender(ColaP a, CCircularConsultorio b) {
        ColaP aux = new ColaP();
        boolean atendido = false;

        while (!a.esvacia() && !atendido) {
            Paciente p = a.eliminar();

            if (p.getUrgente().equalsIgnoreCase("si")) {
                if (asignarConsultorio(p, b)) {
                    System.out.println("Atendido (urgente):");
                    p.mostrar();
                    atendido = true;
                } else {
                    aux.adicionar(p);
                }
            } else {
                aux.adicionar(p);
            }
        }

        while (!a.esvacia() && !atendido) {
            Paciente p = a.eliminar();

            if (asignarConsultorio(p, b)) {
                System.out.println("Atendido:");
                p.mostrar();
                atendido = true;
            } else {
                aux.adicionar(p);
            }
        }

        a.vaciar(aux);
    }

    private static boolean asignarConsultorio(Paciente p, CCircularConsultorio b) {
        int n = b.nroelem();
        boolean encontrado = false;

        for (int i = 1; i <= n; i++) {
            Consultorio c = b.eliminar();

            if (!encontrado
                    && c.getDisponible().equalsIgnoreCase("si")
                    && c.getEspecialidad().equalsIgnoreCase(p.getEspecialidad())) {

                System.out.println("Asignado a consultorio:");
                c.mostrar();

                c.setDisponible("no");
                encontrado = true;
            }

            b.adicionar(c);
        }

        return encontrado;
    }

    private static void pacientesU(ColaP a) {
        ColaP aux = new ColaP();
        int c = 0;
        while (!a.esvacia()) {
            Paciente p = a.eliminar();
            if (p.getUrgente().equalsIgnoreCase("si")) {
                c++;
            }
            aux.adicionar(p);
        }
        a.vaciar(aux);
        System.out.println("Pacientes urgentes: " + c);
    }

    private static void noAtendidos(ColaP a, CCircularConsultorio b) {
        ColaP aux = new ColaP();

        while (!a.esvacia()) {
            Paciente p = a.eliminar();

            if (!existeConsultorio(p, b)) {
                System.out.println("No atendido:");
                p.mostrar();
            }

            aux.adicionar(p);
        }

        a.vaciar(aux);
    }

    private static boolean existeConsultorio(Paciente p, CCircularConsultorio b) {
        int n = b.nroelem();
        boolean existe = false;

        for (int i = 1; i <= n; i++) {
            Consultorio c = b.eliminar();

            if (c.getEspecialidad().equalsIgnoreCase(p.getEspecialidad())) {
                existe = true;
            }

            b.adicionar(c);
        }

        return existe;
    }

}
