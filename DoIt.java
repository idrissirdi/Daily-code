// BEGIN
import  java.util.Scanner;
public class DoIt{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a positive number: ");
int input1=input.nextInt();
while(input1< 1){
System.out.println("Enter a positive number: "); 
input1=input.nextInt();

}
System.out.println("Good boy");
}


}
// Declare a variable for user input

// REPEAT AT LEAST ONCE
// DO
//     Prompt the user to enter a positive number
//     Read input
// WHILE (input is negative)

// Display valid input message

// END
