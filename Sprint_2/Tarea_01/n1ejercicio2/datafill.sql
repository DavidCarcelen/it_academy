INSERT INTO province (nameProv) VALUES
('Bronson'),
('WellSpring'),
('HighLands'),
('LoneStep');

INSERT INTO city (nameCity, provinceId)
VALUES
('City 1', 1),
('City 2', 1),
('City 3', 1),
('City 4', 1),
('City 5', 2),
('City 6', 2),
('City 7', 2),
('City 8', 2),
('City 9', 3),
('City 10', 3),
('City 11', 3),
('City 12', 3),
('City 13', 4),
('City 14', 4),
('City 15', 4),
('City 16', 4);




INSERT INTO customer (nameCustomer, lastName, address, zip, cityId, phone)
VALUES
('John', 'Doe', '123 Main St', '12345', 1, '555-1234'),
('Jane', 'Smith', '456 Elm St', '54321', 2, '555-5678'),
('Alice', 'Johnson', '789 Oak St', '67890', 3, '555-1111'),
('Bob', 'Williams', '321 Pine St', '09876', 4, '555-2222'),
('Emily', 'Brown', '654 Maple St', '13579', 4, '555-3333'),
('Michael', 'Taylor', '987 Cedar St', '24680', 4, '555-4444'),
('Sarah', 'Miller', '741 Birch St', '97531', 2, '555-5555'),
('David', 'Wilson', '852 Walnut St', '86420', 8, '555-6666'),
('Olivia', 'Martinez', '369 Cherry St', '75309', 9, '555-7777'),
('James', 'Garcia', '258 Sycamore St', '35790', 3, '555-8888');


INSERT INTO store (nameStore, address, zip, cityId)
VALUES
('Pizzería del Centro', 'Av. Principal 123', '12345', 1),
('Pizza Express', 'Calle Mayor 456', '54321', 2),
('La Pizzería Italiana', 'Plaza Central 789', '67890', 2),
('Pizza Hut', 'Calle Peatonal 321', '09876', 1),
('Domino\'s Pizza', 'Av. Independencia 654', '13579', 2),
('Little Italy', 'Calle Comercial 987', '24680', 3),
('Pizza World', 'Paseo del Parque 741', '97531', 2),
('The Pizza Place', 'Callejón Oscuro 852', '86420', 2),
('Tony\'s Pizzeria', 'Avenida del Mar 369', '75309', 2),
('Mamma Mia Pizzería', 'Callejón Estrecho 258', '35790', 1);

INSERT INTO employee (nameEmployee, lastName, nif, phone, job, storeId)
VALUES
('Juan', 'Martínez', '12345678A', '555-1111', 'cook', 1),
('María', 'García', '23456789B', '555-2222', 'rider', 2),
('Pedro', 'López', '34567890C', '555-3333', 'cook', 3),
('Ana', 'Sánchez', '45678901D', '555-4444', 'rider', 4),
('Carlos', 'Fernández', '56789012E', '555-5555', 'cook', 5),
('Laura', 'Rodríguez', '67890123F', '555-6666', 'rider', 6),
('David', 'Pérez', '78901234G', '555-7777', 'cook', 7),
('Sofía', 'Gómez', '89012345H', '555-8888', 'rider', 8),
('José', 'Martín', '90123456I', '555-9999', 'cook', 9),
('Elena', 'Jiménez', '01234567J', '555-0000', 'rider', 10);

INSERT INTO category (nameCategory) VALUES
('FullEquip'),
('BBQ'),
('Vegan');


-- Productos de pizza
INSERT INTO product (productType, nameProduct, info, price, pizzaCategory)
VALUES
('pizza', 'Margherita', 'Tomato sauce, mozzarella cheese, basil', 8.99, 1),
('pizza', 'Pepperoni', 'Tomato sauce, mozzarella cheese, pepperoni slices', 9.99, 2),
('pizza', 'Hawaiian', 'Tomato sauce, mozzarella cheese, ham, pineapple', 10.99, 1),
('pizza', 'Vegetarian', 'Tomato sauce, mozzarella cheese, assorted vegetables', 10.99, 3);

-- Productos de hamburguesa o bebida
INSERT INTO product (productType, nameProduct, info, price)
VALUES
('burger', 'Classic Burger', 'Beef patty, lettuce, tomato, onion, pickles, ketchup, mustard', 6.99),
('burger', 'Cheeseburger', 'Beef patty, cheddar cheese, lettuce, tomato, onion, pickles, ketchup, mustard', 7.99),
('burger', 'Bacon Burger', 'Beef patty, bacon, lettuce, tomato, onion, pickles, BBQ sauce', 8.99),
('burger', 'Veggie Burger', 'Veggie patty, lettuce, tomato, onion, pickles, mayo', 7.99),
('drink', 'Coca-Cola', '330ml can', 1.99),
('drink', 'Sprite', '330ml can', 1.99),
('drink', 'Fanta', '330ml can', 1.99),
('drink', 'Water', '500ml bottle', 1.49);


INSERT INTO pizzaOrder (dateOrder, delivery, productSum, price, storeId, productId, employeeId, dateDelivery)
VALUES
('2024-04-12 12:00:00', 'yes', 1, 8.99, 1, 10, 1, '2024-04-12 13:00:00'),
('2024-04-12 12:30:00', 'yes', 2, 17.98, 2, 2, 2, '2024-04-12 13:30:00'),
('2024-04-12 13:00:00', 'no', 1, 6.99, 3, 3, 3, NULL),
('2024-04-12 13:30:00', 'yes', 1, 10.99, 4, 4, 4, '2024-04-12 14:30:00'),
('2024-04-12 14:00:00', 'yes', 2, 17.98, 1, 1, 1, '2024-04-12 15:00:00'),
('2024-04-12 14:30:00', 'no', 1, 1.99, 2, 2, 2, NULL),
('2024-04-12 15:00:00', 'yes', 1, 8.99, 3, 3, 3, '2024-04-12 16:00:00'),
('2024-04-12 15:30:00', 'yes', 1, 10.99, 4, 4, 4, '2024-04-12 16:30:00'),
('2024-04-12 16:00:00', 'no', 1, 1.99, 5, 1, 1, NULL),
('2024-04-12 16:30:00', 'yes', 2, 17.98, 6, 2, 2, '2024-04-12 17:30:00'),
('2024-04-12 17:00:00', 'yes', 1, 8.99, 7, 3, 3, '2024-04-12 18:00:00'),
('2024-04-12 17:30:00', 'no', 1, 1.99, 8, 4, 4, NULL),
('2024-04-12 18:00:00', 'yes', 1, 6.99, 9, 1, 1, '2024-04-12 19:00:00'),
('2024-04-12 18:30:00', 'yes', 2, 21.98, 10, 2, 2, '2024-04-12 19:30:00'),
('2024-04-12 19:00:00', 'no', 1, 1.99, 1, 3, 3, NULL),
('2024-04-12 19:30:00', 'yes', 1, 8.99, 2, 4, 4, '2024-04-12 20:30:00'),
('2024-04-12 20:00:00', 'yes', 1, 10.99, 3, 1, 1, '2024-04-12 21:00:00'),
('2024-04-12 20:30:00', 'no', 1, 1.99, 4, 2, 2, NULL),
('2024-04-12 21:00:00', 'yes', 2, 17.98, 5, 3, 3, '2024-04-12 22:00:00'),
('2024-04-12 21:30:00', 'yes', 1, 6.99, 6, 4, 4, '2024-04-12 22:30:00');





