public class int_ {
    public static void main(String[] args) {
        int number = 123;
        int last = number%10;
        number /= 10;
        int lastSecond = number%10;
        number /= 10;
        int lastThird = number%10;
        number /= 10;
        System.out.print(last);
        System.out.print(lastSecond);
        System.out.println(lastThird);
        int sum  = last + lastSecond + lastThird;
        System.out.println("the sum of the digit is : " + sum);
    }
}
