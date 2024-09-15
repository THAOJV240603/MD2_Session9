package exception;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.inputData(sc);
    }
}
