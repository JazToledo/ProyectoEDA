
public class pelicula {       //CREAMOS NUESTRO OBJETO

    public String Nombre, Distribuidora;

    public double RecaudacionMundial, Presupuesto;

    public pelicula(String Nombre, String Distribuidora, double RecaudacionMundial, double Presupuesto) {
        this.Nombre = Nombre; //this hace referencia al contexto del objeto 
        this.Distribuidora = Distribuidora;
        this.Presupuesto = Presupuesto;
        this.RecaudacionMundial = RecaudacionMundial;
    }
    public String ToString (){  //MOSTRAMOS LOS DATOS DEL OBJETO CON FORMATO
        return "Nombre: " + this.Nombre + "\nDistribuidora: " + this.Distribuidora
                + "\nRecaudacion Mundial: " + this.RecaudacionMundial + "\nPresupuesto: " + this.Presupuesto;
    }
}
