
USE optica;

-- Llista el total de factures d'un client/a en un període determinat.
SELECT * FROM sale 
WHERE customerId = 1
AND dateSale BETWEEN '2024-04-08 00:00:00' AND '2024-04-25 00:00:00';

-- Llista els diferents models d'ulleres que ha venut un empleat/da durant un any.
SELECT DISTINCT glasses.*
FROM sale s
LEFT JOIN glasses ON s.glassesId = glasses.idGlasses
WHERE employeeId = 3
AND dateSale BETWEEN '2023-04-25 00:00:00' AND '2024-04-25 00:00:00';


-- Llista els diferents proveïdors que han subministrat ulleres venudes amb èxit per l'òptica.
SELECT DISTINCT supplier.nameSupplier
FROM sale s
JOIN glasses g ON s.glassesId = g.idGlasses
JOIN supplier ON g.supplierId = supplier.idSupplier;





