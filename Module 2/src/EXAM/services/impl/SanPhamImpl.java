package EXAM.services.impl;

import EXAM.File.ReadAndWriteFile;
import EXAM.models.SPNhapKhau;
import EXAM.models.SPXuatKhau;
import EXAM.models.SanPham;
import EXAM.services.sanpham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamImpl implements sanpham {
    private static List<SanPham> dsSanPham = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();


    @Override
    public void themMoi() {
        int id = -1;
        if(dsSanPham.isEmpty()){
            id = 1;
        }else {
            id = dsSanPham.get(dsSanPham.size()-1).getId() + 1;
        }
        System.out.println("1. Thêm mới Sản phẩm nhập khẩu.");
        System.out.println("1. Thêm mới Sản phẩm xuất khẩu.");
        int them = Integer.parseInt(scanner.nextLine());

        if (them==1){

            System.out.printf("Nhập mã sản phẩm: ");
            String maSP = scanner.nextLine();
            System.out.printf("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.printf("Nhập giá bán: ");
            int giaBan = Integer.parseInt(scanner.nextLine());
            System.out.printf("Nhập số lượng: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.printf("Nhập nhà sản xuất: ");
            String nhaSanXuat = scanner.nextLine();
            System.out.printf("Nhập số giá nhập khẩu: ");
            int giaNhapKhau = Integer.parseInt(scanner.nextLine());
            System.out.printf("Nhập tỉnh nhập khẩu: ");
            String tinhNhapKhau = scanner.nextLine();
            System.out.printf("Nhập thuế nhập khẩu: ");
            int thueNhapKhau = Integer.parseInt(scanner.nextLine());

            SPNhapKhau spNhapKhau = new SPNhapKhau(id, maSP, name,giaBan,soLuong,nhaSanXuat,
                    giaNhapKhau, tinhNhapKhau,thueNhapKhau);
            dsSanPham.add(spNhapKhau);

        }else {
            System.out.printf("Nhập mã sản phẩm: ");
            String maSP = scanner.nextLine();
            System.out.printf("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.printf("Nhập giá bán: ");
            int giaBan = Integer.parseInt(scanner.nextLine());
            System.out.printf("Nhập số lượng: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.printf("Nhập nhà sản xuất: ");
            String nhaSanXuat = scanner.nextLine();
            System.out.printf("Nhập số giá xuất khẩu: ");
            int giaXuatKhau = Integer.parseInt(scanner.nextLine());
            System.out.printf("Nhập quốc gia nhập sản phẩm: ");
            String quocGiaNhap = scanner.nextLine();

            SPXuatKhau spXuatKhau = new SPXuatKhau(id, maSP, name, giaBan,soLuong,
                    nhaSanXuat,giaXuatKhau,quocGiaNhap);
            dsSanPham.add(spXuatKhau);

        }



    }

    @Override
    public void xemDanhSach() {
        for (SanPham sanPham: dsSanPham) {
            System.out.println(sanPham.toString());
        }
    }

    @Override
    public void timKiem() {
        System.out.println("Nhập mã sản phẩm cần tìm kiếm");
        String maSP = scanner.nextLine();
        int dem = 0;
        for (SanPham sanPham : dsSanPham) {
            if (sanPham.getMaSP().equals(maSP)){
                System.out.println(sanPham.toString());
                dem++;
            }
        }
        if (dem!=0){
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    @Override
    public void xoa() {
        System.out.println("Nhập mã sản phẩm cần xoá");
        String maSP = scanner.nextLine();
        int dem = 0;
        for (SanPham sanPham : dsSanPham) {
            if (sanPham.getMaSP().equals(maSP)){
                dsSanPham.remove(sanPham);
                System.out.println("Xoá thành công.");
            }
        }
        if (dem!=0){
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
}
