create database products;
use products;

create table products(
	id int not null primary key,
    productCode int not null,
    productName varchar(30) not null,
    productPrice int,
    productAmount int,
    productDescription varchar(50),
    productStatus bit
);
insert into products value(1,1,'samsung1',2000,44,'hanquoc',1),
						(2,1,'samsung2',2500,44,'hanquoc',1),
						(3,1,'samsung3',2300,44,'hanquoc',1),
						(4,2,'nokia1',1000,44,'trungquoc',1),
						(5,2,'nokia2',1200,44,'trungquoc',1),
						(6,2,'nokia3',1600,44,'trungquoc',1),
						(7,3,'iphone1',3000,44,'VN',1),
						(8,3,'iphone2',4000,44,'VN',1),
						(9,3,'iphone3',6000,44,'VN',1);
                        
select * from products
where productCode = 2;

explain select * from products
where productCode = 2;

alter table products add index idx_productCode_nam(productCode, productName);
explain select * from products
where productCode = 2 and productName = 'nokia1';

-- ----------------
create view someview_product as
select productCode, productName, productPrice, productStatus
from products;

select * from someview_product;

drop view someview_product;
-- -----------------

DELIMITER //
CREATE PROCEDURE findAllProducts()
begin
	select * from products;
end //
DELIMITER ;
call findAllProducts();
-- ------
DELIMITER //
CREATE PROCEDURE insertProduct()
BEGIN
	insert into products value(10,4,'Oppo',4500,24,'hanquoc',1);
END //
DELIMITER ;

call insertProduct();

-- ------
DELIMITER //
CREATE PROCEDURE updateProduct(in productName varchar(30), in id int)
BEGIN
	update products set products.productName = productName where products.id = id;
END //
DELIMITER ;

call updateProduct('Vivo',10);
-- --------
DELIMITER //
CREATE PROCEDURE deleteProduct(in id int)
BEGIN
	delete from products where products.id = id;
END //
DELIMITER ;

call deleteProduct(10);

