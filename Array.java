import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.Scanner;



public class Array{
    public static void main(String[] args) {
        System.out.println("This is my array AKA task 1");
        numarray();
        System.out.println("This is given array but assignend in multi line AKA task 2");
        assignment();
        System.out.println("This is given array but assignend in single line AKA task 3");
        Asingle();
        System.out.println("This is my array but assignend by a loop AKA task 4");
        arrayloop();
        System.out.println("This is my array but it uses characters and a loop wooooo so speacial loop AKA task 5");
        chararray();
        System.out.println("This is an array that take the user input and puts random numbers in it 1-100 AKA task 6");
        inputrandarray();
        System.out.println("Oh no what is happening is this what I think it is a secret task 7 what will happen next");
        button(args);
    }
    public static void  numarray() {
        int[] numbers = {10, 20, 30, 40,50};
       System.out.println(numbers[0]);
       System.out.println(numbers[1]);
       System.out.println(numbers[2]);
       System.out.println(numbers[3]);
       System.out.println(numbers[4]);
    }
    public static void assignment() {
        int[] numbers= new int[5];
        numbers[0]=21;
        numbers[1]=12;
        numbers[2]=22;
        numbers[3]=11;
        numbers[4]=2; 
         System.out.println(numbers[0]);
       System.out.println(numbers[1]);
       System.out.println(numbers[2]);
       System.out.println(numbers[3]);
       System.out.println(numbers[4]);

    }
    public static void Asingle() {
        int[] numbers = {21, 12, 22, 11, 2};
        System.out.println(numbers[0]);
       System.out.println(numbers[1]);
       System.out.println(numbers[2]);
       System.out.println(numbers[3]);
       System.out.println(numbers[4]);
        
        
    }
    public static void arrayloop() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=3*(i+1);
            System.out.println(numbers[i]);
        }
        
    }
    public static void chararray() {
        char[]  charArray= new char[5];
        charArray[0]= 'A';
        System.err.println(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {
          charArray[i]=(char) (charArray[i-1]+2); 
          System.err.println(charArray[i]); 
        }
        

        
    }

     
    public static int numbers(Scanner input){
        while (true){ 
            System.out.println("Enter a single number");
            if (input.hasNextInt()){
                return input.nextInt();
            }
            else{
                System.out.println("Not a number you silly goose");
                input.next();
            }
        }
     }
    public static void inputrandarray() {
         Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("The number you enter will go into the size of an array");
       int input1 = numbers(input);
       int[] finalarray = new int[input1];
       for (int i = 0; i < finalarray.length; i++) {
        finalarray[i]=rand.nextInt(100)+1;
           System.err.println(finalarray[i]);
       }
       input.close();
        
    }

   public static void button(String[] args) {

    openWebpage("https://m.youtube.com/watch?v=gmf8aYFNgyE");
    
   }
    private static void openWebpage(String uriString) {
        try {
            Desktop desktop = Desktop.getDesktop();
            URI uri = new URI(uriString);
            desktop.browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }


}


