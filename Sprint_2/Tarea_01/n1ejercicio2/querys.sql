-- Llista quants productes de categoria 'Begudes' s'han venut en una determinada localitat.

SELECT COUNT(*) AS bebidas_vendidas
FROM pizzaOrder po
JOIN product p ON po.productId = p.idProduct
JOIN store s ON po.storeId = s.idStore
JOIN city ci ON s.cityId = ci.idCity
WHERE p.productType = 'Drink' AND ci.nameCity = 'City 1';


-- Llista quantes comandes ha efectuat un determinat empleat/da.

SELECT COUNT(*) AS comandes_de_dempleat
FROM pizzaOrder
WHERE employeeId = 1;