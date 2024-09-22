package BT;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = 0, b = 0, c = 0;
        boolean dk = true;
        System.out.println("++-----CHƯƠNG TRÌNH KIỂM TRA 3 CẠNH CÓ PHẢI TAM GIÁC KHÔNG-----++");
        do {
            try {
                System.out.print("Nhập vào cạnh a: ");
                a = scanner.nextFloat();
                if (a > 0) {
                    dk = false;
                } else {
                    dk = true;
                }
            } catch (Exception e) {
                System.out.println("Lỗi nhập dữ liệu cạnh a!. Yêu cầu nhập lại");
                scanner.next();
            }
        } while (dk);
        //dk đang sai
        do {
            try {
                System.out.print("Nhập vào cạnh b: ");
                b = scanner.nextFloat();
                if (b > 0) {
                    dk = true;
                } else {
                    dk = false;
                }
            } catch (Exception e1) {
                System.out.println("Lỗi nhập dữ liệu cạnh b!. Yêu cầu nhập lại");
                scanner.next();
            }
        } while (!dk);
        //dk đang đúng
        do {
            try {
                System.out.print("Nhập vào cạnh c: ");
                c = scanner.nextFloat();
                if (c > 0) {
                    dk = false;
                } else {
                    dk = true;
                }
            } catch (Exception e2) {
                System.out.println("Lỗi nhập dữ liệu cạnh c!. Yêu cầu nhập lại");
                scanner.next();
            }
        } while (dk);

        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
            if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Ba cạnh bạn nhập: \na = " + a + " \nb = " + b + "\nc = " + c);
                System.out.println("Sẽ thành tam giác vuông cân");
            } else {
                System.out.println("Ba cạnh bạn nhập: \na = " + a + " \nb = " + b + "\nc = " + c);
                System.out.println("Sẽ tạo thành tam giác vuông");
            }
        } else if (a == b && b == c) {
            System.out.println("Ba cạnh bạn nhập: \na = " + a + " \nb = " + b + "\nc = " + c);
            System.out.println("Sẽ tạo thành tam giác đều");
        } else if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
            System.out.println("Ba cạnh bạn nhập: \na = " + a + " \nb = " + b + "\nc = " + c);
            System.out.println("Sẽ tạo thành tam giác cân");
        } else if ((a + b) > c || (a + c) > b || (b + c) > a) {
            System.out.println("Ba cạnh bạn nhập: \na = " + a + " \nb = " + b + "\nc = " + c);
        }
        System.out.println("Sẽ tạo thành tam giác thường");
    }
}
