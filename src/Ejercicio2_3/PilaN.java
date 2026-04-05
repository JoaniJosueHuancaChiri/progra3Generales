/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2_3;



/**
 *
 * @author Sony Vaio
 */
public class PilaN {
    private int max=90;
    private int v[]=new int[max+1];
    private int tope;
    public PilaN(){
        tope=0;
    }
    boolean esvacia(){
        if (tope ==0) {
            return true;
        }
        return false;
    }
    boolean esllena(){
        return tope==max;
    }
    int nroelem(){
        return tope;
    }
    void adicionar(int d){
        if (!esllena()) {
            v[tope+1]=d;
            tope++;
        }else{
            System.out.println("Pila llena....");
        }
    }
    int eliminar(){
        int d=0;
        if (!esvacia()) {
            d=v[tope];
            tope--;
        }else{
            System.out.println("PILA VACIA....");
        }
        return d;
    }
    void mostrar(){
        PilaN aux=new PilaN();
        while(!esvacia()){
            int x=eliminar();
            System.out.println(x);
            aux.adicionar(x);
        }
        vaciar(aux);
    }
    void vaciar(PilaN z){
        while(!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
    
}
