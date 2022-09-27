public class Bai3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if(checkPrime(i)){
                System.out.printf("%d ",i);
            }
        }
    }
    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}