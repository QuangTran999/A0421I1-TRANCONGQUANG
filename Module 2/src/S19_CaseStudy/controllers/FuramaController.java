package S19_CaseStudy.controllers;
import S19_CaseStudy.services.impl.CustomerServiceImpl;
import S19_CaseStudy.services.impl.EmployeeServiceImpl;
import S19_CaseStudy.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){

        boolean check = true;
        while (check){
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.printf("PLEASE CHOOSE: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    displayEmployeeMenu();
                    break;
                }
                case 2:{
                    disCustomerMenu();
                    break;
                }
                case 3:{
                    displayFacilityMenu();
                }
                case 6:{
                    check = false;
                }
            }
        }

    }

    public static void displayEmployeeMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (true){
            System.out.println("1. Display list Employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Back to menu");
            System.out.printf("PLEASE CHOOSE: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    employeeService.display();
                    break;
                }
                case 2:{
                    employeeService.addNew();
                    break;
                }
                case 3:{
                    employeeService.edit();
                    break;
                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void disCustomerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (true){
            System.out.println("1. Display linkedlist customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Back to menu");
            System.out.printf("PLEASE CHOOSE: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    customerService.display();
                    break;
                }
                case 2:{
                    customerService.addNew();
                    break;
                }
                case 3:{
                    customerService.edit();
                    break;
                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayFacilityMenu(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        while (true){
            System.out.println("1. Display linkedHashMap Facility.");
            System.out.println("2. Add new facility.");
            System.out.println("3. ");
            System.out.println("4. Back to menu");
            System.out.printf("PLEASE CHOOSE: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    facilityService.display();
                    break;
                }
                case 2:{
                    System.out.println("1. Add new Villa.");
                    System.out.println("2. Add new House.");
                    System.out.println("3. Add new Room");
                    System.out.printf("PLEASE CHOOSE: ");
                    int choose = scanner.nextInt();
                    while (choose<1||choose>3){
                        System.out.printf("PLEASE CHOOSE: ");
                        choose = scanner.nextInt();
                    }
                    if (choose==1){
                        facilityService.addNewVilla();
                    }else if (choose==2){
                        facilityService.addNewHouse();
                    }else {
                        facilityService.addNewRoom();
                    }
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    displayMainMenu();
                    break;
                }
            }
        }

    }
}
