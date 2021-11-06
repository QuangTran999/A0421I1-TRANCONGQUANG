create database casestudy;
use casestudy;


create table KieuThue(
	IDKieuThue int not null primary key,
    TenKieuThue varchar(45),
    Gia int
);
create table LoaiDichVu(
	IDLoaiDichVu int not null primary key,
    TenLoaiDichVu varchar(45)
); 
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




-- ----------------------------------------------------------------------------
-- 1.	Thêm mới thông tin cho tất cả các bảng có trong CSDL để có thể thõa mãn các yêu cầu bên dưới.
insert into BoPhan(IDBoPhan, TenBoPhan) values
(1, "Nhân sự"),
(2, "Kinh doanh"),
(3, "Dịch vụ phòng"),
(4, "Kế toán"),
(5, "Kỹ thuật"),
(6, "Ẩm thực"),
(7, "An ninh"),
(8, "Giải trí"),
(9, "Thể thao");
insert into BoPhan value(10, "Lễ tân");

insert into TrinhDo(IDTrinhDo, TrinhDo) values
(1, "THPT"),
(2, "CD"),
(3, "DH"),
(4, "CH"),
(5, "TS");

insert into ViTri(IDViTri, TenViTri) values
(1, "Tuyển dụng"),
(2, "Huấn luyện"),
(3, "marketing"),
(4, "Giám đốc lễ tân"),
(5, "Nhân viên lễ tân"),
(6, "Nhân viên quan hệ khách hàng"),
(7, "Nhân viên thu ngân"),
(8, "Nhân viên hành lý"),
(9, "Nhân viên hỗ trợ khách hàng"),
(10, "Nhân viên kiểm toán đêm"),
(11, "Nhân viên đặt phòng"),
(12, "Nhân viên trực tổng đài"),
(13, "Nhân viên đội xe"),
(14, "Nhân viên quầy lưu niệm"),
(15, "Giám đốc buồng phòng"),
(16, "Nhân viên làm phòng"),
(17, "Vệ sinh công cộng"),
(18, "Kho"),
(19, "Làm vườn"),
(20, "Trông trẻ"),
(21, "Giám đốc kinh doanh"),
(22, "Giám đốc tuyển dụng"),
(23, "Giám đốc tài chính"),
(24, "Nhân viên kế toán"),
(25, "Giám đốc kỹ thuật"),
(26, "Nhân viên bảo trì"),
(27, "Giám đốc ẩm thực"),
(28, "Giám đốc nhà hàng"),
(29, "Bếp trưởng"),
(30, "Phục vụ nhà hàng âu"),
(31, "Bếp âu"),
(32, "Phục vụ nhà hàng việt");
insert into ViTri(IDViTri, TenViTri) values
(33, "Phục vụ nhà hàng á"),
(34, "Bếp á"),
(35, "Phục vụ nhà hàng hoa"),
(36, "Bếp hoa");
insert into ViTri(IDViTri, TenViTri) values
(37, "Trưởng bộ phận bar"),
(38, "Phục vụ bộ phận bar"),
(39, "Giám đốc an ninh"),
(40, "Nhân viên bảo vệ"),
(41, "Giám đốc giải trí"),
(42, "Nhân viên giải trí"),
(43, "Giám đốc thể thao"),
(44, "Nhân viên thể thao"),
(45, "Bếp việt"),
(46, "Bếp bánh");

