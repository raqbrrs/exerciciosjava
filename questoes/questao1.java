/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        var name = scanner.next();
        System.out.println("Informe o seu ano de nascimento: ");
        var year = scanner.nextInt();
        var age = baseYear - year;
        System.out.printf("Oiii %s voce tem %s anos \n", name, age );
    }
    
}
