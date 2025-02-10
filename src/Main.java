import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number \n");
        int a = sh.nextInt();
        for(int i =0 ; i<= a ; i++){
            for(int j=0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}