package ra.model;

import java.util.List;
import java.util.Scanner;

public interface IShop {
    public void inputData(Scanner sc);
    //Không ràng buộc dữ liệu thì không cần List<Product> products
    public void displayData();
}
