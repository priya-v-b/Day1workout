public class Reverse {
    public static void main(String[] args) {
        int N=1234;
         int reverse=0;
         System.out.println("Numbers Before Swap:"+N);
        while (N!=0) {
            int rem=N%10;
          reverse=reverse*10+rem;
          N=N/10;
        }
        System.out.println("Numbers After Swap:"+reverse);
    }
}
