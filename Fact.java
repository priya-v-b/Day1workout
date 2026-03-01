public class Fact {
    public static void main(String[] args) {
        int fact=1;
        int N=5;
        for(int i=1;i<=N;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+N+" is : "+fact);
    }
}
