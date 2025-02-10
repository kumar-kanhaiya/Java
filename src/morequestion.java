import java.util.Scanner;


public class morequestion {
    public static void main(String[] args) {
    Scanner sh = new Scanner(System.in);
        System.out.println("enter three number ");
        int a = sh.nextInt();
        int b = sh.nextInt();
        int c = sh.nextInt();
        if(a>b && a>c){
            System.out.println(a + " is the greatest number ");
        }
        else if(b>a && b>c){
            System.out.println(b + " is the greatest number ");
        }
        else{
            System.out.println(c + " is the greatest number ");
        }
    }
}
