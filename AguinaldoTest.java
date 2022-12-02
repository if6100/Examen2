
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casodepruebaexamenii;

import static com.mycompany.casodepruebaexamenii.Aguinaldo.findbonus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author PC
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }

    @Test
    public void testAguinaldo1() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime startDate = LocalDateTime.parse("2022-01-09 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2021-03-09 10:30", formatter);
        
        float amount = 300000;
        Aguinaldo instance = new Aguinaldo();
        float result = instance.findbonus(startDate,endDate,amount );
        
        float expResult = -1;
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAguinaldo2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime startDate = LocalDateTime.parse("2020-12-01 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2021-11-30 10:30", formatter);
        
        float amount = 300000;
        Aguinaldo instance = new Aguinaldo();
        float result = instance.findbonus(startDate,endDate,amount );
        
        float expResult = -2;
        
        assertNotEquals(expResult, result);
    }
    
    @Test
    public void testAguinaldo3() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime startDate = LocalDateTime.parse("2020-05-26 10:30" , formatter);
        LocalDateTime endDate = LocalDateTime.parse("2021-07-12 10:30", formatter);
        
        float amount = 500000;
        Aguinaldo instance = new Aguinaldo();
        float result = instance.findbonus(startDate,endDate,amount );
        
        float expResult = -3;
        
        assertEquals(expResult, result);
    }
    
}
