/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanjo
 */
public class Pila {
    public Lista elementos = new Lista();
    public void Push (pelicula elemento){
        elementos.agregarNodoFinal(elemento);
        
    }
    public void Pop (){
        elementos.eliminarNodoFinal();
    }
    public void mostrarPila (){
        elementos.mostrarLista();
    }
    
}
