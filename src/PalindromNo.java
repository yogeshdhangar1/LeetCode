public class PalindromNo {
    public static boolean isPalindrom(int m){
        if(m<0){
            return false;
        }
        int original = m;
        int reverse = 0;

      while(m!=0){
          int dig = m%10;
          reverse = reverse*10+dig;
          m = m/10;
      }
        return original == reverse;
    }

    public  static void main(String[]args){
        int m = 121;
        System.out.println("Palindrom no is"+isPalindrom(m));

    }
}
