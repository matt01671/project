/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;
import java.util.Scanner;
/**
 *
 * @author matthewohalloran
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Nim");
        Scanner keyboard = new Scanner(System.in);
        
        String player_1 = get_player("player_1");
        String player_2 = get_player("player_2");
        
        
        System.out.println("Please enter upper bound of stone removal");
        int upper_bound = keyboard.nextInt();
        
        System.out.println("Please enter initial number of stones");
        int number_of_stones = keyboard.nextInt();
        
        stones_left(number_of_stones);
    }
    
    public static String get_player(String name) {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter %s's name:%n", name);
        return keyboard.nextLine();
    }
    
    public static void stones_left(int number_of_stones) {
        System.out.printf("%d stones left: ", number_of_stones);
        for (int i = 0; i < number_of_stones; i++) {
            System.out.printf("*");
        }      
    }
    
}
    