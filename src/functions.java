public class functions {
public static int addition(int x , int y){
    int sum;
    sum = x + y;
    return sum;
}
public static void pattern(){
    int rows = 0;
    while(rows<5){
        System.out.print("x");

        int i = 0;
        while(i<rows){
            System.out.print(" x");
            i++;
        }
        rows++;
        System.out.println();
    }
}

    public static void main(String[] args) {
        // methods and functions
//        System.out.println(addition(5,7));
    pattern();

    }
}
