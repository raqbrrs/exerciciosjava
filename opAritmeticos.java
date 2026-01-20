
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Raquel Barros
 */
public class opAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        var value2 = scanner.nextInt();
        System.out.printf("%s - %s = %s\n", value1, value2, value1 - value2); 

    }
    /*
   -9 - - 22
    -9 + 22 = 13     
    */
    
    /*
    operadores aritmeticos somente substituí-lo (4 operações matemáticas, resto) 
   - caso a gente queira trabalhar com float, é so apenas substituir o nextInt por nextFloat
    */
    
}
