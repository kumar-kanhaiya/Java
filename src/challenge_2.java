import java.util.Scanner;
public class challenge_2 {
    public static void main(String[] args) {
//        // question -8
//    Scanner input = new Scanner(System.in);
//        System.out.println("enter the first number");
//        int a = input.nextInt();
//        System.out.println("enter the second number");
//        int b = input.nextInt();
//        System.out.println("addition : " + (a+b));
//        System.out.println("subtraction : " + (a-b));
//        System.out.println("multiplication : " + a*b);
//        System.out.println("devide : " + a/b);
//    float a = 12.5f;
//    float b = 13.8f;
//    System.out.println("multiplay : " + a*b);
        //problem 3
//        float length = 152.5f;
//        float bredth = 125.4f;
////        System.out.println("perimeter of rectangle is : " + (length + bredth));
//        float area = (float) (0.5f * length*bredth);
//        System.out.println("area of the traingle " + area);
        float principle = 2500.32f;
        float time = 2;
        float rate = 5.6f;
        System.out.println("simple interest is : " + (principle * rate * time)/100);
        double cmt = principle * Math.pow(( 1+ rate / 100),time);
        System.out.println("compund interest is : " + cmt);
        Scanner degree = new Scanner(System.in);
        System.out.println("enter the degree in feranite");
        float feranite = degree.nextFloat();
        float celcius = (feranite - 32 ) * 5/9;
        System.out.println("celcius is : " + celcius);


    }
}
