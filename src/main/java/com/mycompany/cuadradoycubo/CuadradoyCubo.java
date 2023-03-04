/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuadradoycubo;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class CuadradoyCubo {

    public static void main(String[] args) {
      int x;
      Scanner entrada = new Scanner(System.in);
      x = entrada.nextInt();
      System.out.println(Math.pow(x,2));
      System.out.println(Math.pow(x,3));
    }
}
