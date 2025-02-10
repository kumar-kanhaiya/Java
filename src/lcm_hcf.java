import java.util.Scanner;

public class lcm_hcf {
    public static void main(String[] args) {
    int first = input();
    int second = input();

    int i = 1;
    while(i<=second){
        int factor = first *i;
        if(factor%second==0){
            System.out.println("the lcm of this number is " + factor);
            break;
        }
        i++;
    }
    }
    public static int input(){
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number ");
        int input = sh.nextInt();
        return input;
    }
}
