import java.util.Scanner;

public class ASCIIStringGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String A = s.next();
        String B = s.next();
        int sumA=0;
        int sumB=0;
        for(int i=0;i<A.length();i++){
            sumA+=A.charAt(i);
        }
        for(int i=0;i<B.length();i++){
            sumB+=B.charAt(i);
        }
        int c = s.nextInt();
        switch (c){
            case 1:
                X(sumA,sumB);
                break;
            case 2:
                X(A,B);
                break;
            case 3:
                X(sumA,B);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
    public static void X(int A, int B){
        System.out.println(A+B);
    }
    public static void X(String A, String B){
        System.out.println(A+B);
    }
    public static void X(int A, String B){
        int sum=0;
        for(int i=0;i<B.length();i++){
            sum+=B.charAt(i);
        }
        System.out.println(sum+A);
    }
}
