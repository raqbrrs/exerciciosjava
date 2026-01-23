/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Raquel Barros
 */
public class questao7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in).useLocale(Locale.US); //p formatacao decimal 
        System.out.println("Informe a sua altura ");
        Double heigth = scanner.nextDouble();
        System.out.println("Informe seu peso: ");
        Double weight = scanner.nextDouble();
        
        Double imc = (weight / (heigth * heigth));
        
        System.out.printf("Seu IMC e %s \n", imc);
        
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        
        }else if(imc >= 18.5 && imc <= 24.9){
                System.out.println("Peso ideal");
            
        }else if(imc >= 25.0 && imc <= 29.9 ){
            System.out.println("Levemente acima do peso");
            
        }else if(imc >= 30.0 && imc <=34.9 ){
            System.out.println("Obesidade Grau I");
            
        }else if(imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
            
        }else {
            System.out.println("Obesidade III (Morbida)");
        }
        
            
    }
        
    }
    

