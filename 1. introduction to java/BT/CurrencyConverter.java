package BT;

// BT chuyển đổi tiền tệ:
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 25000;
        int usd = 0;
        System.out.println("Tỷ giá USD hiện tại: 1 USD = " + rate + " VNĐ");

        System.out.println("Nhập vào số USD muốn chuyển đổi: ");
        usd = scanner.nextInt();

        if (usd <= 0) {
            System.out.println("Vui lòng nhập USD lớn hơn 0");
        } else {
            int vnd = usd * rate;
            System.out.println("Số tiền sau khi chuyển đổi là: " + vnd + " VNĐ");
        }
    }

}
