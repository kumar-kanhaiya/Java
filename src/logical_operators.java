import java.util.Scanner;
public class logical_operators {
    public static void main(String[] args) {
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number ");
        int a = sh.nextInt();
        if(a>0){
            System.out.println("you enter a positive number ");
        }
        else if(a<0){
            System.out.println("you enter a negative number ");
        }
        else{
            System.out.println("you enter 0 which is neither positive nor negative");
        }
        System.out.println("check the number is odd or even");
        if(a%2==0){
            System.out.println("you enter a even number ");
        }
        else{
            System.out.println("you enter a odd number ");
        }

    }
}
