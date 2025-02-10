import java.util.Scanner;

public class newc {
    public static void main(String[] args) {
        System.out.println("Hello World! ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.next();
        System.out.println("Good evening! " + name);
        System.out.print("multiply of your number is : " + multiply());

    }
    public static int sum(int x , int y ){
        return x+y;
    }
    public static int multiply(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();
        return num1*num2;
    }
}
