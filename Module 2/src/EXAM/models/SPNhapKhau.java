package EXAM.models;

public class SPNhapKhau extends SanPham{
    private int giaNhapKhau;
    private String tinhThanhNhap;
    private int thueNhapKhau;

    public SPNhapKhau(){
    }

    public SPNhapKhau(int id, String maSP, String tenSP, int giaBan, int soLuong, String nhaSanXuat, int giaNhapKhau, String tinhThanhNhap, int thueNhapKhau) {
        super(id, maSP, tenSP, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public int getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(int giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public int getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(int thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SPNhapKhau{" +
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                ", id=" + id +
                ", maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
