package cr.go.ucr.operaciones;


public class Resta implements IAritmetica
{
    public Resta() {
    }
   
    @Override
     public int realizarOperacion(int a, int b)
    {
    	if(b > a)
    		return -2;//restas deben dar mayor a 0
        return a - b;
    }
}
