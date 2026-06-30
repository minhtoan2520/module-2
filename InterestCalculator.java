import java.util.Scanner;

//Tính tiền lãi
public class InterestCalculator {
    public static void main(String[] args) {

        // khai báo 3 biến lưu thông tin: tiền gửi, tháng gửi, tỉ lệ lãi suất
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        // sử dụng scanner để nhập dữ liệu
        Scanner input = new Scanner(System.in);

        // nhập số tiền gửi
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        // nhập tháng gửi
        System.out.println("Enter number of months: ");
        month = input.nextInt();

        // nhập tỉ lệ lãi suất
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();

        // tính lãi suất nhận được
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12;
        }
        System.out.println("Total of interest: " + totalInterest);
        input.close();
    }
}
