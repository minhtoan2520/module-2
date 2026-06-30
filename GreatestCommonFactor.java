import java.util.Scanner;

//tìm ước số chung lớn nhất
public class GreatestCommonFactor {
    public static void main(String[] args) {

        // khai báo 2 biến a, b và nhập giá trị a, b từ bàn phím
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();

        System.out.println("Enter b: ");
        b = input.nextInt();

        // dùng hàm abs() để trả về giá trị tuyệt đối phần dương của a, b
        a = Math.abs(a);
        b = Math.abs(b);

        // kiểm tra a, b có bằng 0 hay không
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        } else {
            // dùng vòng lặp kiểm tra trong khi a khác b thì:
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("Greatest common factor: " + a);
        }
        input.close();
    }
}