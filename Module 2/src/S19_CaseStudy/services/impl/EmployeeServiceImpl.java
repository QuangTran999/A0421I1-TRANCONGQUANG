package S19_CaseStudy.services.impl;

import S19_CaseStudy.models.Employee;
import S19_CaseStudy.services.EmployeeServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeServices {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee:employeeList) {
            System.out.println(employee.toString());
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
        System.out.printf("Nhập chức vụ: ");
        String level = scanner.nextLine();
        System.out.printf("Nhập vị trí: ");
        String location = scanner.nextLine();
        System.out.printf("Nhập lương: ");
        int salary = scanner.nextInt();
        Employee employee = new Employee(id, name, age, sex, idCard, phoneNumber, email, level, location, salary);

        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.printf("nhập id cần tìm: ");
        int id = scanner.nextInt();
        for (Employee employee:employeeList) {
            if (employee.getId()==id){
                System.out.println("Nhập thông tin cần chỉnh sửa:\n" +
                        "1. Name\n2. Age\n3. Sex\n4. ID Card\n5. Phone number\n" +
                        "6. Email\n7. Level\n8. Location\n9. Salary");

                switch (scanner.nextInt()){
                    case 1:{
                        scanner.nextLine();
                        System.out.println("Nhập tên cần đổi: ");
                        String name = scanner.nextLine();
                        employee.setName(name);
                        break;
                    }
                    case 2:{
                        System.out.println("Nhập tuổi cần đổi: ");
                        int age = scanner.nextInt();
                        employee.setAge(age);
                        break;
                    }
                    case 3:{
                        scanner.nextLine();
                        System.out.println("Nhập giới tính cần đổi: ");
                        String sex = scanner.nextLine();
                        employee.setSex(sex);
                        break;
                    }
                    case 4:{
                        scanner.nextLine();
                        System.out.println("Nhập số CMND cần đổi: ");
                        String idCard = scanner.nextLine();
                        employee.setIdCard(idCard);
                        break;
                    }
                    case 5:{
                        scanner.nextLine();
                        System.out.println("Nhập số điện thoại cần đổi: ");
                        String phoneNumber = scanner.nextLine();
                        employee.setPhoneNumber(phoneNumber);
                        break;
                    }
                    case 6:{
                        scanner.nextLine();
                        System.out.println("Nhập tên email cần đổi: ");
                        String email = scanner.nextLine();
                        employee.setEmail(email);
                        break;
                    }
                    case 7:{
                        scanner.nextLine();
                        System.out.println("Nhập chức vụ cần đổi: ");
                        String level = scanner.nextLine();
                        employee.setLevel(level);
                        break;
                    }
                    case 8:{
                        scanner.nextLine();
                        System.out.println("Nhập vị tri cần đổi: ");
                        String location = scanner.nextLine();
                        employee.setLocation(location);
                        break;
                    }
                    case 9:{
                        scanner.nextLine();
                        System.out.println("Nhập lương cần đổi: ");
                        int salary = scanner.nextInt();
                        employee.setSalary(salary);
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
