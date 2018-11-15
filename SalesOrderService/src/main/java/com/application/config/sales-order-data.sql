CREATE TABLE CUSTOMER_SOS(
    CUST_ID INT PRIMARY KEY,
    CUST_EMAIL VARCHAR(255) NOT NULL,
    CUST_FIRST_NAME VARCHAR(100) NOT NULL,
    CUST_LAST_NAME VARCHAR(100) NOT NULL
);

CREATE TABLE SALES_ORDER(
	ID INT AUTO_INCREMENT PRIMARY KEY,
	ORDER_DATE TIMESTAMP NOT NULL,
	CUST_ID INT NOT NULL REFERENCES CUSTOMER_SOS(CUST_ID),
	ORDER_DESC VARCHAR(255),
	TOTAL_PRICE DOUBLE
);

CREATE TABLE ORDER_LINE_ITEM (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	ORDER_ID INT NOT NULL REFERENCES SALES_ORDER(ID),
	ITEM_NAME VARCHAR(255) NOT NULL,
	ITEM_QUANTITY INT NOT NULL
)


