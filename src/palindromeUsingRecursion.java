import java.util.Scanner;

 class palindromeUsingRecursion {
  public static void main(String[] args) {
   System.out.println("Welcome to the palindrome checker \n");
   Scanner input = new Scanner(System.in);
   System.out.print("Enter your string you want to check: ");
   String str = input.next();
   System.out.println("your string is " + (isPalindrome(str) ? "Palindrome" : "not palindrome"));

  }
  public static boolean isPalindrome(String str){
   if(str.length() <= 1){
    return true;
   }
   int lastPosition = str.length() -1;
   if(str.charAt(0) != str.charAt(lastPosition)){
    return false;
   }
   String newStr = str.substring(1,lastPosition);
   return isPalindrome(newStr);
  }




}
