import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        System.out.println("Welcome to the greater number checker \n ");
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number  : ");
        int num1 = input.nextInt();
        System.out.print("now , enter your second number : ");
        int num2 = input.nextInt();
//        if(num1>num2){
//            System.out.println(num1 + " is greater number");
//        }
//        else{
//            System.out.println(num2 + "is greater number");
//        }
        // or we can also write with using ternary operator
        int greaterNumber = num1>num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greater number ");
    }
}
