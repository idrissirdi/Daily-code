// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {
    // word word word word(Word[] word)
        // Create a Scanner object for user input
         public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()
        double half = 0.5;
    System.out.println("Looping from 1.0 to 5.0 with rounding methods:");
    for (double i=1.0; i < 5.0; ) {
            i += half;
            System.out.print(" Number: "+i);
            System.out.print(" Ciel: "+Math.ceil(i));
            System.out.print(" Rint: "+Math.rint(i));
            System.out.print(" Round: "+Math.round(i));
           System.out.println();
        }
        System.out.println();
        System.out.println();
        // 2. Prompt the user to enter a decimal number
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.println("Enter a number that is decemicipal please");
        double input1 = input.nextDouble();
        System.out.print("The number you enterend was the glorious "+input1);
        System.out.println();
        System.out.print("Ciel: "+Math.ceil(input1));System.out.print("  Rint: "+Math.rint(input1));System.out.print("  Round: "+Math.round(input1));
        System.out.println();
        // 3. Prompt the user to enter an integer
        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string
        System.out.println();
        System.out.println("Pick a number any number");
        double input2 = input.nextInt();
        System.out.println("Type any word of your choosings");
        String input3 = input.next();
        System.out.println("Was your number "+input2+" ?");
        System.out.println(" You typed "+input3);
        
        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        //    - Convert the decimal number to int (explicit cast) and print
        //    - Convert the integer to a char (ASCII representation) and print
        
        System.out.println("Implicit cast (int → double): "+(double)input2);
        System.out.println("Explicit cast (double → int): "+(int)input1);
        System.out.println("Casting int to char (ASCII): "+(char)input2);
        System.out.println();
        // 5. Prompt the user to enter a character
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        System.out.println("Enter a character ex.$%^&*ABC ");
        String input5 = input.next();
        if (input5.length()>0){
            char input4 = input5.charAt(0);
            System.out.println("ASCII value of "+ input4+ " is "+ (int)input4);}
        else{
            System.out.println("No input provided goof ball");
        }
        
        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String ("hello");
        boolean isEqualReference = (str1==str2);
        boolean isEqualReferenceWithNew = (str1==str3);
        boolean isEqualContent=str1.equals(str3);
        System.out.println("Reference check (str1 == str2): " + isEqualReference); 
        System.out.println("Reference check (str1 == str3): " + isEqualReferenceWithNew); 
        System.out.println("Content check (str1.equals(str3)): " + isEqualContent); 
        // Close the Scanner object
        input.close();
         }
}
