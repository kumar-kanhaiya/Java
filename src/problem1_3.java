import java.util.Scanner;
public class problem1_3 {
    public static void main(String[] args) {
        System.out.println("good morning");
        System.out.println("second program");
        Scanner sh = new Scanner(System.in);
        String name = sh.next();
        System.out.println("good morning " + name);
        int a = sh.nextInt();
        int b = sh.nextInt();
        int sum = a+b;
        System.out.println("the sum of two number is :- " + sum);

    }
}
