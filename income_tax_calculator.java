import java.util.Scanner;

public class income_tax_calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income<500000){
            System.out.println("0% Tax");
        }else if(500000<income && income<1000000){
            System.out.println("20% Tax");
        }else{
            System.out.println("30% Tax");
        }
    }
}