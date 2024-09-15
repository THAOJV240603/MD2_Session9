package exception;

import java.util.Scanner;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //do while: nhập đến khi nào đúng thì thôi
        do{
            try{
                System.out.println("Nhập vào số nguyên bất kỳ:");
                int num = Integer.parseInt(sc.nextLine());
                break;
            }catch(NumberFormatException exception){
                System.err.println("Phải là số");
            }finally {
                System.out.println("Xong phần nhập");
            }
        }while(true);

    }
}
