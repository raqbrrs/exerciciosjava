
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Raquel Barros
 */
public class logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos vc tem? ");
        var age = scanner.nextInt();
        System.out.println("vc é essenciado? ");
        var isEmancipated = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmancipated && age >= 16);
                       
                         
                       
        
        
        System.out.printf("Vc pode dirigir? (%s) \n", !canDrive);
    }
    
}
