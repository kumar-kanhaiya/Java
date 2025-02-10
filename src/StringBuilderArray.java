public class StringBuilderArray {
    public static void main(String[] args) {
        String[] name = new String[] {"Hello" , "! my " , "self " , "kanhaiya "};
        StringBuilder input = new StringBuilder();
        for(String str : name){
            input.append(str).append(" ");
        }
        System.out.println(input);

    }
}
