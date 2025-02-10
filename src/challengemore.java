import java.util.Scanner;

public class challengemore {
    public static void factorial(int x){
        int fact = 1;
        while(x != 1){
            fact = fact * x;
            x--;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
//        factorial(4);
        // question - prime number
        Scanner sh = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = sh.nextInt();
        int i = 2 ;
        int temp = 0;
        while(i<= number/2){
            if(number%i ==0){
                temp++;
                break;
            }
            i++;

        }
        if(temp == 0 && number!=1){
            System.out.println("this is a prime number ");
        }
        else{
            System.out.println("this is not a prime number ");
        }



    }
}
