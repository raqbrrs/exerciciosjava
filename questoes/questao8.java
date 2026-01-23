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
public class questao8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int number1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");
        int number2 = scanner.nextInt();

        //validação
        if (number2 < number1) {
            System.out.println("Invalido, digite um numero maior que o primeiro");

        } else {
            System.out.print("Escolha a opcao 1-par ou 2-impar");
            int opcao = scanner.nextInt();
            
            System.out.println("\n Resultado em ordem decrescente");
            
            
            
         for (int i = number2; i >= number1; i--) {
             
             if(opcao == 1){
                 if (i % 2 == 0){
                 System.out.println(i);
             }else if(opcao == 2){
                if (i % 2 != 0){
                 System.out.println(i);
         }
                

            }

        }

    }
}
    }
}