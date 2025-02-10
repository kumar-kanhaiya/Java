import java.util.Scanner;

public class armstrong_no {
    public static void main(String[] args) {
        int number = input();
        armstrongCheck(number);

    }
    public static int input(){
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number");
        int number = sh.nextInt();
        return number;
    }
    public static void armstrongCheck(int number ){
        int real = number;
        int check = 0;
        while(number>0){
            int rem = number%10;
            number /= 10;
            check = check + rem*rem*rem;
//            System.out.println(check);
        }

        if(check == real){
            System.out.println(real + " is the armstrong number ");
        }
        else{
            System.out.println("this is not a armstrong number ");
        }
    }
}
