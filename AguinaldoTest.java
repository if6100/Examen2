/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aguinaldo;

import java.time.LocalDateTime;
import java.time.Month;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Biblioteca
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }

    @Test
    public void testFindbonus() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, Month.NOVEMBER, 30, 8, 30);
        LocalDateTime endDate = LocalDateTime.of(2022, Month.DECEMBER, 30, 9, 30);
        float amount = 30000;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);       
    }

    @Test
    public void testBonus() {
        System.out.println("bonus");
        long moth = 0L;
        float amount = 300000;
        float expResult = 0.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);
    }
    
}
