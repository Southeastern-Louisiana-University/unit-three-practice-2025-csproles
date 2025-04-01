import java.util.Scanner;

public class QuotientMethod {

    public static int quotient(int num1, int num2){
        if(num2 == 0){
            System.out.println("Denominator can't equal zero!");
            System.exit(1);
        }
        return num2/num1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = quotient(num1, num2);

        System.out.println(num1 + "/" + num2 + " equals " + result);
    }
}
