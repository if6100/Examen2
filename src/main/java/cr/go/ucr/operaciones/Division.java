package cr.go.ucr.operaciones;



public class Division implements IAritmetica {
	public Division() {
    }
    @Override
     public int realizarOperacion(int a, int b)
    {
    	if(b == 0)
    		return -3;//no se permite division entre 0
        return (int)(a / b);
    }
}