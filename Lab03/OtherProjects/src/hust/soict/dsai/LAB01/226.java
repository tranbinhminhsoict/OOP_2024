import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Giải phương trình bậc nhất 1 ẩn: ax + b = 0
        System.out.println("Nhap a va b cho phuong trinh bac nhat ax + b = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh bac nhat la: x = " + x);
        }

        // Giải hệ phương trình bậc nhất 2 ẩn:
        // a11*x1 + a12*x2 = b1
        // a21*x1 + a22*x2 = b2
        System.out.println("Nhap cac he so a11, a12, b1 cho phuong trinh 1:");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        
        System.out.println("Nhap cac he so a21, a22, b2 cho phuong trinh 2:");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2_hePT = scanner.nextDouble();  // Đổi tên biến b2 để tránh trùng

        double D = a11 * a22 - a21 * a12;
        double Dx = b1 * a22 - b2_hePT * a12;
        double Dy = a11 * b2_hePT - a21 * b1;
        
        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        } else {
            double x1 = Dx / D;
            double x2 = Dy / D;
            System.out.println("Nghiem cua he phuong trinh la: x1 = " + x1 + ", x2 = " + x2);
        }

        // Giải phương trình bậc hai: ax^2 + bx + c = 0
        System.out.println("Nhap a, b va c cho phuong trinh bac hai ax^2 + bx + c = 0:");
        double a2 = scanner.nextDouble();
        double b2_PT_bac2 = scanner.nextDouble();  // Đổi tên biến b2 thành b2_PT_bac2
        double c2 = scanner.nextDouble();
        
        if (a2 == 0) {
            if (b2_PT_bac2 != 0) {
                double x = -c2 / b2_PT_bac2;
                System.out.println("Phuong trinh tro thanh bac nhat, nghiem la: x = " + x);
            } else {
                System.out.println("Phuong trinh khong hop le");
            }
        } else {
            double delta = b2_PT_bac2 * b2_PT_bac2 - 4 * a2 * c2;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b2_PT_bac2 / (2 * a2);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b2_PT_bac2 + Math.sqrt(delta)) / (2 * a2);
                double x2 = (-b2_PT_bac2 - Math.sqrt(delta)) / (2 * a2);
                System.out.println("Phuong trinh co hai nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }

        scanner.close();
    }
}
