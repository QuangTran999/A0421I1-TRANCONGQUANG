package S19_CaseStudy.services.impl;

import S19_CaseStudy.models.Customer;
import S19_CaseStudy.models.Employee;
import S19_CaseStudy.services.CustomerServices;

import java.util.LinkedList;
import java.util.Scanner;


public class CustomerServiceImpl implements CustomerServices {
    LinkedList<Customer> customerLinkedList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer:customerLinkedList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.printf("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.printf("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("Nhập giới tính: ");
        String sex = scanner.nextLine();
        System.out.printf("Nhập CMND: ");
        String idCard = scanner.nextLine();
        System.out.printf("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.printf("Nhập Email: ");
        String email = scanner.nextLine();
        System.out.printf("Nhập loại khách hàng: ");
        String customerClassification = scanner.nextLine();
        System.out.printf("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, phoneNumber,
                email, customerClassification,address);

        customerLinkedList.addLast(customer);
    }

    @Override
    public void edit() {
        System.out.printf("nhập id cần tìm: ");
        int id = scanner.nextInt();
        for (Customer customer:customerLinkedList) {
            if (customer.getId()==id){
                System.out.println("Nhập thông tin cần chỉnh sửa:\n" +
                        "1. Name\n2. Age\n3. Sex\n4. ID Card\n5. Phone number\n" +
                        "6. Email\n7. Level\n8. Customer classification\n9. Address");

                switch (scanner.nextInt()){
                    case 1:{
                        scanner.nextLine();
                        System.out.println("Nhập tên cần đổi: ");
                        String name = scanner.nextLine();
                        customer.setName(name);
                        break;
                    }
                    case 2:{
                        System.out.println("Nhập tuổi cần đổi: ");
                        int age = scanner.nextInt();
                        customer.setAge(age);
                        break;
                    }
                    case 3:{
                        scanner.nextLine();
                        System.out.println("Nhập giới tính cần đổi: ");
                        String sex = scanner.nextLine();
                        customer.setSex(sex);
                        break;
                    }
                    case 4:{
                        scanner.nextLine();
                        System.out.println("Nhập số CMND cần đổi: ");
                        String idCard = scanner.nextLine();
                        customer.setIdCard(idCard);
                        break;
                    }
                    case 5:{
                        scanner.nextLine();
                        System.out.println("Nhập số điện thoại cần đổi: ");
                        String phoneNumber = scanner.nextLine();
                        customer.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 6:{
                        scanner.nextLine();
                        System.out.println("Nhập tên email cần đổi: ");
                        String email = scanner.nextLine();
                        customer.setEmail(email);
                        break;
                    }
                    case 7:{
                        scanner.nextLine();
                        System.out.println("Nhập loại khách hàng cần đổi: ");
                        String type = scanner.nextLine();
                        customer.setCustomerClassification(type);
                        break;
                    }
                    case 8:{
                        scanner.nextLine();
                        System.out.println("Nhập địa chỉ cần đổi: ");
                        String address = scanner.nextLine();
                        customer.setAddress(address);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void delete() {

    }
}
