import java.util.Scanner;

public class Bai1_baiTapThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số bất kỳ: ");
        int number = Integer.parseInt(scanner.nextLine());
        int choice;
        do {
            System.out.println("*********** MENU ***********");
            System.out.printf("1. In ra các số chẵn và tính tổng trong khoảng 0 đến %d\n",number);
            System.out.printf("2. In ra các số lẻ và tính tổng trong khoảng 0 đến %d\n",number);
            System.out.printf("3. Kiểm tra %d có phải số nguyên tố không\n",number);
            System.out.printf("4. Kiểm tra %d có phải số hoàn hảo không\n",number);
            System.out.printf("5. In ra các số nguyên tố trong khoảng 0 đến %d\n",number);
            System.out.printf("6. In ra các ước số của %d và tính tổng\n",number);
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextByte();
            int sum = 0;

            switch (choice) {
                case 1:
                    System.out.println("");
                    System.out.printf("Các số chẵn từ 0 đến %d là:\n", number);
                    for (int i = 0; i <= number; i++) {
                        if (i % 2 == 0) {
                            sum += i;
                            System.out.printf("%d ", i);
                        }
                    }
                    System.out.println("");
                    System.out.printf("Tổng của các số chẵn từ 0 đến %d là: %d\n\n", number, sum);
                    break;
                case 2:
                    System.out.printf("Các số lẻ từ 0 đến %d là: \n", number);
                    for (int i = 0; i <= number; i++) {
                        if (i % 2 != 0) {
                            sum += i;
                            System.out.printf("%d ", i);
                        }
                    }
                    System.out.println("");
                    System.out.printf("Tổng của các số lẻ từ 0 đến %d là: %d\n\n", number, sum);
                    break;
                case 3:
                    if (checkSoNguyenTo(number)) {
                        System.out.printf("\n%d là số nguyên tố\n\n", number);
                    } else {
                        System.out.printf("\n%d không phải số nguyên tố\n\n", number);
                    }
                    break;
                case 4:
                    System.out.println("");
                    for (int i = 1; i <= number / 2; i++) {
                        if (number % i == 0) {
                            sum += i;
                        }
                    }
                    if (sum == number) {
                        System.out.printf("%d là số hoàn hảo\n\n", number);
                    } else {
                        System.out.printf("%d không phải số hoàn hảo\n\n", number);
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.out.printf("Các số nguyên tố từ 0 đến %d là: \n", number);
                    for (int i = 2; i <= number; i++) {
                        if(checkSoNguyenTo(i)){
                            System.out.printf("%d, ",i);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("");
                    System.out.printf("Các ước của %d là: \n",number);
                    for (int i = 1; i <= number ; i++) {
                        if(number%i==0){
                            System.out.printf("%d, ",i);
                            sum+=i;
                        }
                    }
                    System.out.println("");
                    System.out.printf("Tổng các ước của %d là: %d\n\n",number,sum);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("\n\nVui lòng chọn lại\n\n");
            }
        } while (true);

    }
    public static boolean checkSoNguyenTo(int n) {
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
