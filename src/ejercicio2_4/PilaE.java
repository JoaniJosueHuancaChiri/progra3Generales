/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_4;

/**
 *
 * @author Joshelyn
 */
public class PilaE {
    private int max = 50;
    private Estudiante v[] = new Estudiante[max+1];
    private int tope;
    
    PilaE(){
        tope = 0;
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
    
    void adicionar(Estudiante elem){
        if(!esllena()){
            v[tope+1] = elem;
            tope++;
        }else{
            System.out.println("Pila llena.");
        }
    }
    
    Estudiante eliminar(){
        Estudiante elem = new Estudiante();
        if(!esvacia()){
            elem = v[tope];
            tope--;
        }else{
            System.out.println("pila vacia.");
        }
        return elem;
    }
    
//    void llenar(int n){
//        for(int i=1; i<=n; i++){
//            Estudiante c = new Estudiante();
//            c.leer();
//            adicionar(c);
//        }
//    }
    
    void mostrar(){
        PilaE aux = new PilaE();
        while(!esvacia()){
            Estudiante x = eliminar();  // en x guardamos lo que estamos eliminando
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
        
    }
    
    void vaciar(PilaE z){
        while(!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
