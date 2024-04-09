-- -----------------------------------------------------
-- DATABASE OPTICA
-- -----------------------------------------------------
DROP DATABASE IF EXISTS optica;
CREATE DATABASE optica;
USE optica;

-- -----------------------------------------------------
-- Table Supplier
-- -----------------------------------------------------
CREATE TABLE supplier (
  idSupplier INT PRIMARY KEY AUTO_INCREMENT,
  nameSupplier VARCHAR(45),
  address VARCHAR(45),
  phone VARCHAR(15),
  fax VARCHAR(15),
  nif VARCHAR(10));

-- -----------------------------------------------------
-- Table Glasses
-- -----------------------------------------------------
CREATE TABLE  glasses (
  idGlasses INT PRIMARY KEY AUTO_INCREMENT,
  brand VARCHAR(45),
  diopter DECIMAL(5),
  frame SET ('flotant','pasta','metall'),
  frameColor VARCHAR(20),
  glassColor VARCHAR(20),
  price DECIMAL(5),
  supplierId INT,
  FOREIGN KEY (supplierId) REFERENCES supplier (idSupplier));

-- -----------------------------------------------------
-- Table Customer
-- -----------------------------------------------------
CREATE TABLE customer (
  idCustomer INT PRIMARY KEY AUTO_INCREMENT,
  nameCustomer VARCHAR(45),
  address VARCHAR(45),
  phone VARCHAR(20),
  email VARCHAR(60),
  dateCustomer TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  idRec INT,
    FOREIGN KEY (idRec) REFERENCES customer (idCustomer));


-- -----------------------------------------------------
-- Table Employee
-- -----------------------------------------------------
CREATE TABLE employee (
  idEmployee INT PRIMARY KEY AUTO_INCREMENT,
  nameEmployee VARCHAR(45));

-- -----------------------------------------------------
-- Table Sale
-- -----------------------------------------------------
CREATE TABLE  sale (
  idSale INT PRIMARY KEY AUTO_INCREMENT,
  customerId INT,
  employeeId INT,
  glassesId INT,
  dateSale TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (customerId) REFERENCES customer(idCustomer),
    FOREIGN KEY (employeeId) REFERENCES employee (idEployee),
    FOREIGN KEY (glassesId) REFERENCES glasses (idGlasses));
