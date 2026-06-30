import java.util.Scanner;

//hiển thị số lượng số nguyên tố
public class First20Prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong so nguyen to can hien thi:");

        int number = input.nextInt();
        int count = 0;
        int n = 2;

        System.out.println(number + " so nguyen to la: ");

        while (count < number) {
            boolean check = true;
            int i = 2;
            while (i < n) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
        input.close();
    }
}
