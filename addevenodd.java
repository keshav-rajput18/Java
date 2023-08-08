import java.util.Scanner;

public class addevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int num;
        int evensum=0;
        int oddsum=0;
        for(int i =0; i<n; i++){
            num = sc.nextInt();
            if(num%2==0){
            
            evensum = evensum + num;
        }else{
            oddsum=oddsum+num;
        }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
        
    }
    
}
