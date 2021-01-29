import java.util.Scanner;

public class DaySoFibolaci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Số đã cho không là số nguyên dương");
        } else if (n == 1) {
            System.out.println("Kết quả: " + n);
        } else {
            int f0 = 0, f1 = 1, fn = 1;
            int count = 0;
            System.out.println(f1);
            System.out.println(fn);
            while (count < n - 2) {
                for (int i = 1; i <= n - 2; i++) {
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