insert into NhanVien(IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMTND, Luong, SDT, Email, DiaChi) values
(1, "Trần Văn Minh Nhật", 1, 1, 1, "1999-10-27", "123987768", "10000000", "0128682983", "nhat@gmail.com", "Quảng Nam"),
(2, "Trần Công Toản", 2, 2, 1, "1998-09-12", "123987568", "12000000", "0128492983", "toan@gmail.com", "Quảng Nam"),
(3, "Lê Phước Bình", 3, 3, 2, "1997-06-14", "123987768", "13000000", "0129382983", "binh@gmail.com", "Đà Nẵng"),
(4, "Đỗ Như Thành", 4, 4, 3, "1996-11-20", "123987018", "10000000", "0128413983", "thanh@gmail.com", "Cà Mau"),
(5, "Trần Đình Nhất", 5, 5, 3, "2000-01-11", "123980968", "17000000", "0120982983", "nhat123@gmail.com", "Quảng Nam"),
(6, "Trương Công Phúc", 6, 1, 3, "1995-06-08", "198987768", "9000000", "0145682983", "phuc@gmail.com", "Cần Thơ"),
(7, "Trương Minh Tuấn", 7, 2, 3, "1989-10-27", "124487768", "12300000", "0128601983", "tuan@gmail.com", "Long An"),
(8, "Nguyễn Lê Hằng", 8, 3, 3, "1992-11-02", "343987768", "8000000", "0224682983", "hang@gmail.com", "Quảng Nam"),
(9, "Nguyễn Tố Hằng", 9, 4, 3, "1996-11-02", "984987768", "11000000", "0344656983", "hang123@gmail.com", "Quảng Nam"),
(10, "Trần Thị Thảo", 10, 5, 3, "1991-10-27", "873987768", "10000000", "0109682983", "thao@gmail.com", "Hà Tĩnh"),
(11, "Trần Đức Nhật", 11, 1, 3, "1993-06-29", "103987738", "12000000", "0928682983", "nhat456@gmail.com", "Quảng Trị"),
(12, "Vương Thị Hằng", 12, 2, 3, "1994-07-17", "763987768", "13000000", "0098682983", "hang@gmail.com", "Huế"),
(13, "Vương Công Lực", 13, 3, 3, "1995-10-07", "783987768", "11000000", "0328682983", "luc@gmail.com", "Quảng Nam"),
(14, "Hoàng Kim Kỹ", 14, 4, 3, "1996-10-27", "983987768", "10500000", "0428682983", "ky@gmail.com", "Quảng Ngãi"),
(15, "Đỗ Minh Quang", 15, 5, 3, "1997-01-29", "673984768", "9000000", "0120982983", "quang@gmail.com", "Quảng Nam"),
(16, "Lê Tố Uyên", 16, 1, 3, "1999-11-12", "463987768", "8000000", "0498682983", "uyen@gmail.com", "Bình Định"),
(17, "Trần Duyên Trinh", 17, 2, 3, "1990-10-17", "123347768", "15000000", "0129882983", "trinh@gmail.com", "Gia Lai"),
(18, "Trần Dược Đức", 18, 1, 3, "1998-10-27", "984687768", "9000000", "0528684983", "duc@gmail.com", "Trà Vinh"),
(19, "Trần Thị Kim Ngân", 19, 4, 3, "1993-10-27", "098987768", "17000000", "0968692983", "ngan@gmail.com", "Sóc Trăng"),
(20, "Lý Kim Anh", 20, 5, 3, "1885-04-23", "198987768", "17000000", "0128698983", "anh@gmail.com", "Đà Nẵng");
insert into NhanVien(IDNhanVien, HoTen, IDViTri, IDTrinhDo, IDBoPhan, NgaySinh, SoCMTND, Luong, SDT, Email, DiaChi) values
(21, "Trần Thị Hồng", 20, 1, 1, "1994-12-12", "345234653", "15000000", "0984297852", "hong@gmail.com", "Hải Châu");



insert into LoaiKhach value (1, "Diamond"), (2,"Platinium"), (3, "Gold"), (4, "Silver"), (5, "Member");
insert into khachhang(IDKhachHang, IDLoaiKhach, HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi) values
(1, 1, "Nguyễn Cẩm Nhung", "2000-12-09", "979843871", "0879289462", "nhung@gmail.com", "Quảng Nam"),
(2, 2, "Trần Tuấn Mạnh", "2001-08-02", "979843871", "0479689462", "manh@gmail.com", "Quảng Ngãi"),
(3, 3, "Lại Thị Hòa", "2003-02-05", "979840981", "0989289462", "hoa@gmail.com", "Đà Nẵng"),
(4, 4, "Ngô Hoàng Anh", "1998-03-04", "984843871", "0987389462", "anh@gmail.com", "Gia Lai"),
(5, 1, "Trần Minh Tuấn", "1993-05-07", "098843871", "0934889462", "tuan@gmail.com", "Lâm Đồng"),
(6, 2, "Lại Xuân Tạo", "1999-04-02", "909843871", "0825289462", "tao@gmail.com", "Hồ Chí Minh"),
(7, 3, "Trần Văn Huy", "2000-08-04", "979898371", "0870989462", "huy@gmail.com", "Hà Nội"),
(8, 4, "Đoàn Tuấn Mạnh", "1990-09-29", "123843871", "0989289462", "manh123@gmail.com", "Quảng Nam"),
(9, 4, "Ngô Thừa Ân", "1980-12-23", "974873193", "0123947861", "an@gmail.com", "Vinh"),
(10, 2, "Ngô Thừa Vũ", "1984-11-02", "983873193", "0198347861", "vu@gmail.com", "Long An");

