import java.sql.SQLOutput;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
    // syntex of arrays
//        int[] marks = new int[25];
        int[] marks = { 1,2,3,4,5,6,7,8,9};
        System.out.println(marks[2]);
        for(int i =0 ; i< marks.length ; i++){
            System.out.println(marks[i]);
        }
        System.out.println("searching in array");
        int[] man = new int[5];
        int i =0 ;
        Scanner input = new Scanner(System.in);
        while(i< man.length){
            System.out.println("enter your number ");
            man[i] = input.nextInt();
            i++;
        }
        System.out.println("searching");
        int number = inputt();
        for(int j =0 ; j< man.length ; j++){
            if(man[j] == number){
                System.out.println(number + " is present in arrray");
                break;
            }
            else{
                System.out.println(number + " is not present in array");
                break;
            }
        }

        }
        public static int inputt(){
            Scanner sh = new Scanner(System.in);
            System.out.println("Enter your number");
            int inp = sh.nextInt();
            return inp;

    }

}
