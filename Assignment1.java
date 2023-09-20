import java.util.Scanner;
import java.util.Random;
/* Goal: Print initials in large block letters,convert Fahrenheit to celsius
and save,take input from user in a 5 string character, and save in reverse.*/   
public class Assignment1 {
  public static void main(String[] args) {
    System.out.println();
    System.out.println("JJ JJ JJ JJ       A A");
    System.out.println("     JJ         AA   AA");
    System.out.println("     JJ       AA       AA");
    System.out.println("     JJ      AA AA A AA AA");
    System.out.println("JJ   JJ    AA            AA");
    System.out.println("JJ J JJ   AA              AA");


    //Fahrenheit to Celsius/
    Scanner input = new Scanner(System.in); {
    System.out.println("enter a number in fahrenheit");
    int fahrenheit = input.nextInt();
    int celsius = (fahrenheit - 32) * 5/9; //Conversion equation for fahrenheit to celsius
    System.out.println("Temperature in Celsius"+celsius);


    //5-char string
    Scanner input = new Scanner(System.in); { 
    System.out.println("enter a 5-character string");
    String snowy = input.nextLine();
    String phrase = "snowy";
    System.out.println("Reversed word");


    //Random number generator
    Random rand = new Random();
    int max=16,384,min=32
    System.out.println("Generated numbers are within "+min+" to "+max);
    System.out.println(rand.nextInt (max - min+1) + min); //Generates numbers between set min and max
    input.close();
      } 
    }    
  }
}