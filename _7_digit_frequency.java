import java.util.Scanner;

public class _7_digit_frequency {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int no = sc.nextInt();
         int c_no = sc.nextInt();
        int count = 0;
         while(no!=0){
            int temp  = no%10;
            no = no/10;
            if(c_no == temp){
                count++;
                
            }
         }
         System.out.println(count);
    }
}
