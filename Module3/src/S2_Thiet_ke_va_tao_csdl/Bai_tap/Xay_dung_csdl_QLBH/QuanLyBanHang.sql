create database quanlybanhang;
use quanlybanhang;
create table customer(
	cID int not null auto_increment primary key,
    cName varchar(30) not null,
    cAge varchar(30)
);

create table order_p(
	oID int not null auto_increment primary key,
    cID int not null, 
    oDate date,
    oTotalPrice int not null,
    FOREIGN KEY (cID) REFERENCES customer (cID)
);

create table product(
	pID int not null auto_increment primary key,
    pName varchar(30) not null,
    pPrice int not null
);
create table orderDetail(
	oID int not null,
    pID int not null,
    odQTY varchar(60),
    constraint pk_order_product primary key(oID, pID),
    foreign key(oID) references order_p(oID),
    foreign key(pID) references product(pID)
);