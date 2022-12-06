/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanjo
 */
public class Lista {
    private Nodo cabecera,cola;
    
    public Lista(){
        cabecera=null;
        cola=null;
    }
    public boolean listaVasia(){
        if(cabecera==null){
           return true;
        }
        else{
           return false;
        }
    }
    public void agregarNodoFinal(pelicula entrada){
        if(!listaVasia()){
           cola.siguiente = new Nodo(entrada);
           cola=cola.siguiente;
        }
        else{
           cabecera = cola = new Nodo(entrada);
        }
    }
   /* public void agregarNodoInicio(pelicula elemento){
        cabecera=new Nodo(elemento,cabecera);
        if(cola==null){
           cola=cabecera;
        }
    }*/
    public void mostrarLista(){
        Nodo recorrer = cabecera;
        while(recorrer != null){
            System.out.println(recorrer.dato.ToString()+"\n\n"); 
            recorrer=recorrer.siguiente;
        }
    }
    /*public boolean buscarNodo(pelicula elemento){
       Nodo temporal = cabecera;
       while(temporal!=null && temporal.dato!=elemento){
           temporal=temporal.siguiente;
       }
       return temporal!=null;
    }*/
    public void eliminarNodoInicio(){
        Nodo elemento = cabecera;
        if(cabecera==cola){
           cabecera=null;
           cola=null;
        }
        else{
           cabecera=cabecera.siguiente;
        }
    }
    public void eliminarNodoFinal(){
        Nodo temporal = cabecera;
        if(cabecera==cola){
           cabecera=null;
           cola=null;
        }
        else{
           while(temporal.siguiente!=cola){
              temporal=temporal.siguiente;
           } 
        cola=temporal;
        cola.siguiente=null;
        }   
    }
   /* public void eliminarNodoEspecifico(pelicula elemento){
        if(!listaVasia()){
           if(cabecera == cola && elemento == cabecera.dato){
              cabecera=null;
              cola=null;
           }
           else if(elemento == cabecera.dato){
           cabecera=cabecera.siguiente;
           }
           else{
           Nodo anterior,temporal;
           anterior=cabecera;
           temporal=cabecera.siguiente;
           while(temporal.siguiente!=null && temporal.dato!=elemento){
               anterior=anterior.siguiente;
               temporal=temporal.siguiente;
           }
           if(temporal!=null){
               anterior.siguiente=temporal.siguiente;
               if(temporal==cola){
                   cola=anterior;
               }
           }
         }
       }
    }*/
   /* public void ingresarNodoEspecifico(pelicula elemento, int indice){
        Nodo actual, anterior;
        int contador=1;
        actual=cabecera;
        anterior=cabecera;
        if(listaVasia()){
            agregarNodoInicio(elemento);
        }else{
            while(actual!=null && contador != indice){
                
                anterior=actual;
                actual=actual.siguiente;
                
                contador++;
            }
            anterior.siguiente=new Nodo(elemento, actual);
        }
        
    }*/
}
