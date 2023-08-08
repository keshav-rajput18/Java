import java.util.Scanner;

public class printsum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=10899; 
            while(n>0){
                int LD=n%10;
                int rev=0;
                rev=(rev*10)+LD;
                n=n/10;
                System.out.print(rev);
            }
        }System.out.println();
        
    }
}