import java.util.Scanner;

public class last_challenge30 {
    public static void table(int n){
        int i =1;
        while (i<=10){
            System.out.println(n + " * " + i + " = "  + n*i );
            i++;

        }
    }
    public static void main(String[] args) {
        table(5);
        // sum of all odd number
        Scanner sh = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the last number ");
        int last = sh.nextInt();
        int i = 0;
        while(i<=last){
            if(i%2 !=0){
                sum += i ;
            }
            i++;
        }
        System.out.println("the sum of all odd number is : " + sum);

    }
}
