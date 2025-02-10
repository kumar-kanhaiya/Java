import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
    int number = input();
    fabnocciSeries(number);

    }
    public static int input(){
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number");
        int number = sh.nextInt();
        return number;
    }
    public static void fabnocciSeries(int number){
        if(number<0) return;
        System.out.print("0");
        if(number==0) return;
        System.out.print(" 1 ");
        int first = 0 , second = 1;
        while(first + second <=number){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
