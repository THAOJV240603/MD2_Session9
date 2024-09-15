package ra.run;


import ra.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    private static List<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("======== MENU ========\n" +
                    "1. Thêm mới sản phẩm\n" +
                    "2. Danh sách sản phẩm\n" +
                    "3. Sắp xếp sản phẩm theo giá tăng dần\n" +
                    "4. Sắp xếp sản phẩm theo giá giảm dần\n" +
                    "5. Cập nhật sản phẩm\n" +
                    "6. Xóa sản phẩm\n" +
                    "7. Thoát");
            System.out.println("Mời bạn chọn 1 -7");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    //Thêm mới
                    System.out.println("Thêm mới sản phẩm");
                    Product product = new Product();
                    product.inputData(sc);
                    products.add(product);
                    break;
                case 2:
                    //Danh sách
                    System.out.println("Danh sách sản phẩm:");
                    for (Product product1 : products) {
                        product1.displayData();
                    }
                    break;
                case 3:
                    //Sắp xếp theo giá tăng dần
                    products.sort(new Comparator<Product>() {

                        @Override
                        public int compare(Product o1, Product o2) {
                            //Ép kiểu dữ liệu double xuống int
                            return (int) (o1.getPrice() - o2.getPrice());
                        }
                    });
                    System.out.println("Danh sách sản phẩm theo giá tăng dần:");
                    for (Product product1 : products) {
                        product1.displayData();
                    }
                    break;
                case 4:
                    //Sắp xếp giảm dần
                    products.sort(new Comparator<Product>() {

                        @Override
                        public int compare(Product o1, Product o2) {
                            //Ép kiểu dữ liệu double xuống int
                            return (int) (o2.getPrice() - o1.getPrice());
                        }
                    });
                    System.out.println("Danh sách sản phẩm theo giá giảm dần:");
                    for (Product product1 : products) {
                        product1.displayData();
                    }
                    break;
                case 5:
                    //Cập nhật
                    //Bước 1: Nhập vào id sp cần sửa
                    System.out.print("Nhập vào mã sản phẩm cần cập nhật: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    //Bước 2: loop duyệt qua list tìm phần tử cần sửa
                    for (Product product1 : products) {
                        if (product1.getId() == idUpdate) {
                            product1.inputData(sc);
                        }
                    }
                    break;
                case 6:
                    //Xóa
                    System.out.print("Nhập vào mã sản phẩm cần xóa: ");
                    int idDel = Integer.parseInt(sc.nextLine());
                    for (Product product1 : products) {
                        if (product1.getId() == idDel) {
                            products.remove(product1);
                        }
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Sai lựa chọn");
            }
        }while (true);

    }
}
