import java.util.Scanner;

public class PythagorasTheorem {

    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);

        // a2 + b2 = c2
        System.out.println("---------Enter your a and b below---------");
        System.out.print(" Enter your a : ");
        int a = Input.nextInt();

        System.out.print(" Enter your b : ");
        int b = Input.nextInt();

        double c;

       c= RightAngle(a, b);
       System.out.println(c);
        }

        public static double RightAngle(int a, int b){

            double aSq = Math.pow(a, 2);
            double bSq = Math.pow(b , 2);
            double c= Math.sqrt(aSq+bSq);

            return c;

        }
}


