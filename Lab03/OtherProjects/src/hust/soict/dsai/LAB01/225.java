package JAVA;
import java.util.Scanner;
public class Calculates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("So thu nhat: ");
        Double a = scanner.nextDouble();
        System.out.println("So thu hai: ");
        Double b = scanner.nextDouble();
        System.out.println("sum = "+(a+b));
        System.out.println("difference = " +(a-b));
        System.out.println("product = "+(a*b));
        if (b != 0){
            System.out.println("quotient = " +(a/b));
        } else {
            System.out.println("Khong thoa man dieu kien");
        }
        scanner.close();
    }
}
