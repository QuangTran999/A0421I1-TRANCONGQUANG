package EXAM.models;

public class SPXuatKhau extends SanPham{
    private int giaXuatKhau;
    private  String quocGiaNhapSP;

    public SPXuatKhau(){
    }

    public SPXuatKhau(int id, String maSP, String tenSP, int giaBan, int soLuong, String nhaSanXuat, int giaXuatKhau, String quocGiaNhapSP) {
        super(id, maSP, tenSP, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    public int getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(int giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSP() {
        return quocGiaNhapSP;
    }

    public void setQuocGiaNhapSP(String quocGiaNhapSP) {
        this.quocGiaNhapSP = quocGiaNhapSP;
    }

    @Override
    public String toString() {
        return "SPXuatKhau{" +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapSP='" + quocGiaNhapSP + '\'' +
                ", id=" + id +
                ", maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
