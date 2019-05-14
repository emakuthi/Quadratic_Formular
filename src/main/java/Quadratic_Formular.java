import java.util.Scanner;

public class Quadratic_Formular {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("This formular will give the answer of a quadratic formular when user enters three variables a, b, and c");

        System.out.println("Please Enter value of variable a: ");

        double a = scan.nextDouble();

        System.out.println("Please Enter value of variable b: ");

        double b = scan.nextDouble();

        System.out.println("Please Enter value of variable c: ");

        double c = scan.nextDouble();

        double result_one = (-1*b + Math.sqrt(b*b-4*a*c))/(2*a);

        double result_two = (-1*b - Math.sqrt(b*b-4*a*c))/(2*a);


        System.out.println("The first result of the quadratic formular with values "+a +","+b + " and "+c+" is"+ " "+result_one);
        System.out.println("The second result of the quadratic formular with values "+a +","+b + " and "+c+" is"+" "+ result_two);
    }
}
