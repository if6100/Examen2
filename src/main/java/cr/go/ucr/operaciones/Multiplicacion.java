package cr.go.ucr.operaciones;


public class Multiplicacion implements IAritmetica {
	public Multiplicacion() {
    }
    @Override
     public int realizarOperacion(int a, int b)
    {
        return a * b;
    }
}