create database casestudy;
use casestudy;

create table DichVu(
	IDDichVu int not null primary key,
    TenDichVu varchar(45),
    DienTich int,
    Sotang int,
    SoNguoiToiDa varchar(45),
    ChiPhiThue varchar(45),
    IDKieuThue int,
    IDLoaiDichVu int,
    TrangThai varchar(45),
    foreign key (IDKieuThue) references KieuThue (IDKieuThue),
    foreign key (IDLoaiDichVu) references LoaiDichVu (IdLoaiDichVu)
);
create table KieuThue(
	IDKieuThue int not null primary key,
    TenKieuThue varchar(45),
    Gia int
);
create table LoaiDichVu(
	IDLoaiDichVu int not null primary key,
    TenLoaiDichVu varchar(45)
); 


create table LoaiKhach(
	IDLoaiKhach int not null primary key,
    TenLoaiKhach varchar(45)
);
create table KhachHang(
	IDKhachHang int not null primary key,
    IDLoaiKhach int,
    HoTen varchar(45),
    NgaySinh date,
    SoCMTND varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key (IDLoaiKhach) references LoaiKhach (IDLoaiKhach)
);


create table ViTri(
	IDViTri int not null primary key,
    TenViTri varchar(45)
);
create table TrinhDo(
	IDTrinhDo int not null primary key,
    TrinhDo varchar(45)
);
create table BoPhan(
	IDBoPhan int not null primary key,
    TenBoPhan varchar(45)
); 
create table NhanVien(
	IDNhanVien int not null primary key,
    HoTen varchar(45),
    IDViTri int,
    IDTrinhDo int,
    IDBoPhan int,
    NgaySinh date,
    SoCMTND varchar(45),
    Luong varchar(45),
    SDT varchar(45),
    Email varchar(45),
    DiaChi varchar(45),
    foreign key (IDViTri) references ViTri (IDViTri),
    foreign key (IDTrinhDo) references TrinhDo (IDTrinhDo),
    foreign key (IDBoPhan) references BoPhan (IDBoPhan)
);


create table DichVuDiKem(
	IDDichVuDiKem int not null primary key,
    TenDichVuDiKem varchar(45),
    Gia int,
    DonVi int,
    TrangThaiKhaDung varchar(45)
);
create table HopDongChiTiet(
	IDHopDongChiTiet int not null primary key,
    IDHopDong int,
    IDDichVuDiKem int,
    SoLuong int,
    foreign key (IDHopDong) references HopDong (IDHopDong),
    foreign key (IDDichVuDiKem) references DichVuDiKem (IDDichVuDiKem)
);


create table HopDong(
	IDHopDong int not null primary key,
    IDNhanVien int,
    IDKhachHang int,
    IDDichVu int,
    NgayLamHopDong date,
    NgayKetThuc date,
    TienDatCoc int,
    TongTien int,
    foreign key (IDNhanVien) references NhanVien (IDNhanVien),
    foreign key (IDKhachHang) references KhachHang (IDKhachHang),
    foreign key (IDDichVu) references DichVu (IDDichVu)
    
);

-- ----------------------------------------------------------------------------
-- 1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.

-- ----------------------------------------------------------------------------
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.

-- ----------------------------------------------------------------------------
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

-- ----------------------------------------------------------------------------
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo 
-- số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

-- ----------------------------------------------------------------------------
-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

-- -----------------------------------------------------------------------------