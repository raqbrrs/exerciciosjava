/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.raquel.maven01;

import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class Maven01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o seu nome");
        String name = scanner.next();
        System.out.println("informe sua localidade");
        String city = scanner.next();
        System.out.println("informe sua idade");
        int age = scanner.nextInt();
        System.out.println("Ola feio " + name + " voce tem " + age + " anos e esta localizado(a) em " + city );
        
   

    }
}
            