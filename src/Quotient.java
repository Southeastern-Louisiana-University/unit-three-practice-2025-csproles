import java.util.Scanner;

public class Quotient {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num2 == 0){
            System.out.println("Denominator can't equal zero!");
        }
        else {
            System.out.println(num1 + "/" + num2 + " is " + (num1 / num2));
        }
    }
}
