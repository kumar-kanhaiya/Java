public class type_converstion {
    public static void main(String[] args) {
    int first_no = 52;
    int second_no = 35;
    int demo ;
    demo = second_no;
    second_no = first_no;
//    demo = first_no;
    first_no  = demo;
        System.out.println("the value of  first no is : " + first_no + "the value of second no is : "
                + second_no);
        int add = first_no + second_no;
        int sub = first_no - second_no;
        int mult = first_no*second_no;
        int devide = first_no/second_no;
        int mod = first_no%second_no;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(devide);
        System.out.println(mod);
    }
}
