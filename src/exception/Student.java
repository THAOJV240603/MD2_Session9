package exception;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputData(Scanner scanner) throws Exception{
        System.out.println("Nhập tên: ");
        this.name = scanner.next();
        System.out.println("Nhập tuổi: ");
        this.age = checkAge(Integer.parseInt(scanner.next()));
    }

    public int checkAge(int age) throws Exception{
        if(age < 17 || age > 90){
            throw new Exception("Tuổi không hợp lệ");
        }
        return age;
    }

}
