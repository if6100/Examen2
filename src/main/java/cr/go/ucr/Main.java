package cr.go.ucr;

import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

public class Main {

	public static void main(String[] args) {
	   OperacionAritmetica context;
       context = new OperacionAritmetica( new Sumar() );
       int suma = context.procesar(5,10);
       context = new OperacionAritmetica( new Resta() );
       int resta = context.procesar(20,21);
       context = new OperacionAritmetica( new Multiplicacion() );
       int multip = context.procesar(5,4);
	   context = new OperacionAritmetica( new Division() );
       int divis = context.procesar(5,0);
       
       
       System.out.println("Suma: " + suma );
       System.out.println("Resta: " + resta );
       System.out.println("Multiplicación: " + multip );
	   System.out.println("División: " + divis );
   
       
	}

}
