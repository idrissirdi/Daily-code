import java.util.Scanner;

public class AllInOne {
   
     public static void main(String[] args){
        getinput();
     }

     public static void getinput(){
         Scanner input= new Scanner(System.in);
        System.out.println("Here you will enter 3 numbers");
        int num1=numbers(input);
        int num2=numbers(input);
        int num3=numbers(input);
        processNumbers(num1, num2, num3);
     }    
     public static int numbers(Scanner input){
        while (true){
            
            System.out.println("Enter one of the numbers");
            if (input.hasNextInt()){
                return input.nextInt();
            }
            else{
                System.out.println("Not a number you silly goose");
                input.next();
            }
        }
     }
     public static int sum(int num1, int num2,int num3) {
        return  num1 + num2 + num3;
        }

    public static int max(int num1, int num2,int num3) {
         int max = num1;
         if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
 
        return  max;
        }

    public static int min(int num1, int num2,int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return  min;
        }

      public static double  average(int num1, int num2,int num3) {
        int sum= sum(num1, num2, num3);
        return sum / 3.0;
        }
    public static boolean positive(int num1, int num2,int num3) {
        return (num1 > 0 && num2 > 0 && num3 > 0);
        }


     
     public static void processNumbers(int num1, int num2, int num3) {
        // Calculate sum
        
        
        // Find max
       
 
        // Find min
       
 
        // Calculate average
        
 
        // Check if all numbers are positive
 
        // Print results
        System.out.println("Sum: " + sum(num1, num2, num3));
        System.out.println("Max: " + max(num1, num2, num3));
        System.out.println("Min: " + min(num1, num2, num3));
        System.out.println("Average: " + average(num1, num2, num3));
        System.out.println("All numbers are positive: " + positive(num1, num2, num3));
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum(num1, num2, num3) + ".");
    }
 

}