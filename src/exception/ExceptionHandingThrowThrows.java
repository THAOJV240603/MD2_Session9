package exception;

import java.util.Scanner;

public class ExceptionHandingThrowThrows {
    public static void main(String[] args) {
        System.out.println("Bắt đầu chương trình");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int firstNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số thứ hai: ");
        int secondNumber = Integer.parseInt(sc.nextLine());

        int result = divide(firstNumber, secondNumber);
        System.out.println(result);
        System.out.println("Kết thúc chương trình");
    }

    //Chia divide
    //Muốn sd throw thì phải đăng ký throws
    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException {
        if(secondNumber == 0){
            //Ném ra 1 ngoại lệ
            throw new ArithmeticException("Lỗi chia cho số 0");
        }
        int result = firstNumber / secondNumber;
        return result;
    }
}
