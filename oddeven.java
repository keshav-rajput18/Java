import java.util.*;

public class oddeven {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if(a%2==0){
                System.out.println("Number is EVEN");
            }else{
                System.out.println("Number is ODD");
            }
        }
    }
}