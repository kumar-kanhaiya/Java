import java.util.Scanner;
public class age_challenge {
    public static void main(String[] args) {
    Scanner sh = new Scanner(System.in);
        System.out.print("enter your age : ");
    int year = sh.nextInt();
    if(year<=13){
        System.out.println("CHILD");
    }
    else if(year<20 && year>13){
        System.out.println("TEEN");

    }
    else if(year<60 && year>20){
        System.out.println("ADULT");
    }
    else{
        System.out.println("you are senior citizen");
    }
}
    }
