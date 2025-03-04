/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expressoes_regularess;

import java.util.Scanner;

/**
 *
 * @author Caua
 */
public class Expressoes_Regularess {

    /**
     * @param args the command line arguments
     */
    
    public static boolean containsSelect(String input) {
            for (int i = 0; i <= input.length() - 6; i++) { 
                String word = input.substring(i, i + 6);
                if (matchesSelect(word)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean matchesSelect(String word) {
            return (word.charAt(0) == 'S' || word.charAt(0) == 's') &&
                   (word.charAt(1) == 'E' || word.charAt(1) == 'e') &&
                   (word.charAt(2) == 'L' || word.charAt(2) == 'l') &&
                   (word.charAt(3) == 'E' || word.charAt(3) == 'e') &&
                   (word.charAt(4) == 'C' || word.charAt(4) == 'c') &&
                   (word.charAt(5) == 'T' || word.charAt(5) == 't');
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra para verificar:");
        String input = scanner.nextLine();
        
        if (containsSelect(input)) {
            System.out.println("A palavra SELECT foi encontrada.");
        } else {
            System.out.println("A palavra SELECT não foi encontrada.");
        }
        
        scanner.close();
    }

    
}
    

