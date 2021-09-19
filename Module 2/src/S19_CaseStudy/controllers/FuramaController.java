package S19_CaseStudy.controllers;
import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.printf("PLEASE CHOOSE: ");
        int choose = scanner.nextInt();
    }
}
