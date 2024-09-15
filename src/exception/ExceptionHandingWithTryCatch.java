package exception;

import java.util.Scanner;

public class ExceptionHandingWithTryCatch {
    public static void main(String[] args) {
        /*
        try{
                    Khối lệnh có thể xảy ra lỗi
            }catch (Exception ex){
                    Khối lệnh xử lý ngoại lệ
                }finally{
                    Khối lệnh luôn được thực hiện dù có Exception hay không
                    }
         */

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Bắt đầu chương trình");
            System.out.println("Chia 2 số");
            System.out.println("Nhập tử số: ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập mẫu số: ");
            int num2 = Integer.parseInt(sc.nextLine());

            int result =  num1/ num2;
            System.out.println(num1 + "/" + num2 + " = " + result);
        }catch (NumberFormatException e){
            System.err.println("Không phải số rồi bạn");
        }catch (Exception exception){
            //In lỗi cho người dùng
            //exception.printStackTrace();
            System.err.println("Không thể chia cho số 0");
        }finally {
            System.out.println("Kết thúc chương trình");
        }

    }
}
