import java.util.Scanner;
import java.util.Random;
/* Goal: Print initials in large block letters,convert Fahrenheit to celsius
and save,take input from user in a 5 string character, and save in reverse.*/   
public class Assignment1 {
  public static void main(String[] args) {
    int fahrenheit; // declares 
    int max = 16384, min = 32;
    double celsius;
    String snowy, newString;
    System.out.println();
    System.out.println("JJ JJ JJ JJ       A A");
    System.out.println("     JJ         AA   AA");
    System.out.println("     JJ       AA       AA");
    System.out.println("     JJ      AA AA A AA AA");
    System.out.println("JJ   JJ    AA            AA");
    System.out.println("JJ J JJ   AA              AA");


    //Fahrenheit to Celsius/
    Scanner input = new Scanner(System.in); 
    System.out.println("enter a number in fahrenheit");
    fahrenheit = input.nextInt();
    celsius = (fahrenheit - 32) * 5/9; //Conversion equation for fahrenheit to celsius


    //5-char string 
    System.out.println("enter a 5-character string");
    snowy = input.next();
    newString = new StringBuilder(snowy.substring(1, 4)).reverse().toString(); //Remove first and last letters and returns in reverse
    

    //Random number generator
    Random rand = new Random();
    System.out.println("Generated numbers are within "+min+" to "+max);

    //Combining steps 2-4
    System.out.println(celsius + newString + (rand.nextInt(max - min + 1) + 32)); //
    input.close();
  }
}