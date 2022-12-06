
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author juanjo
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pila pila = new Pila();
        Cola cola = new Cola();
        int posicion = 0, pelicula;
        do {
            System.out.println("1.-Pilas");
            System.out.println("2.-Colas");
            System.out.println("3.-Salir");
            posicion = entrada.nextInt();

            switch (posicion) {

                case 1:
                    int pos = 0;
                    do {
                        System.out.println("Menu Pilas");
                        System.out.println("1.-Push");
                        System.out.println("2.-Pop");
                        System.out.println("3.-Imprimir");
                        System.out.println("4.-Regresar al Menu Principal");
                        pos = entrada.nextInt();
                        switch (pos) {
                            case 1:
                                System.out.println("Dame el Nombre de la Pelicula");
                                String Nombre = entrada.next();
                                System.out.println("Dame el Nombre de la Distribuidora");
                                entrada.next();
                                String Distribuidora = entrada.next();
                                System.out.println("Ingrese la Recaudacion Mundial");
                                double Recaudacion = entrada.nextDouble();
                                System.out.println("Ingrese el Presupuesto");
                                double Presupuesto = entrada.nextDouble();
                                pelicula peli = new pelicula(Nombre, Distribuidora, Recaudacion, Presupuesto);
                                pila.Push(peli);
                                break;
                            case 2:
                                pila.Pop();  //ELIMINAMOS AL ULTIMO ELEMENTO DE LA PILA
                                break;
                            case 3:
                                pila.mostrarPila();
                                break;

                        }
                    } while (pos != 4);
                    break;

                case 2:
                    int posCola = 0;
                    do {
                        System.out.println("Menu Cola");
                        System.out.println("1.-Insertar");
                        System.out.println("2.-Extraer");
                        System.out.println("3.-Mostrar");
                        System.out.println("4.-Regresar a Menu Principal");
                        posCola = entrada.nextInt();
                        switch (posCola) {
                            case 1:
                                System.out.println("Dame el Nombre de la Pelicula");
                                String Nombre = entrada.next();
                                System.out.println("Dame el Nombre de la Distribuidora");
                                entrada.next();
                                String Distribuidora = entrada.next();
                                System.out.println("Ingrese la Recaudacion Mundial");
                                double Recaudacionn = entrada.nextDouble();
                                System.out.println("Ingrese el Presupuesto");
                                double Presupuesto = entrada.nextDouble();
                                pelicula peli = new pelicula(Nombre, Distribuidora, Recaudacionn, Presupuesto);
                                cola.Push(peli);
                                break;
                            case 2:
                                cola.EliminarAlInicio();
                                break;
                            case 3:
                                cola.mostrarCola();
                                break;
                        }
                    }while (posCola !=4);
                    break;
            }

        } while (posicion != 3);
    }
}
