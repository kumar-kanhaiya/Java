import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
    Scanner age = new Scanner(System.in);
        System.out.print("enter your age : ");
        int agee = age.nextInt();
        if(agee>=18){
            System.out.println("elagible for voting ");
        }
        else{
            System.out.println("you are not eligble ");
        }
    }
}
