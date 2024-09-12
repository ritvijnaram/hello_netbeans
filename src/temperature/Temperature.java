/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperature;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give the Celcius value: ");
        Scanner sc= new Scanner(System.in);
        double celsius= sc.nextDouble();
        double fahrenheit= 9.0/5.0 * celsius + 32.0;
        
        System.out.println("Fahrenhiet Value as Double: " + fahrenheit);
        
        int cel= sc.nextInt();
        int fah= 9/5 * cel + 32;
        
        System.out.println("Fahrenhiet Value as Integer: " + fah);
        
        
    }
    
}
