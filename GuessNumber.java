// BEGIN
import  java.util.Scanner;
public class GuessNumber{
    public static void main(String[] args) {
// Choose a hidden number
Scanner input = new Scanner(System.in);
int myforevernum = 3;
// Prompt the user to start guessing
System.out.println("Guess my magical number by putting your numbers in my box 1-100");
int input1=input.nextInt();
while (input1!= myforevernum){
    System.out.println("Wrong");
    if (input1<myforevernum){System.out.println("get down low");}
    else if (input1>myforevernum){System.out.println("High everyday");}
    input1=input.nextInt();
    
}
System.out.println("Good boy");
// Repeat until the correct guess is made
// WHILE (true) DO
//     Ask for a guess
//     Get user input

//     IF the guess is correct THEN
//         Display success message
//         Exit the loop
//     ELSE IF the guess is too high THEN
//         Give a hint
//     ELSE
//         Give a different hint
//     END IF
// END WHILE

// END
}
}