USE universidad;

-- Retorna un llistat amb el primer cognom, segon cognom i el nom de tots els/les alumnes. El llistat haurà d'estar ordenat alfabèticament de menor a major pel primer cognom, segon cognom i nom.
SELECT apellido1, apellido2, nombre FROM persona p
WHERE p.tipo = 'alumno'
ORDER BY apellido1 ASC, apellido2 ASC, nombre ASC;
-- Esbrina el nom i els dos cognoms dels alumnes que no han donat d'alta el seu número de telèfon en la base de dades.
SELECT nombre, apellido1, apellido2 FROM persona
WHERE tipo = 'alumno' AND telefono IS NULL;
-- Retorna el llistat dels alumnes que van néixer en 1999.
SELECT * FROM persona
WHERE tipo = 'alumno' AND YEAR(fecha_nacimiento) = 1999;
-- Retorna el llistat de professors/es que no han donat d'alta el seu número de telèfon en la base de dades i a més el seu NIF acaba en K.
SELECT * FROM persona
WHERE tipo = 'profesor' AND telefono IS NULL AND nif LIKE '%K';
-- Retorna el llistat de les assignatures que s'imparteixen en el primer quadrimestre, en el tercer curs del grau que té l'identificador 7.
SELECT * FROM asignatura
WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7;
-- Retorna un llistat dels professors/es juntament amb el nom del departament al qual estan vinculats. El llistat ha de retornar quatre columnes, primer cognom, segon cognom, nom i nom del departament. El resultat estarà ordenat alfabèticament de menor a major pels cognoms i el nom.
SELECT p.apellido1, p.apellido2, p.nombre, d.nombre FROM persona p
JOIN profesor pr ON pr.id_profesor = p.id
JOIN departamento d ON d.id = pr.id_departamento
WHERE p.tipo = 'profesor'
ORDER BY p.apellido1 ASC, p.apellido2 ASC, p.nombre ASC;
-- Retorna un llistat amb el nom de les assignatures, any d'inici i any de fi del curs escolar de l'alumne/a amb NIF 26902806M.
SELECT a.nombre AS Asignaturas, ce.anyo_inicio, ce.anyo_fin, p.nombre, p.nif FROM persona p
JOIN alumno_se_matricula_asignatura asm ON asm.id_alumno = p.id
JOIN asignatura a ON a.id = asm.id_asignatura
JOIN curso_escolar ce ON ce.id = asm.id_curso_escolar
WHERE p.nif LIKE '26902806M';
-- Retorna un llistat amb el nom de tots els departaments que tenen professors/es que imparteixen alguna assignatura en el Grau en Enginyeria Informàtica (Pla 2015).
SELECT DISTINCT d.nombre FROM departamento d
JOIN profesor p ON p.id_departamento = d.id
JOIN asignatura a ON p.id_profesor = a.id_profesor
JOIN grado g ON a.id_grado = g.id
WHERE g.nombre = 'Grado en Ingeniería Informática (Plan 2015)';
-- Retorna un llistat amb tots els alumnes que s'han matriculat en alguna assignatura durant el curs escolar 2018/2019.
SELECT DISTINCT p.* FROM persona p
JOIN alumno_se_matricula_asignatura asm ON asm.id_alumno = p.id
JOIN curso_escolar ce ON ce.id = asm.id_curso_escolar
WHERE p.tipo = 'alumno' AND (ce.anyo_inicio = 2018 OR ce.anyo_inicio = 2019);

-- Resol les 6 següents consultes utilitzant les clàusules LEFT JOIN i RIGHT JOIN.

-- Retorna un llistat amb els noms de tots els professors/es i els departaments que tenen vinculats. El llistat també ha de mostrar aquells professors/es que no tenen cap departament associat. El llistat ha de retornar quatre columnes, nom del departament, primer cognom, segon cognom i nom del professor/a. El resultat estarà ordenat alfabèticament de menor a major pel nom del departament, cognoms i el nom.
SELECT d.nombre, p.apellido1, p.apellido2, p.nombre FROM persona p
LEFT JOIN profesor pr ON pr.id_profesor = p.id
LEFT JOIN departamento d ON d.id = pr.id_departamento
WHERE p.tipo = 'profesor'
ORDER BY d.nombre ASC, p.apellido1 ASC, p.apellido2 ASC, p.nombre ASC;
-- Retorna un llistat amb els professors/es que no estan associats a un departament.
SELECT * FROM persona p
LEFT JOIN profesor pr ON pr.id_profesor = p.id
LEFT JOIN departamento d ON d.id = pr.id_departamento
WHERE p.tipo = 'profesor' AND pr.id_departamento IS NULL;
-- Retorna un llistat amb els departaments que no tenen professors/es associats.
SELECT d.nombre FROM departamento d
LEFT JOIN profesor pr ON pr.id_departamento = d.id
WHERE pr.id_departamento IS NULL;
-- Retorna un llistat amb els professors/es que no imparteixen cap assignatura.
SELECT p.* FROM persona p
LEFT JOIN profesor pr ON pr.id_profesor = p.id
LEFT JOIN asignatura a ON a.id_profesor = pr.id_profesor
WHERE p.tipo = 'profesor' AND a.id_profesor IS NULL;
-- Retorna un llistat amb els departaments que no tenen professors/es associats.
SELECT d.* FROM departamento d
LEFT JOIN profesor p ON p.id_departamento = d.id
WHERE p.id_departamento IS NULL;
-- Retorna un llistat amb les assignatures que no tenen un professor/a assignat.
SELECT a.* FROM asignatura a
LEFT JOIN profesor p ON p.id_profesor = a.id_profesor
WHERE a.id_profesor IS NULL;
-- Retorna un llistat amb tots els departaments que no han impartit assignatures en cap curs escolar.
SELECT DISTINCT d.nombre FROM departamento d
LEFT JOIN profesor pr ON d.id = pr.id_departamento
LEFT JOIN asignatura a ON pr.id_profesor = a.id_profesor
LEFT JOIN alumno_se_matricula_asignatura asm ON a.id = asm.id_asignatura
LEFT JOIN curso_escolar ce ON asm.id_curso_escolar = ce.id
WHERE a.id IS NULL AND ce.id IS NULL;

