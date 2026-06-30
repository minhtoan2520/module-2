
//các số nguyên tố nhỏ hơn 100
public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        int n = 2;

        System.out.print("Cac so nguyen to nho hon 100 la: ");

        while (n < 100) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
