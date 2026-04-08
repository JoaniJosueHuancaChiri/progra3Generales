/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_4;

/**
 *
 * @author Joshelyn
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private int semestre;
    private int notaFinal;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String carrera, int semestre, int notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.semestre = semestre;
        this.notaFinal = notaFinal;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }    
    

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public void mostrar(){
        System.out.println("ESTUDIANTE: "+nombre+", "+edad+", "+carrera+
                ", "+semestre+", "+notaFinal);
    }
    
    
}
