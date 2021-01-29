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
            System.out.println("Kết quả: " + n);
        }
        if (n == 2) {
            System.out.println(f0);
            System.out.println(f1);
        }
        if (n >= 3) {
            int count = 0;
            System.out.println(f0);
            System.out.println(f1);
            System.out.println(fn);
            while (count < n - 3) {
                for (int i = 1; i <= n - 3; i++) {
                    f0 = f1;
                    f1 = fn;
                    fn = f0 + f1;
                    System.out.println(fn);
                    count++;
                }
            }
        }
        scanner.close();
    }
}
