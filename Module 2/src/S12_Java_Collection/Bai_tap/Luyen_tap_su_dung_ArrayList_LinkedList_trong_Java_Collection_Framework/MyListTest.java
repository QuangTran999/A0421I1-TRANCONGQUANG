package S12_Java_Collection.Bai_tap.Luyen_tap_su_dung_ArrayList_LinkedList_trong_Java_Collection_Framework;
import java.util.Scanner;
import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        ProductManager<ProductManager> list = new ProductManager<>();
        Scanner input = new Scanner(System.in);
        while (true){
            ArrProduct product = new ArrProduct();
            System.out.println("CHỨC NĂNG CHƯƠNG TRÌNH:");
            System.out.println("1. Thêm vào cuối danh sách.");
            System.out.println("2. Thêm vào bấc kỳ trong danh sách.");
            System.out.println("3. Sửa thông tin sản phẩm.");
            System.out.println("7. In danh sách");
            System.out.println("0. Dừng chương trình.");
            System.out.printf("Mời bạn chọn: ");
            int chosse = input.nextInt();
            if (chosse==1){
                input.nextLine();
                System.out.printf("Mời bạn nhập ID sản phẩm: ");
                String  id = input.nextLine();
                System.out.printf("Mời bạn nhập tên sản phẩm: ");
                String name = input.nextLine();
                System.out.printf("Mời bạn nhập giá sản phẩm: ");
                int price = input.nextInt();
                input.nextLine();
                System.out.printf("Mời bạn nhập ngày nhập hàng: ");
                String date = input.nextLine();

                product.setId(id);
                product.setNameProduct(name);
                product.setPrice(price);
                product.setDate(date);
                list.addLast(product);
            }else if (chosse==3){
//                input.nextLine();
//                System.out.println("Mời bạn nhập id sản phẩm.");
//                String id = input.nextLine();
//                list.edit(id);
            }
            else if (chosse==7){
                list.printList();
            }else if (chosse==0){
                break;
            }
        }
    }
}
