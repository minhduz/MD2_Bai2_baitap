import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.Vẽ hình chữ nhật");
            System.out.println("2.Vẽ hình vuông");
            System.out.println("3.Vẽ tam giác vuông");
            System.out.println("4.Vẽ tam giác cân");
            System.out.println("5.Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("1.Bottom-left");
                    System.out.println("2.Top-left");
                    System.out.println("3.Bottom-right");
                    System.out.println("4.Top-right");
                    int choice2 = scanner.nextInt();
                    switch (choice2){
                        case 1:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (int i = 0; i <= 6; i++) {
                                for (int j = 6-i ; j > 0; j--) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (int i = 0; i <= 6 ; i++) {
                                for (int j = 6-i; j > 0 ; j--) {
                                    System.out.print("   ");
                                }

                                for (int k = 0; k < i; k++) {
                                    System.out.print(" * ");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 4:
                            for (int i = 0; i <= 6; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("   ");
                                }
                                for (int k = 6-i; k > 0 ; k--) {
                                    System.out.print(" * ");
                                }
                                System.out.print("\n");
                            }
                            break;
                    }
                    break;
                case 4:
                    int k = 0;
                    for (int i = 1; i <= 6; ++i, k=0) {
                        for (int j = 1; j <= 6 - i; ++j) {
                            System.out.print("   ");
                        }
                        while ( k != 2 * i - 1){
                            System.out.print(" * ");
                            ++k;
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        } while (true);
    }
}
