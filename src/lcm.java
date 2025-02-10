import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int first = input();
        int second = input();
        int i = 1;
        while(i<=second){
            int factor = first * i;
            if(factor % second ==0){
                System.out.println("the lcm of the two number is :"
                 + factor );
                break;
            }
            i++;

        }
    }
    public static int input(){
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number ");
        int inp = sh.nextInt();
        return inp;
    }
}
