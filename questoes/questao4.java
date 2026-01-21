
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class questao4 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa 1: ");
        var name1 = scanner.nextLine();
        System.out.println("Digite o nome da pessoa 2: ");
        var name2 = scanner.nextLine();
        
        
        System.out.println("Digite a idade da pessoa 1: ");
        var age1 = scanner.nextInt();
        System.out.println("Digite a idade da pessoa 2: ");
        var age2 = scanner.nextInt();
        
        var difference = Math.abs(age1 - age2);
        System.out.printf("A diferenca das idades de %s e %s, e igual a: %s", name1, name2, difference);
        
    }
    
}
