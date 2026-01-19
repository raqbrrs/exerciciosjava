
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Raquel Barros
 */
public class atribuicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var Scanner = new Scanner(System.in);
        System.err.println("Quanto e 2 + 2? ");
        var result = Scanner.nextInt();
        var isRight = result == 4;
        System.out.printf("O resultado e 4, voce acertou? (%s) ", isRight);
    }
    
}
