import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int number = input();
        reverseNumber(number);


    }
    public static int input(){
        System.out.println("welcome to the input function");
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number ");
        int inp = sh.nextInt();
        return inp;
    }
    public static void reverseNumber(int number){
        int new_no = 0;
        while(number>0){
            int remender = number%10;
            number /= 10;
            new_no = new_no*10 +  remender;
        }
        System.out.println(new_no);
    }
}
