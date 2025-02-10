import java.util.Scanner;
public class methods {
    public static void main(String[] args) {
        multiplicationTable(5);
        sumOdd(25);
        factorial();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int number = input.nextInt();
        int sum = sumOfDigit(number);
        System.out.println("the sum of the digits is " + sum);


    }
    public static void multiplicationTable(int x) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + i * x);
        }
    }
        public static void sumOdd(int y){
            int sum = 0;
            for(int i = 0 ; i<=y ; i++){
                if(i%2!=0){
                    sum = sum + i;
                }
            }
                System.out.println("sum of all odd number is " + sum);
        }
        public static int factorial(){
        Scanner sh = new Scanner(System.in);
        int x = sh.nextInt();
        if(x < 2){
            return 1 ;
        }
        long fact = 1;
        int i =2;
        while(i<=x){
            fact *= i;
            i++;
        }
            System.out.println(fact);
        return 0;
    }
    public static int sumOfDigit(int n){
        int sum = 0;
        while (n > 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    }

