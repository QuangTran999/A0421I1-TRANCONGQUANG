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
    oDate datetime,
    oTotalPrice int,
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

insert into customer value (1,'Minh Quang',10),(2,'Ngoc Oanh',20), (3,'Hong Ha', 50);
insert into order_p value (1,1,'2006-3-21', null),(2,2,'2006-3-23',null),(3,1,'2006-3-16',null);
insert into product value (1,'May Giat',3),(2,'Tu Lanh',5), (3,'Dieu Hoa',7), (4,'Quat',1), (5,'Bep Dien',2);
insert into orderDetail value (1,1,3), (1,3,7), (1,4,2), (2,1,1), (3,1,8), (2,5,4), (2,3,3);

select oID, oDate, oTotalPrice from order_p;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.cID, c.cName, p.pName from customer as c
join order_p as o
on c.cID = o.cID
join orderDetail as od
on o.oID = od.oID
join product as p
on od.pID = p.pID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào ????????
select customer.cID, customer.cName
from customer 
where customer.cID not in (select order_p.cID from order_p);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select order_p.oID, order_p.oDate, sum(orderdetail.OdQTY * product.pPrice) as 'tong tien'
from order_p join orderdetail on order_p.oID = orderdetail.oID
join product on product.pID = orderdetail.pID
group by order_p.oID;