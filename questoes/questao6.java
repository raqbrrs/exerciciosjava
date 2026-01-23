/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class questao6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        var number = scanner.nextInt();
        
        System.out.printf("Tabuada do %s: \n", number);
        for(int i = 1;i <= 10;i ++){
            int resultado = number * i;
            System.out.printf("%s \n", resultado);
            
                
        }
        
    }
    
}
