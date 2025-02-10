public class arthematic_operators {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;
        System.out.println("Addition = " + (a+b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("division = " + (a/b));
        System.out.println("subtraction = " + (a-b));
        System.out.println("reminder = " + (a%b));
        float d = 25.56f;
        float c = 24.23f;
        System.out.println("multiplication of float number = " + (d*c));
        System.out.println("Area of triangle ");
        float base = 25f;
        float height = 12;
        float area = 1/2f * (base*height);
        System.out.println("area of trianle is "  + area);
        System.out.println("simple interest");
        float principle = 25000f;
        float time = 2f;
        float rate = 12f;
        float simpleint = (principle*rate*time)/100f;
        System.out.println("simple interst is " + simpleint);
        float cmpint = principle*(1+ rate/100f)*time;
        System.out.println("compound interst is " + cmpint);

    }
}
