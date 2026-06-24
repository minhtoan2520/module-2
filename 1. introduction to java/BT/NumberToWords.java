package BT;

/* viết chương trình cho máy đo chiều cao cân nặng
 có khả năng đọc các số nguyên không âm có tối đa 3 chữ số */
import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi ");
        int number = scanner.nextInt();

        int ones = number % 10;
        int tens = (number % 100) / 10;
        int hundreds = number / 100;
        String result = "";

        if (number <= 0 || number > 999) {
            System.out.println("số phải từ 1 - 999");
        } else if (number > 0 && number < 1000) {

            // hàng trăm
            switch (hundreds) {
                case 1:
                    result += ("One hundred ");
                    break;
                case 2:
                    result += ("Two hundred ");
                    break;
                case 3:
                    result += ("Three hundred ");
                    break;
                case 4:
                    result += ("Four hundred ");
                    break;
                case 5:
                    result += ("Five hundred ");
                    break;
                case 6:
                    result += ("Six hundred ");
                    break;
                case 7:
                    result += ("Seven hundred ");
                    break;
                case 8:
                    result += ("Eight hundred ");
                    break;
                case 9:
                    result += ("Nine hundred ");
                    break;
            }

            // số 0 - 19
            int lastTwo = number % 100;
            if (lastTwo >= 0 && lastTwo < 20) {
                switch (lastTwo) {
                    case 1:
                        result += ("One");
                        break;
                    case 2:
                        result += ("Two");
                        break;
                    case 3:
                        result += ("Three");
                        break;
                    case 4:
                        result += ("Four");
                        break;
                    case 5:
                        result += ("Five");
                        break;
                    case 6:
                        result += ("Six");
                        break;
                    case 7:
                        result += ("Seven");
                        break;
                    case 8:
                        result += ("Eight");
                        break;
                    case 9:
                        result += ("Nine");
                        break;
                    case 10:
                        result += ("Ten");
                        break;
                    case 11:
                        result += ("Eleven");
                        break;
                    case 12:
                        result += ("Twelve");
                        break;
                    case 13:
                        result += ("Thirteen");
                        break;
                    case 14:
                        result += ("Fourteen");
                        break;
                    case 15:
                        result += ("Fifteen");
                        break;
                    case 16:
                        result += ("Sixteen");
                        break;
                    case 17:
                        result += ("Seventeen");
                        break;
                    case 18:
                        result += ("Eighteen");
                        break;
                    case 19:
                        result += ("Nineteen");
                        break;
                }
            } else {

                // hàng chục
                switch (tens) {
                    case 2:
                        result += ("Twenty ");
                        break;
                    case 3:
                        result += ("Thirty ");
                        break;
                    case 4:
                        result += ("Forty ");
                        break;
                    case 5:
                        result += ("Fifty ");
                        break;
                    case 6:
                        result += ("Sixty ");
                        break;
                    case 7:
                        result += ("Seventy ");
                        break;
                    case 8:
                        result += ("Eighty ");
                        break;
                    case 9:
                        result += ("Ninety ");
                        break;
                }

                // hàng đơn vị
                switch (ones) {
                    case 1:
                        result += ("One");
                        break;
                    case 2:
                        result += ("Two");
                        break;
                    case 3:
                        result += ("Three");
                        break;
                    case 4:
                        result += ("Four");
                        break;
                    case 5:
                        result += ("Five");
                        break;
                    case 6:
                        result += ("Six");
                        break;
                    case 7:
                        result += ("Seven");
                        break;
                    case 8:
                        result += ("Eight");
                        break;
                    case 9:
                        result += ("Nine");
                        break;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
