package cr.go.ucr;

import cr.go.ucr.operaciones.IAritmetica;

public class OperacionAritmetica 

	{
	     private IAritmetica operacion;
	    // ----------------------------------
	    public OperacionAritmetica(IAritmetica operacion) {
	        this.operacion = operacion;
	    }
	    // ----------------------------------
	     public int procesar(int a, int b) {
	    	 if(a < 0 ||  b < 0)
	    		 return -1;//no se permiten valores negativos
	         return operacion.realizarOperacion(a, b);
	    }
	}