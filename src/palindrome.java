import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int number = input();
        checkPalindrome(number);
        pattern_1(5);
        pattern_2(8);
        pattern_3(8);

    }
    public static int input(){
        Scanner sh = new Scanner(System.in);
        System.out.println("enter your number ");
        int number = sh.nextInt();
        return number ;
    }
    public static void checkPalindrome(int number ){
        int real = number ;
        int copy = 0;
        while(number>0){
            int rem = number%10;
            number/= 10;
            copy = copy*10 + rem;
        }
        if(real == copy){
            System.out.println(real + " is the palindrome number");
        }
        else{
            System.out.println(real + " is not palindrome number");
        }
    }
    public static void pattern_1(int number){
        for(int i =0 ; i<number ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void pattern_2(int number){
        for(int i = number ; i>0 ; i--){
            for(int j = 0 ; j<i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void pattern_3(int number){
        int rows = number;

        while (rows > 0) {
            int j =0;
            while(j<rows){
                System.out.println("  ");
                j++;
            }
            int i =0;
            while(i<=(number-rows)){
                System.out.println("* ");
                i++;
            }
            rows--;
        }
    }
}
