import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Số đã cho không là số nguyên dương");
        } else if (n == 0 || n == 1) {
            System.out.println("Kết quả giai thừa: " + 1);
        } else {
            int result  =1;
            for (int i = 2; i <= n; i++) {
                result *=i;
            }
            System.out.println("Kết quả giai thừa: " + result);
        }
        scanner.close();
    }
}
