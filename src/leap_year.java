import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        System.out.println("program for leap year");
        Scanner sh = new Scanner(System.in);
        int year = sh.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("this is the leap year");
        }
        else{
            System.out.println("this is not a leap year");
        }
        //grade program
        System.out.println("enter your english number ");
        float english = sh.nextFloat();
        System.out.println("enter your math number ");
        float math = sh.nextFloat();
        System.out.println("enter your physics number ");
        float physics = sh.nextFloat();
        System.out.println("enter your chemistry number ");
        float chemistry = sh.nextFloat();
        float total = english + math + physics+ chemistry;
        float avg = total/4f;
        System.out.println("your percentage is " + avg);
        if(avg>=90){
            System.out.println("A Grade");
        }
        else if(avg>=75 && avg<90){
            System.out.println("B Grade");
        }
        else if(avg>=60 && avg<75){
            System.out.println("C Grade");
        }
        else if(avg>=30 && avg<60){
            System.out.println("D Grade");
        }
        else{
            System.out.println("E Grade");
        }
    }
}
