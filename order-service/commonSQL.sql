CREATE TABLE nbc_cust.orders  
( ORDER_ID number(10) NOT NULL,  
  USER_NAME varchar2(50),  
  ORDER_ADDRESS varchar2(50)  
);  


Insert into nbc_cust.orders (ORDER_ID,USER_NAME,ORDER_ADDRESS) values (1,'Ammar','Whitefield');
Insert into nbc_cust.orders (ORDER_ID,USER_NAME,ORDER_ADDRESS) values (2,'John','Silkboard');

