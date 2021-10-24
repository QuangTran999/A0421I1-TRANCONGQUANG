create database ERDtoRelationship;
use ERDtoRelationship;

create table PhieuXuat(
	soPX int not null primary key,
    ngayXuat datetime
);


create table VATTU(
	maVTU int not null primary key,
    tenVTY varchar(30)
);


create table PhieuNhap(
	soPN int not null primary key,
    ngayNhap datetime
);


create table DonDH(
	soDH int not null primary key,
    ngayDH datetime
);

create table NhaCC(
	maNCC int not null primary key,
    tenNCC varchar(20),
    diaChi varchar(20),
    sdt varchar(20)
);