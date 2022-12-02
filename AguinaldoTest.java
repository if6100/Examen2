import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Daniel Chanto Rojas
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }    
    
    /**
     * Test of main method, of class Aguinaldo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);               
    }
    
    
    //Tests particionamiento equivalente
    @Test
    public void testFindbonus() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2021-12-01 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-11-30 10:30", formatter);
        float amount = 250000;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testFindbonus2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2023-11-30 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-12-01 10:30", formatter);
        float amount = 350000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testFindbonus3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-10-01 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2023-11-30 10:30", formatter);
        float amount = 300000;
        float expResult = -3;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
    //Tests Valores límite
    
    @Test
    public void testFindbonus4() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2021-12-01 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-11-30 10:30", formatter);
        float amount = 299999;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testFindbonus5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2021-12-01 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-11-30 10:30", formatter);
        float amount = 300001;
        float expResult = 25000;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    

    
    
}
