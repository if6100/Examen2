/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aguinaldo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alejandro
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    //Pruebas de fecha

    //fecha de inicio posterior a la fecha de fin
    
    public void testFechaPosterior() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2023-03-09 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-01-09 10:30", formatter);
        float amount = 300000.0F;
        float expResult = -1.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    //Pruebas de monto
    
    
    //Monto superior a 300000
      @Test
    public void testMontoSuperior() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-02-01 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-04-01 10:30", formatter);
        float amount = 300001.0F;
        float expResult = 75000.250F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    //Monto igual a 300000
         @Test
        public void testMontoIgual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-02-01 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-04-01 10:30", formatter);
        float amount = 300000.0F;
        float expResult = 75000.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
        
    //Monto menor a 300000
     @Test
    public void testMontoMenor() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-02-01 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-04-01 10:30", formatter);
        float amount = 299999.0F;
        float expResult = -2.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }
    
    //Prueba rango
    @Test
    public void testRango() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-11-30 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2024-01-01 10:30", formatter);
        float amount = 300000.0F;
        float expResult = -3.0F;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
    }    
}
