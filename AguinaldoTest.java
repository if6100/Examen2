/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package examen2.c03471;

import java.time.LocalDateTime;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baigv
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }
    
    @Test
    public void testFindbonusRangoCorrecto() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, 12, 1, 15, 56); 
        LocalDateTime endDate = LocalDateTime.of(2023, 11, 30, 15, 56);
        float amount = 300000.0F;
        float expResult = 300000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testFindbonusFechaInicioPosterior() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, 12, 12, 15, 56); 
        LocalDateTime endDate = LocalDateTime.of(2022, 12, 11, 15, 56); 
        float amount = 300000.0F;
        float expResult = -1.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testFindbonusInicioAntes() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, 01, 01, 15, 56); 
        LocalDateTime endDate = LocalDateTime.of(2022, 03, 07, 15, 56); 
        float amount = 300000.0F;
        float expResult = 75000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testFindbonusFechaInicioIgual() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, 12, 12, 15, 56); 
        LocalDateTime endDate = LocalDateTime.of(2022, 12, 12, 15, 56); 
        float amount = 300000.0F;
        float expResult = 25000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testFindbonusMasDe300000() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, 01, 01, 15, 56); 
        LocalDateTime endDate = LocalDateTime.of(2022, 03, 07, 15, 56); 
        float amount = 300001.0F;
        float expResult = 75000.250F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testFindbonusMenos300000() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, 01, 01, 15, 56); 
        LocalDateTime endDate = LocalDateTime.of(2022, 02, 01, 15, 56);
        float amount = 299999.0F;
        float expResult = -2.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testFindbonusIgual300000() {
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.of(2022, 01, 01, 15, 56); 
        LocalDateTime endDate = LocalDateTime.of(2022, 03, 07, 15, 56); 
        float amount = 300000.0F;
        float expResult = 75000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
}
