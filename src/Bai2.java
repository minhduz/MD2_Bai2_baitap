import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số số nguyên tố ban đầu: ");
        int n = scanner.nextInt();
        int count = 0;
        int N = 2;
        boolean check;
        while (count<n){
            check = false;
            for (int i = 2; i < N; i++) {
                if(N%i==0){
                    check = true;
                }
            }
            if(!check){
                System.out.printf("%d,",N);
                count++;
            }
            N++;
        }
    }
}
