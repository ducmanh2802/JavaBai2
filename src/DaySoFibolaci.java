import java.util.Scanner;

public class DaySoFibolaci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        int f0 = 0, f1 = 1, fn = 1;
        if (n <= 0) {
            System.out.println("Số đã cho không là số nguyên dương");
        }
        if (n == 1) {
            System.out.println("Kết quả: " + f1);
        }
        if (n == 2) {
            System.out.println(f1);
            System.out.println(fn);
        }
        if (n >= 3) {
            System.out.println(f1);
            System.out.println(fn);
            for (int i = 1; i <= n - 2; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                System.out.println(fn);
            }
        }
        scanner.close();
    }
}
