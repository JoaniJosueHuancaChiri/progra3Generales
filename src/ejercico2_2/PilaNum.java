/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercico2_2;

import java.util.Scanner;

public class PilaNum {
        private int max=100;
    private int v[] = new int[max+1];
    private int tope;
    
    PilaNum(){
        tope=0;
    }
    
    // metodos
    boolean esvacia(){
        if(tope == 0){
            return true;
        }
        return false;
    }
    
    boolean esllena(){
        if(tope == max){
            return true;
        }
        return false;
    }
    
    int nroelem(){
        return tope;
    }
    
    void adicionar(int elem){
        if(!esllena()){
            v[tope+1] = elem;
            tope++;
        }else{
            System.out.println("Pila llena.");
        }
    }
    
    int eliminar(){
        int elem = 0;
        if(!esvacia()){
            elem = v[tope];
            tope--;
        }else{
            System.out.println("pila vacia.");
        }
        return elem;
    }
    
    void llenar(int n){
        for(int i=1; i<=n; i++){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            adicionar(num);
        }
    }
    
    void mostrar(){
        PilaNum aux = new PilaNum();
        while(!esvacia()){
            int x = eliminar();  // en x guardamos lo que estamos eliminando
            System.out.println(x);
            aux.adicionar(x);
        }
        vaciar(aux);
        
    }
    
    void vaciar(PilaNum z){
        while(!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
