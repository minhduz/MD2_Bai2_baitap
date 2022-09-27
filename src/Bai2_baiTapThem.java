import java.util.Scanner;

public class Bai2_baiTapThem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentID = null,studentName = null,studentPhone = null,
                studentEmail = null,studentAddress = null;
        int studentDOB = 0;
        boolean studentGender = true;
        int choice;
        do {
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Tính tuổi");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Mã sinh viên: ");
                    studentID = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Tên sinh viên: ");
                    studentName = scanner.nextLine();
                    System.out.println("Năm sinh: ");
                    studentDOB = Integer.parseInt(scanner.nextLine());
                    System.out.println("Giới tính: ");
                    studentGender = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Phone: ");
                    studentPhone = scanner.nextLine();
                    System.out.println("Email: ");
                    studentEmail = scanner.nextLine();
                    System.out.println("Địa chỉ: ");
                    studentAddress = scanner.nextLine();
                    break;
                case 2:
                    System.out.printf("Mã sinh viên: %s\n",studentID);
                    System.out.printf("Tên sinh viên: %s\n",studentName);
                    System.out.printf("Năm sinh sinh viên: %d\n",studentDOB);
                    System.out.printf("Giới tính học sinh: %b\n",studentGender);
                    System.out.printf("Phone: %s\n",studentPhone);
                    System.out.printf("Email: %s\n",studentEmail);
                    System.out.printf("Địa chỉ: %s\n",studentAddress);
                    break;
                case 3:
                    System.out.printf("Tuổi của sinh viên là: %s",2022-studentDOB);
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Chọn lại");
            }
        } while (true);
    }
}
