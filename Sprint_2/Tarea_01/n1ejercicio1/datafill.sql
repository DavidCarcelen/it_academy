INSERT INTO customer (nameCustomer, address, phone, email)
VALUES 
('Wanpac Shaker', '123 Fake St', '555-1234', 'tupac@example.com'),
('J-Zet Smith', '456 Fictional Ave', '555-5678', 'jayz@example.com'),
('Nijal Minajson', '789 Imaginary Blvd', '555-9012', 'nicki@example.com'),
('Kanye Westwood', '321 Dream Ln', '555-3456', 'kanye@example.com'),
('Cardi Mc Johnson', '654 Fantasy Rd', '555-7890', 'cardi@example.com'),
('Snoop Doggins', '987 Make-Believe Dr', '555-2345', 'snoop@example.com');


INSERT INTO employee (nameEmployee)
VALUES 
('Tony Marino'),
('Joey Russo'),
('Johnny DeAngelo'),
('Vincent Santini'),
('Frankie Lombardo'),
('Sammy Rossi');

INSERT INTO supplier (nameSupplier, address, phone, fax, nif)
VALUES 
('Best Optical Supplies', '123 Main Street', '555-1234', '555-5678', '123456789A'),
('Global Eyewear Inc.', '456 Elm Street', '555-5678', '555-9012', '987654321B'),
('Premium Vision Ltd.', '789 Oak Street', '555-9012', '555-3456', '654321987C');

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

