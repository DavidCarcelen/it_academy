
INSERT INTO address (street, numero, floor, door, city, zip, country) VALUES
('Calle Primavera', 123, '2ºA', NULL, 'Madrid', 28001, 'España'),
('Avenida del Mar', 456, '3ºB', NULL, 'Barcelona', 08002, 'España'),
('Plaza Mayor', 789, '1ºC', NULL, 'Valencia', 46001, 'España'),
('Calle Robles', 234, '4ºD', NULL, 'Sevilla', 41001, 'España'),
('Paseo de la Playa', 567, '2ºE', NULL, 'Málaga', 29001, 'España'),
('Calle del Sol', 890, '3ºF', NULL, 'Bilbao', 48001, 'España'),
('Avenida de la Luna', 123, '1ºG', NULL, 'Zaragoza', 50001, 'España'),
('Plaza de la Constitución', 456, '2ºH', NULL, 'Murcia', 30001, 'España'),
('Calle de las Flores', 789, '3ºI', NULL, 'Alicante', 03001, 'España'),
('Avenida de los Pinos', 234, '4ºJ', NULL, 'Granada', 18001, 'España');


INSERT INTO customer (nameCustomer, phone, email, addressId) VALUES
('Cliente 1', '123456789', 'cliente1@example.com', 1),
('Cliente 2', '234567890', 'cliente2@example.com', 2),
('Cliente 3', '345678901', 'cliente3@example.com', 3),
('Cliente 4', '456789012', 'cliente4@example.com', 4),
('Cliente 5', '567890123', 'cliente5@example.com', 5),
('Cliente 6', '678901234', 'cliente6@example.com', 6),
('Cliente 7', '789012345', 'cliente7@example.com', 7);



INSERT INTO employee (nameEmployee)
VALUES 
('Tony Marino'),
('Joey Russo'),
('Johnny DeAngelo'),
('Vincent Santini'),
('Frankie Lombardo'),
('Sammy Rossi');

INSERT INTO supplier (nameSupplier, phone, fax, nif, addressId)
VALUES 
('Best Optical Supplies', '555-1234', '555-5678', '123456789A', 8),
('Global Eyewear Inc.', '555-5678', '555-9012', '987654321B', 9),
('Premium Vision Ltd.', '555-9012', '555-3456', '654321987C', 10);

INSERT INTO glasses (brand, diopter, frame, frameColor, glassColor, price, supplierId)
VALUES 
('American Vision', 2.5, 'flotant', 'Black', 'Clear', 29.99, 1),
('Urban Eyewear', 3.0, 'pasta', 'Brown', 'Brown', 39.99, 2),
('Classic Optics', 1.75, 'metall', 'Silver', 'Gray', 49.99, 3),
('Classic Optics', 2.25, 'flotant', 'Gold', 'Blue', 34.99, 1),
('Urban Eyewear', 1.5, 'pasta', 'Red', 'Black', 44.99, 2),
('American Vision', 2.0, 'metall', 'Gunmetal', 'Green', 54.99, 3);


INSERT INTO sale (customerId, employeeId, glassesId)
VALUES 
(1, 1, 1),
(1, 1, 2),
(3, 3, 3), 
(3, 1, 4),
(3, 3, 5),
(4, 3, 6);

