// BEGIN
import java.util.Random;
import java.util.Scanner;
public class Addition {
public static void main(String[] args) {
// Generate two random numbers between 0 and 9
// SET number1 = RANDOM(0-9)
// SET number2 = RANDOM(0-9)
Random random1 = new Random();
Scanner input = new Scanner(System.in);
int sum1 = random1.nextInt(10);
int sum2 = random1.nextInt(10);
// Prompt user for input
// PRINT "What is " + number1 + " + " + number2 + "? "
// READ answer
System.out.println("what is "+sum1+" + "+sum2+"?");
int input1 = input.nextInt();

while (input1!= (sum1+sum2)){
    
    System.out.println("Wrong");
    System.out.println();
    System.out.println("what is "+sum1+" + "+sum2+"?");
    input1 = input.nextInt();
}
System.out.println("GOOD boy");
// Keep asking until the user gets it right
// WHILE (answer ≠ number1 + number2) DO
//     PRINT "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "
//     READ answer
// END WHILE

// Correct answer message
// PRINT "You got it!"

// END

}
}

  