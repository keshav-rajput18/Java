import java.util.Scanner;

public class printlargestof3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter num 1");
            int a = sc.nextInt();
            System.out.println("Enter num 1");
            int b= sc.nextInt();
            System.out.println("Enter num 1");
            int c= sc.nextInt();
            if(a>b&&a>c){
                    System.out.println(a +" is largest no");
                }else if(b>c&&b>a){
                    System.out.println(b +" is greatest no");
                }else if(c>a&&c>b){
                    System.out.println(c+ " is largest no");
                }
            }
        }
        
    }

