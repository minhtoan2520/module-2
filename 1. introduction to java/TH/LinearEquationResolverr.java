package TH;

// Giải phương trình bậc nhất ax + b = 0
import java.util.Scanner;

public class LinearEquationResolverr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao so b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem: " + x);
        }
        scanner.close();
    }
}
