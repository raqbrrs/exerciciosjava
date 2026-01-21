
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class questao3 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        var scanner = new Scanner(System.in);
        System.out.println("Informe a base do retangulo: ");
        Double base = scanner.nextDouble();
        System.out.println("Informe a altura do retangulo: ");
        Double height = scanner.nextDouble();
        
        Double area = base * height;
        System.out.printf("A area do retangulo e igual a: %s", area);
        
    }
    
}
