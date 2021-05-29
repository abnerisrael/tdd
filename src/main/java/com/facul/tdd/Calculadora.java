/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facul.tdd;

/**
 *
 * @author abnis
 */
public class Calculadora {
      public static int Soma(int a, int b){
        int res=a+b;
        return res;
    }

    public static int Subtracao(int a, int b) {
         int res=a-b;
        return res;
    }

    public static int Multiplicacao(int a, int b) {
         int res=a*b;
        return res;
    }
    
    public static float Divisao(float a, float b) {
         float res=a/b;
        return res;
    }
}
