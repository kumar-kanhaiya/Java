
import java.util.Scanner;

public class cahllenge59_69 {
    public static void main(String[] args) {
//        passwordChecker(1234);
//        numberGuessing(55);
//        multiplicationTable();
//        primeNumber();
        int[] number = { 1,2,3,4,5,6,7,8,9,10};
        int max = Integer.MIN_VALUE;
        for(int num : number ){
           if(max < num){
               max = num;
           }
        }
        System.out.println("the maximum number in array is : " + max);

//        int[] repeat = inputArray();
//        occurrence(repeat , 2);
//        breakProgram();
//        sumOfAllPositiveNumber();
//        onlyEvenNumber();



    }
    public static void passwordChecker(int password ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the password checker \n");
        int number;
        do{
            System.out.print("please enter your password : ");
            number = input.nextInt();
        }while(password != number);
    }
    public static void numberGuessing(int number ){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game ");
        int digit;
        do{
            System.out.print("please enter your number : ");
            digit = input.nextInt();
            if(digit>number){
                System.out.println("you enter a big number please choose smallest number ");
            }
            else if(digit < number){
                System.out.println("you enter a smallest number please choose bigger number ");
            }
            else{
                System.out.println("Hurray ! , You win the game ");
            }
        }while(number !=digit);

    }
    public static void multiplicationTable(){
        System.out.println("Welcome to the multiplication Table Generator \n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number for multiplication table : ");
        int number = input.nextInt();
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }

    public static void primeNumber(){
        System.out.println("Welcome to the prime number checker program \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number for checking prime or not ");
        int number = input.nextInt();
        for(int i = 2 ; i<number/2 ; i++ ){
            if(number%i ==0){
                System.out.println(number + " is not a prime number");
                break;
            }
            else{
                System.out.println(number + " is a prime number ");
                break;
            }
        }
    }

    public static void occurrence(int[] array , int number ){
        int repeat = 0;
        for(int num : array){
            if(number == num ){
                repeat++;
            }
        }
        System.out.println("The occurrence of " + number + " in array is " + repeat);
    }
    public static int[] inputArray(){
        System.out.println("Welcome to the array generator input program");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = input.nextInt();
        int[] num = new int[size];
        for(int i = 0 ; i< num.length ; i++){
            System.out.print("Enter the value of " + (i+1)+ " element  : ");
            num[i] = input.nextInt();
        }
        return num;
    }

    public static void breakProgram(){
        System.out.println("Welcome to the break program");
        Scanner input = new Scanner(System.in);
        String name ;
        for(int i = 0 ; i<1000 ; i++) {
            System.out.println("enter your name , use exit command for exiting the loop no " + i + " : ");
            name = input.next();
//            if(name == "exit"){ this is wrong
//                break;
//            }
            if(name.equals("exit")){
                break;
            }

        }
        System.out.println("your are successfully exit from the loop ");

    }

    public static int sumOfAllPositiveNumber(){
        System.out.println("Welcome to the sum of positive number program");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Number of element you wants to check : ");
        int size = input.nextInt();
        for(int i = 0 ; i<size ; i++){
            System.out.print("Enter your number :  ");
            int number = input.nextInt();
            if(number < 0){
                continue;
            }
            sum+= number;
        }
        System.out.println(sum);
        return sum;
    }

    public static void onlyEvenNumber(){
//        Scanner input = new Scanner(System.in);
        System.out.println("Let us print even number from 1 to 100 using continue \n");
        for(int i = 0 ; i<=100 ; i++){
            if(i%2 !=0){
                continue;
            }
            System.out.print(i + " ");
        }
    }

}
