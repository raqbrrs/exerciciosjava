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
public class questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       var scanner = new Scanner (System.in);
        System.out.println("Informe um numero: ");
        var number = scanner.nextInt();
        var keepVerify = true;
        
        while(true){
            System.out.println("Informe o numero para verificacao ");
            var toVerify = scanner.nextInt();
            if (toVerify < number){
                System.out.printf("Informe um numero maior que %s \n", number);
                continue;
            }
            var result = toVerify % number;
            keepVerify = result == 0; //atribuição
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        }
    }
    
}
