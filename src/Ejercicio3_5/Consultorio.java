/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3_5;

/**
 *
 * @author Sony Vaio
 */
public class Consultorio {
    private  int nroConsultorio;
    private String especialidad, disponible;
    public Consultorio(int a, String b, String c){
        nroConsultorio=a;
        especialidad=b;
        disponible=c;
    }
    public void mostrar(){
        System.out.println(nroConsultorio+" "+especialidad+" "+disponible);
    }
    public int getNroConsultorio() {
        return nroConsultorio;
    }

    public void setNroConsultorio(int nroConsultorio) {
        this.nroConsultorio = nroConsultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    
}
