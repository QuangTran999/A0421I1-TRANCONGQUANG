package EXAM.controllers;

import EXAM.services.impl.SanPhamImpl;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        SanPhamImpl sanPham = new SanPhamImpl();

        boolean check = true;
        while (check){
            System.out.println("------CHƯƠNG TRÌNH QUANR LÝ SẢN PHẨM------");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xoá");
            System.out.println("3. Xem danh sách sản phẩm");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.printf("Chọn chức năng: ");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:{
                    sanPham.themMoi();
                    break;
                }
                case 2:{
                    sanPham.xoa();
                    break;
                }
                case 3:{
                    sanPham.xemDanhSach();
                    break;
                }
                case 4:{
                    sanPham.timKiem();
                    break;
                }
                case 5:{
                    check = false;
                }
            }
        }

    }
}
