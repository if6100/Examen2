import java.time.LocalDateTime;
import org.junit.Test;
import static org.junit.Assert.*;

// @author Jose Isaac Lazo

public class AguinaldoIT {
    public AguinaldoIT() {
    }

//////////////////////////    Test valores limites correctos   ///////////////////////////////////////////////////////////////////////////////////
    
    //Este test es para saber la cantidad de aguinaldo que se recibe con un mes de trabajo
    @Test
    public void testFindbonus1month() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2021,12,30,10,30);
        float amount = 1000000;
        float expResult = 83333.336F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testBonus1month() {
        System.out.println("bonus");
        long moth = 01;
        float amount = 1000000;
        float expResult = 83333.336F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    //Este test muestra la cantidad de dinero que se recibe de aguinaldo con 12 meses de trabajo
    @Test
    public void testFindbonus12month() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,11,30,10,30);
        float amount = 1000000;
        float expResult = 1000000;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testBonus12month() {
        System.out.println("bonus");
        long moth = 12;
        float amount = 1000000;
        float expResult = 1000000;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    //Este test muestra la cantidad de dinero que se recibe de aguinaldo con 12 meses de trabajo y con un salario minimo de 300 000
    @Test
    public void testFindbonusSalarioMinimo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,11,30,10,30);
        float amount = 300000;
        float expResult = 300000;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testBonusSalarioMinimo() {
        System.out.println("bonus");
        long moth = 12;
        float amount = 300000;
        float expResult = 300000;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    
/////////////////////////// Test valores limites incorrectos  ///////////////////////////////////////////////////////////////////////
    
    //Este test muestra la cantidad de dinero que se recibe de aguinaldo con trabajar 0 meses
    @Test
    public void testFindbonus0month() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2021,12,01,10,30);
        float amount = 1000000;
        float expResult = 83333.336F; //Se recibe la cantidad igual a la de un mes aunque no se haya trabajado todo el mes completo.
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testBonus0month() {
        System.out.println("bonus");
        long moth = 0;
        float amount = 1000000;
        float expResult = 0;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    //Este test muestra la cantidad de dinero que se recibe de aguinaldo con trabajar 13 meses
    @Test
    public void testFindbonus13month() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,12,30,10,30);
        float amount = 1000000;
        float expResult = 1083333.4f;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testBonus13month() {
        System.out.println("bonus");
        long moth = 13;
        float amount = 1000000;
        float expResult = 1083333.4F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }
  
    //Este test muestra el error -1 ya que la fecha inicial es posterior a la fecha de fin del cálculo del bono,
    //en este caso se puso que inicia en diciembre y termina en noviembre, los dos del mismo anno
    @Test
    public void testFindbonusMenos1() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2021,11,01,10,30);
        float amount = 1000000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    //Este test muestra el error -2 ya que el monto calcular el bono debe ser superior o igual 300 000 y se digita un salario de 299 999
    @Test
    public void testFindbonusMenosSalarioMinimo() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,12,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,11,30,10,30);
        float amount = 299999;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }

    //Este test muestra el error -3 ya que la fecha inicio no está rango adecuado 
    //porque el mes es previo a diciembre del año anterior de cálculo y se esta digitando el mes de noviembre.
    @Test
    public void testFindbonusMenos3() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2021,11,01,10,30);
        LocalDateTime endDate = LocalDateTime.of(2022,03,01,10,30);
        float amount = 1000000;
        float expResult = -3;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
}
