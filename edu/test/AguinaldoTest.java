/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AguinaldoTest {
    private String s;
    private String e;
    private float a;
    private float r;
    
    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList(new Object[][]{
            {"2021-12-01 10:30","2022-11-30 10:30",300000,300000}
          , {"2021-12-01 10:30","2022-11-30 10:30",300000,300000}
          , {"2021-12-01 10:30","2022-11-29 10:30",300000,300000}
          , {"abc","2022-11-30 10:30",300000,300000}
          , {"2022-12-01 10:30","2022-11-30 10:30",1000000,-1}
          , {"2021-12-00 10:30","2022-11-30 10:30",300000,300000}
          , {"2021-11-31 10:30","2022-11-30 10:30",1000000,-3}
          , {"2021-11-30 10:30","2022-11-30 10:30",1000000,-3}
          , {"2021-12-01 24:01","2022-11-30 10:30",300000,300000}
          , {"2021-12-01 10:30","abc",300000,300000}
          , {"2021-12-01 10:30","2022-11-31 10:30",300000,-3}
          , {"2021-12-01 10:30","2022-12-01 10:30",300000,-3}
          , {"2021-12-01 10:30","2023-11-30 10:30",300000,-3}
          , {"2021-12-01 10:30","2022-11-30 24:01",300000,300000}
          , {"2021-12-01 10:30","2022-11-30 10:30",299000,-2}
          , {"2021-12-01 10:30","2022-11-30 10:30",301000,301000}});
    }

    public AguinaldoTest(String s,String e, float a, float r) {
        this.s = s;
        this.e = e;
        this.a = a;
        this.r = r;
    }

    @Test
    public void testFindbonus() {
        System.out.println("findbonus");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime startDate = LocalDateTime.parse(s , formatter);
        LocalDateTime endDate = LocalDateTime.parse(e , formatter);
        float amount = a;
        float expResult = r;
        
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testBonus() {
        System.out.println("bonus");
        long moth = 0L;
        float amount = 0.0F;
        float expResult = 0.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);
    }
    
}