insert into loaidichvu(IDLoaiDichVu, TenLoaiDichVu) values
(1, "Dịch vụ cơ bản"),
(2, "Dịch vụ cao cấp"),
(3, "Casino");
insert into kieuthue(IDKieuThue, TenKieuThue, Gia) values
(1, "Chất lượng thấp", 300000),
(2, "Bình thường", 500000),
(3, "Chất lượng cao", 1000000);
insert into dichvu(IDDichVu, TenDichVu, DienTich, SoTang, SoNguoiToiDa, ChiPhiThue, IDKieuThue, IDLoaiDichVu, TrangThai) values
(1, "villa", 30, 3, 7, 7000000, 3,2,1),
(2, "house", 40, 3, 8, 8000000, 3, 2, 1),
(3, "room", 30, 1, 3, 2500000, 3, 2, 1);

insert into HopDong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) values
(1, 2, 1, 1, "2021-08-23", "2021-10-23", 2000000, 10000000),
(2, 1, 2, 2, "2021-08-24", "2021-10-24", 3000000, 12000000),
(3, 3, 3, 3, "2021-07-21", "2021-09-21", 1000000, 8000000);
insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) values
(4, 1, 1, 2, "2021-07-21", "2021-09-21", 800000, 6000000),
(5, 2, 1, 2, "2021-07-21", "2021-09-21", 900000, 7000000),
(6, 3, 2, 3, "2021-07-21", "2021-09-21", 1000000, 8000000);
insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) values
(7, 3, 5, 3, "2021-07-21", "2021-09-21", 1000000, 8000000),
(8, 3, 5, 3, "2021-07-21", "2021-09-21", 1000000, 8000000),
(9, 3, 5, 3, "2021-07-21", "2021-09-21", 1000000, 8000000);
insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) values
(10, 3, 1, 3, "2021-07-21", "2021-09-21", 1000000, 8000000),
(11, 3, 1, 3, "2021-07-21", "2021-09-21", 1000000, 8000000),
(12, 3, 1, 3, "2021-07-21", "2021-09-21", 1000000, 8000000);
insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) values
(13, 3, 7, 3, "2019-10-20", "2021-09-21", 900000, 6000000),
(14, 2, 8, 2, "2019-11-17", "2021-09-21", 1000000, 9000000),
(15, 1, 6, 1, "2019-12-12", "2021-09-21", 500000, 5000000),
(16, 4, 5, 1, "2019-06-01", "2021-09-21", 1000000, 12000000);
insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) values
(17, 3, 10, 3, "2015-10-20", "2021-09-21", 900000, 6000000),
(18, 2, 11, 2, "2016-11-17", "2021-09-21", 1000000, 9000000);
insert into hopdong(IDHopDong, IDNhanVien, IDKhachHang, IDDichVu, NgayLamHopDong, NgayKetThuc, TienDatCoc, TongTien) values
(19, 21, 8, 3, "2019-12-12", "2021-09-21", 900000, 6000000);
-- ----------------------------------------------------------------------------
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select * from NhanVien
where HoTen like '%H%' or "%T%" or "%K%";
-- ----------------------------------------------------------------------------
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select * from KhachHang
where (DiaChi = "Da Nang" or DiaChi = "Quang Tri") and
(year(localtime())-year(NgaySinh) >= 18 and year(localtime())-year(NgaySinh)<=50);
-- ----------------------------------------------------------------------------
-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo 
-- số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select hd.IDKhachHang, kh.HoTen, lk.TenLoaiKhach, count(*) as so_luong
from HopDong as hd
join KhachHang as kh
on hd.IDKhachHang = kh.IDKhachHang
join LoaiKhach as lk
on kh.IDLoaiKhach = lk.IDLoaiKhach
group by hd.IDKhachHang
having lk.TenLoaiKhach = "Diamond"
order by so_luong;

-- ----------------------------------------------------------------------------
-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).


-- ----------------------------------------------------------------------------