package exception;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chia 2 số");
        System.out.println("Nhập tử số: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập mẫu số: ");
        int num2 = Integer.parseInt(sc.nextLine());

        float result = (float) num1/ (float) num2;
        System.out.println(num1 + "/" + num2 + " = " + result);
        System.out.println("Chia thành công");
    }
}
