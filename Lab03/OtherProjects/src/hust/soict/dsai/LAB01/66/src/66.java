import java.util.Scanner;

public class CongHaiMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so hang cua ma tran: ");
        int hang = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        int cot = scanner.nextInt();

        int[][] maTran1 = new int[hang][cot];
        int[][] maTran2 = new int[hang][cot];
        int[][] tongMaTran = new int[hang][cot];

        System.out.println("Nhap cac phan tu cho ma tran 1:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "]: ");
                maTran1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhap cac phan tu cho ma tran 2:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "]: ");
                maTran2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                tongMaTran[i][j] = maTran1[i][j] + maTran2[i][j];
            }
        }

        System.out.println("Tong cua hai ma tran la:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(tongMaTran[i][j] + " ");
            }
            System.out.println();
        }
    }
}
