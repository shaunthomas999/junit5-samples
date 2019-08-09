CREATE TABLE PRODUCTS
(
    ID NUMBER(10, 0) PRIMARY KEY,
    NAME     VARCHAR(50) NOT NULL,
    CATEGORY VARCHAR(50) DEFAULT NULL,
    PRICE    NUMBER NOT NULL,
    COUNT    NUMBER(7, 0) DEFAULT 0
);
