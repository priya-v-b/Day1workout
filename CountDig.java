public class CountDig {
    public static void main(String[] args) {
        int N=12345;
        int i=0;
        while (N%10!=0) {
            N=N/10;
            i++;
        }
        System.out.println("Number of Digits Are: "+i);
    }
}
