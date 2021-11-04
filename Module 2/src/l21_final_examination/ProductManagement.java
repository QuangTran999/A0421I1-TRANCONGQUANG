package l21_final_examination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
    }
    
    public static void menu(){
        int choice = 0;
        while (true) {
            System.out.println("Please choose: " +
                    "\n 1. Add new" +
                    "\n 2. Remove" +
                    "\n 3. Display" +
                    "\n 4. Search" +
                    "\n 5. Exit");
            System.out.println("------------------------------");
            System.out.print("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.skip("\\R");
            switch (choice){
                case 1:
                    addNew();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error choice");
                    break;
            }
        }
    }

    private static void search() {
        try {
            System.out.print("Enter the id of the product");
            int id = scanner.nextInt();
            scanner.skip("\\R");
            System.out.println("-------------------------");
            System.out.println("ID: " + findById(id).getId()
                    + "\nName: " + findById(id).getNameProduct()
                    + "\nPrices: " + findById(id).getPrice());
            System.out.println("-------------------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void display() {
        productList = (List<Product>) ReadAndWriteFile.read("D:\\QUANG\\CodeGym\\" +
                "ProjectCodeGym\\A0421I1-TRANCONGQUANG\\Module 2\\src\\l21_final_examination\\products.csv");
        for (Product product : productList){
            System.out.println(product.toString());
        }
    }

    private static void remove() {
        try{
            System.out.println("Enter id of product");
            int id = Integer.parseInt(scanner.nextLine());
            l21_final_examination.Product product = findById(id);

            System.out.println("Are you sure to delete the product " + product.getNameProduct()
                    + "\n Yes"
                    + "\n No");
            System.out.print("Your choice: ");
            if (scanner.nextLine().equals("Yes")){
                productList.remove(product);
                System.out.println("Remove Successfully!!!");
                ReadAndWriteFile.write(productList, "D:\\QUANG\\CodeGym\\ProjectCodeGym\\A0421I1-TRANCONGQUANG\\Module 2\\src\\l21_final_examination\\products.csv");
            }else {
                menu();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static Product findById(int id) throws ProductNotFoundException {
        Product product = null;
        productList = (List<Product>) ReadAndWriteFile.read("D:\\QUANG\\CodeGym\\ProjectCodeGym\\A0421I1-TRANCONGQUANG\\Module 2\\src\\l21_final_examination\\products.csv");
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id){
                product = productList.get(i);
            }
        }
        if (product == null){
            throw new ProductNotFoundException("Not found");
        }
        return product;
    }

    private static void addNew() {
        int id = -1;
        if (productList.isEmpty()){
            id = 1;
        }else {
            id = productList.get(productList.size()-1).getId() + 1;
        }
        System.out.println("Do you want to add imported or exported products?" +
                            "\n 1. Export" +
                            "\n 2. Import");
        System.out.println("Enter your choice: ");
        int temp = Integer.parseInt(scanner.nextLine());

        System.out.println("code product: ");
        String code;
        do {
            code = scanner.nextLine();
        }while (code.equals(""));

        System.out.println("name product: ");
        String name = scanner.nextLine();
        System.out.println("price product");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("quantity product: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("producer");
        String producer = scanner.nextLine();
        if (temp == 1){
            System.out.println("export product price: ");
            int exportPrice = Integer.parseInt(scanner.nextLine());
            System.out.println("import product country: ");
            String importProductCountry = scanner.nextLine();
            productList.add(new ExportedProduct(id, code, name, price, quantity, producer,
                    exportPrice, importProductCountry));
        }else if (temp == 2){
            System.out.println("import price: ");
            double importedPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("import province: ");
            String province = scanner.nextLine();
            System.out.println("import tax: ");
            double importTax = Double.parseDouble(scanner.nextLine());
            productList.add(new ImportedProduct(id, code, name, price, quantity, producer, importedPrice,
                    province, importTax));
            ReadAndWriteFile.write(productList, "D:\\QUANG\\CodeGym\\ProjectCodeGym\\A0421I1-TRANCONGQUANG\\Module 2\\src\\l21_final_examination\\products.csv");
        }
    }
}
