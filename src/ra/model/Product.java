package ra.model;

import java.util.Scanner;

public class Product implements IShop{
    private int id;
    private String name;
    private double price;
    private boolean status;

    //Constructor
    public Product() {
    }

    public Product(int id, String name, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    //Getter, setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập thông tin sản phẩm");
        System.out.print("Id: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Tên sản phẩm: ");
        this.name = sc.nextLine();
        System.out.print("Giá: ");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.print("Trạng thái (true: còn hàng - false: hết hàng): ");
        this.status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("====== Thông tin sản phẩm ======");
        System.out.println("Id: " + this.id);
        System.out.println("Tên sản phẩm: " + this.name);
        System.out.println("Giá: " + this.price + " vnđ");
        System.out.println("Trạng thái: " + (this.status ? "Còn hàng" : "Hết hàng"));
    }
}
