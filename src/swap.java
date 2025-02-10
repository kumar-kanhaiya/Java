import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("enter the first number ");
        int a = sh.nextInt();
        System.out.println("enter your second number ");
        int b = sh.nextInt();
        System.out.println("the value of first and second number without swap is " + a +" " + b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("the value of first and second number after swap is " + a + " "+ b);


    }
}
