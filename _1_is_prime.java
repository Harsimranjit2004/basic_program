import java.util.Scanner;
// check the given no. is prime or not 


class _1_is_prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for( int i = 0; i < a; i++){
            int n = sc.nextInt();
            int count = 0;
            for(int div = 1; div<=n; div++){
                if(n%div == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("prime no");
            }else{
                System.out.println("not prime");
            }
        }
        System.out.println(a);
    }
}

// better approch
class is_prime_better{
    // root 
    // a no is always till it root value
    public static void check(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for( int i = 0; i < a; i++){
            int n = sc.nextInt();
            int count = 0;
            for(int div = 2; div*div<=n; div++){ // root n = div*div <n 
                if(n%div == 0){
                    count++;
                }
            }
            if(count == 0){
                System.out.println("prime no");
            }else{
                System.out.println("not prime");
            }
        }
        System.out.println(a);
    }
}
// best approch
class prime_best{
    //using root n and break
    public static void check(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for( int i = 0; i < a; i++){
            int n = sc.nextInt();
            int count = 0;
            for(int div = 2; div*div<=n; div++){ // root n = div*div <n 
                if(n%div == 0){
                    count++;
                    break; // break will terminated the loop if it is divisible by any no
                }
            }
            if(count == 0){
                System.out.println("prime no");
            }else{
                System.out.println("not prime");
            }
        }
        System.out.println(a);
    }
}
// as if the no divides it always divide before its root value
// 1-> run the loop to check the no only to root of that no
// 2-> break the loop if one no. divides it 
// 3-> these decrease the time complexity
