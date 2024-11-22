import java.util.Arrays;
import java.util.Scanner;

public class SapXepMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int soLuong = scanner.nextInt();

        int[] mang = new int[soLuong];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        System.out.println("Mang ban dau: " + Arrays.toString(mang));

        Arrays.sort(mang);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(mang));

        int tong = 0;
        for (int so : mang) {
            tong += so;
        }
        double trungBinh = (double) tong / soLuong;

        System.out.println("Tong cac phan tu trong mang: " + tong);
        System.out.println("Gia tri trung binh cua cac phan tu trong mang: " + trungBinh);
    }
}
