INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME) values (1001,'John Jordan');
INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME) values (1002,'Simi George');
INSERT INTO CUSTOMER(CUSTOMER_ID,CUSTOMER_NAME) values (1003,'Babitha Addala');
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,AMOUNT) VALUES (1,1001,'2023-04-23',120);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,AMOUNT) VALUES (1,1002,'2023-04-2',120);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,AMOUNT) VALUES (1,1003,'2023-04-3',120);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,AMOUNT) VALUES (2,1001,'2023-05-1',120);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,AMOUNT) VALUES (2,1002,'2023-05-2',120);
INSERT INTO TRANSACTION(TRANSACTION_ID,CUSTOMER_ID,TRANSACTION_DATE,AMOUNT) VALUES (2,1003,'2023-05-3',120);
COMMIT;