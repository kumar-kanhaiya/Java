import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        GCD(10,15);
        int a = input();
        prime(a);
//        primeByWhile(a);

    }
    public static int GCD(int x , int y){
        int num = 1;
        int i = 0;
        while(num<x){
            if(x%num==0 && y%num==0){
                i = num;
            }
            num++;
        }
        System.out.println("Gcd of " + x +" And " + y + " is " + i);
        return 0;
    }
    public static int input(){
        Scanner sh = new Scanner(System.in);
        System.out.println("welcome to the input function");
        System.out.println("enter your number ");
        int i = sh.nextInt();
        return i;
    }
    public static void prime(int number){
        if(number ==1){
            System.out.println("this is a prime number ");
        }
        for(int i =2 ; i<number/2 ; i++){
            if(number%i==0){
                System.out.println( number +" is not a prime number ");
                break;
            }
            else {
                System.out.println(number +"  is a prime number ");
                break;
            }
        }


    }
    public static void primeByWhile(int number ){
        int i =2;
        while(i<number/2){
            if(number%i==0){
                System.out.println(number +" is not a prime number ");

            }
            else{
                System.out.println(number + " is a prime number ");
                break;
            }

            i++;
        }
    }
}
