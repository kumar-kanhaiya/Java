import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        do {
            System.out.print("please enter your age : ");
            age = input.nextInt();

        } while (age < 0 || age > 100);
        System.out.print("your age is : " + age);

        //for each loop
        String[] array = new String[]{
                "kanhaiya", "ram", "shayam", "mohan", "madan",
                "kartik", "shubham", "pratik", "manish", "keshav"
        };
        printArrayForEach(array);
    }
    public static void printArrayForEach(String[] array){
        for(String name : array){
            System.out.print(name + " ");
        }
    }
}
