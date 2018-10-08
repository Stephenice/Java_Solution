import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        System.out.println("----Welcome To Fibonacci----");
        System.out.print("Enter your Fibonacci number: ");
        int number=Input.nextInt();
        System.out.println("Your Fibonacci number is: " + number);
        int x=Fibonacci(number);
        System.out.println("Fibonacci of "+number+" is: " + x);
    }

    public static int Fibonacci(int number){
        if(number==1){
            return 1;
        }else if(number==2){
            return 1;
        }else {
         return Fibonacci(number-1)+Fibonacci(number-2);
        }
    }
}
