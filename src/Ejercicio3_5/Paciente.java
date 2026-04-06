/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_5;

/**
 *
 * @author Sony Vaio
 */
public class Paciente {
    private String nombre, especialidad, urgente;
    private int edad;

    public Paciente() {
    }

    public Paciente(String a, int b, String c, String d) {
        nombre=a;
        edad=b;
        especialidad=c;
        urgente=d;
    }
    public void mostrar(){
        System.out.println(nombre+" "+edad+" "+especialidad+" "+urgente);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUrgente() {
        return urgente;
    }

    public void setUrgente(String urgente) {
        this.urgente = urgente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
