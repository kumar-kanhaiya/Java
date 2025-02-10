import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Welcome to the factorial generator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int number = input.nextInt();
        long factor = factorial(number);
        System.out.println("factorial of your number is : " + factor);

    }
    public static long factorial(int number){
        if(number == 1){
            return 1;
        }
        return number * factorial(number -1 );
    }
}
