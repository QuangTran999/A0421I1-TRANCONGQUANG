package exception;

import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiem tra ngay sinh nhat:");
        /* kiem tra ngay nhap vao duoi dang string voi dinh dang dd/MM/yyyy
            va ngay nhap vao phai nho hon ngay hien tai
         */
        System.out.println("Nhap ngay can kiem tra: ");
        String dateAsString = null;
        Validate validate = new Validate();
        Date date = null;
        while (date == null) {
            try {
                dateAsString = scanner.nextLine();
                date = validate.isCheckDate(dateAsString);
            } catch (InvalidDateException e) {
                System.out.println(e.getMessage());
                System.out.println("Moi ban vui long nhap lai: ");
            }
        }

        System.out.println("Ngay sau khi check: " + date.toString());
    }
}

// Product => PR-XXXX trong đó XXXX là số
