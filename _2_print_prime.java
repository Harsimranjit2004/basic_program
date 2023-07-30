import java.util.Scanner;

public class _2_print_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for (int n = low; n<=high; n++){
            int count = 0;
            for(int i = 2; i*i <= n; i++){
                count++;
                break;
            }
            if(count == 0){
                System.out.println(n);
            }
        }
    }
    
}
