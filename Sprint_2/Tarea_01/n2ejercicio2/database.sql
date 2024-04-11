DROP DATABASE IF EXISTS pizzeria;
CREATE DATABASE pizzeria;
USE pizzeria;

CREATE TABLE province(
    idProvince INT PRIMARY KEY AUTO_INCREMENT,
    nameProv VARCHAR(45));


CREATE TABLE city(
    idCity INT PRIMARY KEY AUTO_INCREMENT,
    nameCity VARCHAR (45),
    provinceId INT,
    FOREIGN KEY (provinceId) REFERENCES province (idProvince));
    
    
CREATE TABLE store(
    idStore INT PRIMARY KEY AUTO_INCREMENT,
    nameStore VARCHAR(45),
    address VARCHAR (45),
    zip VARCHAR(10),
    cityId INT,
    provinceId INT,
    FOREIGN KEY (cityId) REFERENCES city (idCity),
    FOREIGN KEY (provinceId) REFERENCES province (idProvince));


CREATE TABLE customer (
	idCustomer INT PRIMARY KEY AUTO_INCREMENT,
	nameCustomer VARCHAR(45),
	lastName VARCHAR (45),
	address VARCHAR(45),
	zip VARCHAR(10),
	cityId INT,
	provinceId INT,
	phone VARCHAR(20),
	FOREIGN KEY (cityId) REFERENCES city (idCity),
	FOREIGN KEY (provinceId) REFERENCES province (idProvince));
      
CREATE TABLE employee (
	idEmployee INT PRIMARY KEY AUTO_INCREMENT,
	nameEmployee VARCHAR(45),
	lastName VARCHAR(45),
	nif VARCHAR(20),
	phone VARCHAR (15),
	position ENUM ('cook','rider'),
	storeId INT,
	FOREIGN KEY (storeId) REFERENCES store(idStore));
        
CREATE TABLE category(
	idCategory INT PRIMARY KEY AUTO_INCREMENT,
	nameCategory VARCHAR(45));
      
CREATE TABLE product (
	idProduct INT PRIMARY KEY AUTO_INCREMENT,
	productType ENUM ('pizza','burger','drink'),
	nameProduct VARCHAR (45),
	info TEXT,
	picture BLOB,
	price DECIMAL (6,2),
	pizzaCategory INT,
	FOREIGN KEY (pizzaCategory) REFERENCES category (idCategory));
    

    
CREATE TABLE pizzaOrder (
	idPizzaOrder INT PRIMARY KEY AUTO_INCREMENT,
	dateOrder TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	delivery SET ('yes','no'),
	productSum INT,
	price DECIMAL (6,2),
	riderId INT,
    storeId INT,
    productId INT,
    employeeId INT,
	dateDelivery TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (productId) REFERENCES product(idProduct),
    FOREIGN KEY (storeId) REFERENCES store (idStore),
	FOREIGN KEY (riderId) REFERENCES employee (idEmployee),
    FOREIGN KEY (employeeId) REFERENCES employee(idEmployee));

    
    
    
