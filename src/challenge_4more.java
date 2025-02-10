import java.util.Scanner;
public class challenge_4more {
    public static void main(String[] args) {
    Scanner sh = new Scanner(System.in);
    int english , math , physics , chemistry , hindi;
        System.out.println("enter english marks : ");
        english = sh.nextInt();
        System.out.print("enter math marks : ");
        math = sh.nextInt();
        System.out.print("enter physics marks : ");
        physics = sh.nextInt();
        System.out.print("enter chemistry marks : ");
        chemistry = sh.nextInt();
        System.out.print("enter hindi marks : ");
        hindi = sh.nextInt();
        float percentage = (float)(  math + physics +
                chemistry + hindi + english)/5;
        if(percentage>90){
            System.out.println("A grade");
        }
        else if(percentage>75){
            System.out.println("B grade");
        }
        else if(percentage>60){
            System.out.println("C grade");
        }
        else if(percentage>30){
            System.out.println("D grade");
        }
        else{
            System.out.println("F grade");
        }
    }
}
