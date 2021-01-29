import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh tam giác: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Giá trị nhập vào là 3 cạnh tam giác!");
        } else {
            System.out.println("Giá trị nhập vào không là 3 cạnh tam giác!");
        }
        scanner.close();
    }
}
