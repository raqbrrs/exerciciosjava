/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Raquel Barros
 */
public class bitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var value1 =6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operacao %s (representacao binaria %s)\n", value1, binary1);
        var value2 =5;
        var binary2 = Integer.toBinaryString(value2);
        
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value2, binary2);
        var result = ~value1;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" ~%s + %s = %s (representacao binaria %s)\n", value1, value2, result, binaryResult);
       
    }
    
    /*
    0 = false
    1 = true
    110
    101
    
    ele so precisa de um "true" para retornar o verdadeiro(o msm com o falso, mudando apenas o operador que no caso é o "&"; por isso 111
    110
    101+
    111
    
    forma binaria
    
    -- alem disso outro operador char (^), ele vai comparar cada byte, se os numeros forem iguais ele retorna zero, se os numero forem diferentes ele retorna o um.
   
    
        var value1 =6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operacao %s (representacao binaria %s)\n", value1, binary1);
        var value2 =5;
        var binary2 = Integer.toBinaryString(value2);
        
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value2, binary2);
        var result = value1 ^ value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s ^ %s = %s (representacao binaria %s)\n", value1, value2, result, binaryResult);
    
    
    
    
    --operador complement (~), funciona igual a negação, ele so precisa de um elemento para tranforma-lo em negação, ou seja, numero1, virou 0, 0 virou 1.
    
         var value1 =6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operacao %s (representacao binaria %s)\n", value1, binary1);
        var value2 =5;
        var binary2 = Integer.toBinaryString(value2);
        
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value2, binary2);
        var result = value1 ~ value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s ~ %s = %s (representacao binaria %s)\n", value1, value2, result, binaryResult);
    
    
    --operador shift operations left(<<), deslocamentos de bytes, ele empurra para esquerda os nossos bytes, porem ele acaba deixando dois lugares vazios, completando-o com zeros.
    
        var value1 =6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operacao %s (representacao binaria %s)\n", value1, binary1);
        var value2 =5;
        var binary2 = Integer.toBinaryString(value2);
        
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value2, binary2);
        var result = value1 << value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s << %s = %s (representacao binaria %s)\n", value1, value2, result, binaryResult);
    
    
    
    
    --operador shift rigth(>>), ele desloca pra direita, com zeros,(ele verifica se o numero é positivo ou negativo
   (0=+ e 1=-) porem tem um detalhe importante, quando o numero for negativo inves de ele completar com zeros ele vai completar com 1.
    
        var value1 =6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operacao %s (representacao binaria %s)\n", value1, binary1);
        var value2 =5;
        var binary2 = Integer.toBinaryString(value2);
        
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value2, binary2);
        var result = value1 >> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s >> %s = %s (representacao binaria %s)\n", value1, value2, result, binaryResult);
    
    
    --operador sind e whishift(>>>),empurra p direita, e remove os bytes, nao quer saber se é positivo ou negativo, e sempre vai jogar o zero.
    
        var value1 =6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro numero da operacao %s (representacao binaria %s)\n", value1, binary1);
        var value2 =5;
        var binary2 = Integer.toBinaryString(value2);
        
        System.out.printf("Segundo numero da operacao %s (representacao binaria %s)\n", value2, binary2);
        var result = value1 >>> value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s >>> %s = %s (representacao binaria %s)\n", value1, value2, result, binaryResult);
    */
}
