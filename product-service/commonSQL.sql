CREATE TABLE nbc_cust.product  
( PRODUCT_ID number(10) NOT NULL,  
  PRODUCT_NAME varchar2(50),  
  PRODUCT_QUANTITY number(10)  
);  


Insert into nbc_cust.product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_QUANTITY) values (1,'Jeans',20);
Insert into nbc_cust.product (PRODUCT_ID,PRODUCT_NAME,PRODUCT_QUANTITY) values (2,'Shirts',15);