import java.util.Scanner;
public class challenge€_4 {
    public static void main(String[] args) {
//    Scanner sh = new Scanner(System.in);
//        System.out.print("enter your number : ");
//    int number = sh.nextInt();
//    if(number>0){
//        System.out.println("number is postive");
//    } else if (number<0) {
//        System.out.println("number is negitive");
//    }
//    else{
//        System.out.println("you enter 0 number ");
//    }
//    }
    Scanner sh = new Scanner(System.in);
//        System.out.print("enter your number ");
//        int number = sh.nextInt();
//        if(number%2 ==0){
//            System.out.println("you enter a even number ");
//        }
//        else{
//            System.out.println("you enter a odd number ");
//        }
//      int a ,b, c;
//        System.out.println("enter three number : ");
//        a = sh.nextInt();
//        b = sh.nextInt();
//        c = sh.nextInt();
//        if(a>b && a>c){
//            System.out.println(a + "is the largest number ");
//        }
//        else if(b>a && b>c){
//            System.out.println(b + "is the largest number ");
//        }
//        else if(c>a && c>b){
//            System.out.println(c + "is the largest number ");
//        }
        System.out.print("enter the year ");
        int year = sh.nextInt();
        if(year%4 ==0 || year%400 ==0){
            if(year%100 !=0){
                System.out.println("you enter a leap year");
            }
            else{
                System.out.println("this is not a leap year");
            }
        }
        else{
            System.out.println("this is not a leap year ");
        }
    }
}
