/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.facul.tdd.Calculadora;
/**
 *
 * @author abnis
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSoma(){
        System.out.println("Soma");
        int a = 10;
        int b = 20;
        int expResult = 30;
        int result = Calculadora.Soma(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSubtracao(){
        System.out.println("Subtração");
        int a = 20;
        int b = 10;
        int expResult = 10;
        int result = Calculadora.Subtracao(a, b);
    assertEquals(expResult, result);
    }
    
    @Test
    public void testMultiplicacao(){
         System.out.println("Multiplicação");
        int a = 5;
        int b = 10;
        int expResult = 50;
        int result = Calculadora.Multiplicacao(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDivisao(){
         System.out.println("Divisão");
        float a = 20;
        float b = 10;
        float expResult = 2;
        float result = Calculadora.Divisao(a, b);
        assertEquals(expResult, result,0);
    }
}