-- Consultes resum:

-- Retorna el nombre total d'alumnes que hi ha.
SELECT COUNT(*) AS total_alumnos FROM persona
WHERE tipo = 'alumno';
-- Calcula quants alumnes van néixer en 1999.
SELECT COUNT(*) AS total_alumnos1999 FROM persona p
WHERE p.tipo = 'alumno' AND YEAR(p.fecha_nacimiento) = 1999;
-- Calcula quants professors/es hi ha en cada departament. El resultat només ha de mostrar dues columnes, una amb el nom del departament i una altra amb el nombre de professors/es que hi ha en aquest departament. El resultat només ha d'incloure els departaments que tenen professors/es associats i haurà d'estar ordenat de major a menor pel nombre de professors/es.
SELECT d.nombre AS nombre_departamento, COUNT(pr.id_profesor) AS total_profesores
FROM departamento d
JOIN profesor pr ON pr.id_departamento = d.id
GROUP BY d.nombre
ORDER BY total_profesores DESC;
-- Retorna un llistat amb tots els departaments i el nombre de professors/es que hi ha en cadascun d'ells. Tingui en compte que poden existir departaments que no tenen professors/es associats. Aquests departaments també han d'aparèixer en el llistat.
SELECT d.nombre AS nombre_departamento, COUNT(pr.id_profesor) AS total_profesores
FROM departamento d
LEFT JOIN profesor pr ON pr.id_departamento = d.id
GROUP BY d.nombre
ORDER BY total_profesores DESC;
-- Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun. Tingues en compte que poden existir graus que no tenen assignatures associades. Aquests graus també han d'aparèixer en el llistat. El resultat haurà d'estar ordenat de major a menor pel nombre d'assignatures.
SELECT g.nombre AS Grado, COUNT(a.id) AS num_asignaturas
FROM grado g
LEFT JOIN asignatura a ON a.id_grado = g.id
GROUP BY g.nombre
ORDER BY num_asignaturas DESC;
-- Retorna un llistat amb el nom de tots els graus existents en la base de dades i el nombre d'assignatures que té cadascun, dels graus que tinguin més de 40 assignatures associades.
SELECT g.nombre AS Grado, COUNT(a.id) AS num_asignaturas
FROM grado g
JOIN asignatura a ON a.id_grado = g.id
GROUP BY g.nombre
HAVING COUNT(a.id) > 40;
-- Retorna un llistat que mostri el nom dels graus i la suma del nombre total de crèdits que hi ha per a cada tipus d'assignatura. El resultat ha de tenir tres columnes: nom del grau, tipus d'assignatura i la suma dels crèdits de totes les assignatures que hi ha d'aquest tipus.
SELECT g.nombre AS nombre_grado, a.tipo AS tipo_asignatura, SUM(a.creditos) AS total_creditos
FROM grado g
JOIN asignatura a ON a.id_grado = g.id
GROUP BY g.nombre, a.tipo;
-- Retorna un llistat que mostri quants alumnes s'han matriculat d'alguna assignatura en cadascun dels cursos escolars. El resultat haurà de mostrar dues columnes, una columna amb l'any d'inici del curs escolar i una altra amb el nombre d'alumnes matriculats.
SELECT ce.anyo_inicio AS curso, COUNT(p.id) AS cantidad_alumnos FROM curso_escolar ce
JOIN alumno_se_matricula_asignatura asm ON asm.id_curso_escolar = ce.id
JOIN persona p ON p.id = asm.id_alumno
WHERE p.tipo = 'alumno'
GROUP BY curso;
-- Retorna un llistat amb el nombre d'assignatures que imparteix cada professor/a. El llistat ha de tenir en compte aquells professors/es que no imparteixen cap assignatura. El resultat mostrarà cinc columnes: id, nom, primer cognom, segon cognom i nombre d'assignatures. El resultat estarà ordenat de major a menor pel nombre d'assignatures.
SELECT p.id, p.nombre, p.apellido1, p.apellido2, COUNT(a.id) AS num_asignaturas
FROM persona p
LEFT JOIN profesor pr ON pr.id_profesor = p.id
LEFT JOIN asignatura a ON a.id_profesor = pr.id_profesor
WHERE p.tipo = 'profesor'
GROUP BY p.id, p.nombre, p.apellido1, p.apellido2
ORDER BY num_asignaturas DESC;
-- Retorna totes les dades de l'alumne/a més jove.
SELECT * FROM persona
WHERE tipo = 'alumno'
ORDER BY fecha_nacimiento DESC LIMIT 1;
-- Retorna un llistat amb els professors/es que tenen un departament associat i que no imparteixen cap assignatura.
SELECT p.nombre AS profesores_sin_dep_ni_as FROM persona p
LEFT JOIN profesor pr ON pr.id_profesor = p.id
LEFT JOIN departamento d ON d.id = pr.id_departamento
LEFT JOIN asignatura a ON a.id_profesor = pr.id_profesor
WHERE p.tipo = 'profesor' AND pr.id_departamento IS NOT NULL AND a.id_profesor IS NULL;
