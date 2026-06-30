/**
 * HỆ THỐNG QUÉT AN NINH - CYBERSCAN (LEGACY CODE)
 * Vấn đề: If-else lồng sâu (Arrow Code) và vòng lặp dư thừa.
 */
public class SecurityScannerDEMO {
    public static void main(String[] args) {
        String[] users = { "USER_01", null, "BANNED_01", "USER_02", "ADMIN_01", "USER_03", "USER_04" };
        int[] loginAttempts = { 1, 0, 8, 4, 0, 5, 2 };
        boolean[] isLocked = { false, false, true, false, false, false, false };

        System.out.println("--- BẮT ĐẦU QUÉT HỆ THỐNG ---");
        long startTime = System.nanoTime();

        // MỤC TIÊU 1: Báo động user không bị khóa, không bị ban, nhưng đăng nhập sai >
        // 3 lần.
        // MỤC TIÊU 2: Tìm thấy ADMIN đầu tiên đang online để gửi báo cáo.

        for (int i = 0; i < users.length; i++) {

            // LỖI 1: Tối kỵ trong Clean Code - If lồng nhau 4 tầng (Arrow Anti-pattern)
            if (users[i] != null) {
                if (!users[i].startsWith("BANNED")) {
                    if (isLocked[i] == false) {
                        if (loginAttempts[i] > 3) {
                            System.out.println("Cảnh báo: " + users[i] + " sai mật khẩu " + loginAttempts[i] + " lần.");
                        }
                    }
                }
            }

            // LỖI 2: Dư thừa vòng lặp.
            // Nếu users[i] là null, mã vẫn cố gắng xuống đây kiểm tra tiếp thay vì bỏ qua
            // vòng lặp.
            // Nếu đã tìm thấy ADMIN, hệ thống vẫn tiếp tục quét các user phía sau thay vì
            // dừng lại.
            if (users[i] != null) {
                if (users[i].startsWith("ADMIN")) {
                    System.out.println("Đã tìm thấy Admin hệ thống: " + users[i]);
                    // THIẾU LỆNH ĐIỀU HƯỚNG VÒNG LẶP Ở ĐÂY
                }
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Thời gian quét: " + (endTime - startTime) + " nano giây.");
    }
}