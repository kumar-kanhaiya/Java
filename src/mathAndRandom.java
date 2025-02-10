
public class mathAndRandom {
    public static void main(String[] args) {
        System.out.println( "absolute method :  " + Math.abs(-85));
        System.out.println(" ceil method : " + Math.ceil(55.96));
        System.out.println("floor method : " + Math.floor(55.4));
        System.out.println("round method : " + Math.round(55.96));
        System.out.println("Maximum method : " + Math.max(55,95));
        System.out.println("Minimum method : " + Math.min(55,95));
        System.out.println("Power method : " + Math.pow(5,2));
        System.out.println("Sqrt method  : " + Math.sqrt(5) );
        System.out.println("random method  : " + Math.random());
        // random method uses
        for(int i =0 ; i<10 ; i++){
            double randome = Math.round(Math.random() * 100);
            System.out.println(randome);
        }
    }
}
