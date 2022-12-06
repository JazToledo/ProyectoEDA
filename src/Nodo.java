/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanjo
 */
public class Nodo {
    pelicula dato;
    Nodo siguiente;
    
     public Nodo(pelicula num){
        dato = num;
        
    }
    public Nodo(pelicula num, Nodo x){
        dato = num;  
        siguiente = x;
    }
}
