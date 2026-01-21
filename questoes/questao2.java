
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class questao2 {

    
    public static void main(String[] args) {
       var scanner = new Scanner(System.in);
      
        System.out.println("Informe o valor do lado do quadrado: ");
        double side = scanner.nextDouble();
         double area = side * side;
        System.out.printf("A area do quadrado e igual a: %s", area);
    }
    
}

//nem acredito q minha logica tava certa
