import java.util.Scanner;
public class Factorial {

    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        System.out.println("----Welcome To Factorial----");
        System.out.print("Enter your Factorial number: ");
        int number=Input.nextInt();
        System.out.println("Your Factorial number is: " + number+"!");
        int x=Factorial(number);
        System.out.println("Factorial of "+number+"!"+" is: " + x);

    }

    public static int Factorial(int number){
      if (number==1){
          return 1;
      }else {
          return number * Factorial(number-1);
      }
    }
}