import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String thangNhap;
        int nam;

        while (true) {
            System.out.print("Nhap thang (ten day du, viet tat hoac so): ");
            thangNhap = scanner.next();
            System.out.print("Nhap nam (4 chu so): ");
            nam = scanner.nextInt();

            int thang = laySoThang(thangNhap);
            if (thang == -1 || nam < 0) {
                System.out.println("Thang hoac nam khong hop le. Vui long nhap lai.");
            } else {
                int soNgay = laySoNgayTrongThang(thang, nam);
                System.out.println("So ngay cua thang " + thangNhap + " nam " + nam + " la: " + soNgay);
                break;
            }
        }
    }

    // Chuyen doi chuoi thang thanh so tuong ung
    public static int laySoThang(String thang) {
        switch (thang.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "may.": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "july.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sep.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1;  // Tra ve -1 neu nhap sai
        }
    }

    // Tinh so ngay trong thang theo nam
    public static int laySoNgayTrongThang(int thang, int nam) {
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (laNamNhuan(nam)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;  // Truong hop khong hop le
        }
    }

    // Kiem tra xem nam co phai la nam nhuan khong
    public static boolean laNamNhuan(int nam) {
        if (nam % 4 == 0) {
            if (nam % 100 == 0) {
                return nam % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
