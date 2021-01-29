import java.util.Scanner;

public class DaySoFibolaci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Số đã cho không là số nguyên dương");
        } else if (n == 0 || n == 1) {
            System.out.println("Kết quả: " + n);
        } else {
            int f0 = 0, f1 = 1, fn = 1;

            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            System.out.println("Kết quả: " + fn);
        }
        scanner.close();
    }
}
