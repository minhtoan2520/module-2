package WalletSystem;

/**
 * HỆ THỐNG VÍ ĐIỆN TỬ - PAYFAILS (LEGACY CODE)
 * Vấn đề: Lỗi tràn bộ nhớ và lỗi toán tử với dữ liệu biên.
 */
public class WalletSystem {
    public static void main(String[] args) {
        System.out.println("--- GIAO DỊCH NẠP TIỀN ---");
        // BUG 1: Khách hàng có 2.147 tỷ, nạp thêm 1 triệu
        long currentBalance = 2147000000L;
        long depositAmount = 1000000L;

        // Thêm if else
        if (depositAmount <= 0) {
            System.out.println("Số tiền nạp phải lớn hơn 0");
        } else {
            // Toán tử + ở đây sẽ gây ra thảm họa
            // long newBalance = currentBalance + depositAmount;

            // có thể thay dòng newBalance ở trên bằng dòng code sau, hàm này chủ động ném
            // ra ngoại
            // lệ:
            long newBalance = Math.addExact(currentBalance, depositAmount);

            System.out.println("Số dư sau khi nạp: " + newBalance + " VNĐ");

            System.out.println("\n--- THỐNG KÊ CHI TIÊU ---");
            // BUG 2: Người dùng mới tinh, chưa từng chi tiêu
            long totalSpent = 0L;
            long transactionCount = 1L;

            // Chương trình sẽ chết (crash) ngay tại dòng này
            long averageSpent = totalSpent / transactionCount;
            System.out.println("Chi tiêu trung bình mỗi giao dịch: " + averageSpent + " VNĐ");

            System.out.println("Đoạn code này sẽ không bao giờ được in ra vì app đã sập!");
        }
    }
}