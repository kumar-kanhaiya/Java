import java.util.Scanner;

public class problem_challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your first number");
//        int num1 = input.nextInt();
//        System.out.print("Now , Enter the second number ");
//        int num2 = input.nextInt();
//        int minimumNumber = num1<num2 ? num1 : num2;
//        System.out.println(minimumNumber + " is the smallest number");
        System.out.println("enter your number ");
        int number = input.nextInt();
        evenOdd(number);
        absolute(number);
        studentScore(number);
        System.out.println("enter number for month");
        int month = input.nextInt();
        monthOfTheYear(month);
        System.out.println("enter first number");
        int number1 = input.nextInt();
        System.out.println("enter the second number");
        int number2 = input.nextInt();
        calculator(number1 , number2);
    }
    public static void evenOdd(int number ){
        String output = number%2==0? " is even " : " is odd";
        System.out.println(number + output);
    }
    public static void absolute(int number){
        int output = number<0 ? -1*number : number ;
        System.out.println("distance from the orgin is " + output);
    }
    public static void studentScore(int number ){
        String output = number>80 ? "High" : number>50 && number<80 ? "Moderate" : "low";
        System.out.println(output);
    }
    public static void monthOfTheYear(int number ){
        String object = switch(number){
          case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "Octuber";
            case 11-> "November";
            case 12 -> "December";
            default ->  "invalid";
        };
        System.out.println(object);
    }

    public static void calculator(int number1 , int number2){
        Scanner option = new Scanner(System.in);
        System.out.println("Welcome to the simple calculator Program");
        System.out.println("Enter 1 for addition , 2 for subtraction  , 3 for multiplication , 4 for division");
        int input = option.nextInt();
        switch(input){
            case 1 :
                System.out.println("Welcome to the addition ");
                int add = number1 + number2;
                System.out.println("Addition : " + add);
                break;

            case 2 :
                System.out.println("Welcome to the subtraction ");
                int sub = number1 - number2 ;
                System.out.println("Subtraction : " + sub);
                break;

            case 3 :
                System.out.println("Welcome to the multiplication");
                int multiply = number1 * number2;
                System.out.println("Multiplication : " + multiply);
                break;

            case 4 :
                System.out.println("Welcome to the Division  ");
                int divide = number1 / number2;
                System.out.println("division : " + divide);
                break;

            default:
                System.out.println("you choose a invalid option");
        }

    }

}
