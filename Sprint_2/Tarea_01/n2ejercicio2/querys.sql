-- Llista quants productes de categoria 'Begudes' s'han venut en una determinada localitat.

SELECT COUNT(*) AS total_drinks_sold
FROM pizzaOrder po
JOIN product p ON po.productId = p.idProduct
JOIN store s ON po.storeId = s.idStore
WHERE p.productType = 'drink'
AND s.cityId = 1;



-- Llista quantes comandes ha efectuat un determinat empleat/da.

SELECT COUNT(*) AS comandes_de_dempleat
FROM pizzaOrder
WHERE employeeId = 1;