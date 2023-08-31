DROP DATABASE IF EXISTS personal;
CREATE DATABASE personal CHARACTER SET utf8mb4;
USE personal;
CREATE TABLE departamentos (
id_depto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre_depto VARCHAR(20) NOT NULL,
  ciudad VARCHAR(15) NULL,
  nombre_jefe_depto CHAR(30) NULL
);
CREATE TABLE empleados (
  id_emp INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre CHAR(30) NOT NULL,
  sex_emp CHAR(1) NOT NULL,
  fec_nac DATE NOT NULL,
  fec_incorporacion DATE NOT NULL,
  sal_emp FLOAT NOT NULL,
  comision_emp FLOAT NOT NULL,
  cargo_emp VARCHAR(15) NOT NULL,
  id_depto INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_depto) REFERENCES departamentos(id_depto)
  );
-- Insertar datos en la tabla `departamentos`
INSERT INTO `departamentos` VALUES (1000,'GERENCIA','CIUDAD REAL','Bruno Cebrian');
INSERT INTO `departamentos` VALUES (1500,'PRODUCCIÓN','CIUDAD REAL','Jesica Duran');
INSERT INTO `departamentos` VALUES (2000,'VENTAS','CIUDAD REAL','Alicia Andres');
INSERT INTO `departamentos` VALUES (2100,'VENTAS','BARCELONA','Fabian Soto');
INSERT INTO `departamentos` VALUES (2200,'VENTAS','VALENCIA','Mari Plaza');
INSERT INTO `departamentos` VALUES (2300,'VENTAS','MADRID','Jonatan Acuña');
INSERT INTO `departamentos` VALUES (3000,'INVESTIGACIÓN','CIUDAD REAL','Valentina Sola');
INSERT INTO `departamentos` VALUES (3500,'MERCADEO','CIUDAD REAL','Abraham Diego');
INSERT INTO `departamentos` VALUES (4000,'MANTENIMIENTO','CIUDAD REAL','Raúl Carrero');
INSERT INTO `departamentos` VALUES (4100,'MANTENIMIENTO','BARCELONA','Catalina Valdes');
INSERT INTO `departamentos` VALUES (4200,'MANTENIMIENTO','VALENCIA','Adriana Rocha');
INSERT INTO `departamentos` VALUES (4300,'MANTENIMIENTO','MADRID','German Luna');
-- Insertar datos en la tabla `empleados`
INSERT INTO `empleados` VALUES (222,'José Giraldo','M','1985-01-20','2000-11-01',1200000,400000,'Asesor',3500);
INSERT INTO `empleados` VALUES (333,'Pedro Blanco','M','1987-10-28','2000-10-01',800000,3000000,'Vendedor',2000);
INSERT INTO `empleados` VALUES (444,'Jesús Alfonso','M','1988-03-14','2000-10-01',800000,3500000,'Vendedor',2000);
INSERT INTO `empleados` VALUES (555,'Julián Mora','M','1989-07-03','2000-10-01',800000,3100000,'Vendedor',2200);
INSERT INTO `empleados` VALUES (666,'Manuel Millán','M','1990-12-08','2004-06-01',800000,3700000,'Vendedor',2300);
INSERT INTO `empleados` VALUES (777,'Marcos Cortez','M','1986-06-23','2000-04-16',2550000,500000,'Mecánico',4000);
INSERT INTO `empleados` VALUES (782,'Antonio Gil','M','1980-01-23','2010-04-16',850000,1500000,'Técnico',1500);
INSERT INTO `empleados` VALUES (219,'Melissa Roa','F','1960-06-19','2001-03-16',2250000,2500000,'Vendedor',2100);
INSERT INTO `empleados` VALUES (111,'Irene Díaz','F','1979-09-28','2004-06-01',1050000,200000,'Mecánico',4200);
INSERT INTO `empleados` VALUES (383,'Luis Pérez','M','1956-02-25','2000-01-01',5050000,0,'Director',1500);
INSERT INTO `empleados` VALUES (060,'Darío Casas','M','1960-04-05','1992-11-01',4500000,500000,'Investigador',3000);
INSERT INTO `empleados` VALUES (802,'William Daza','M','1982-10-09','1999-12-16',2250000,1000000,'Investigador',3000);
INSERT INTO `empleados` VALUES (221,'Carla López','F','1975-05-11','2005-07-16',4500000,500000,'Jefe Mercadeo',3500);
INSERT INTO `empleados` VALUES (331,'Carlos Rozo','M','1975-05-11','2001-09-16',750000,500000,'Vigilante',3500);
INSERT INTO `empleados` VALUES (099,'Diana Solarte','F','1957-11-19','1990-05-16',1250000,500000,'Secretaria',1000);
INSERT INTO `empleados` VALUES (144,'Rosa Angulo','F','1957-03-15','1998-08-16',3250000,3500000,'Jefe Ventas',2000);
INSERT INTO `empleados` VALUES (269,'María Rojas','F','1959-01-15','1990-05-16',6250000,1500000,'Gerente',1000);
INSERT INTO `empleados` VALUES (343,'Elisa Rojas','F','1979-09-28','2004-06-01',3000000,1000000,'Jefe Mecánicos',4000);
INSERT INTO `empleados` VALUES (334,'Marisol Pulido','F','1979-10-01','1990-05-16',3250000,1000000,'Investigador',3000);
INSERT INTO `empleados` VALUES (335,'Ana Moreno','F','1992-01-05','2004-06-01',1200000,400000,'Secretaria',3000);
INSERT INTO `empleados` VALUES (336,'Carolina Ríos','F','1992-02-15','2000-10-01',1250000,500000,'Secretaria',1500);
INSERT INTO `empleados` VALUES (337,'Edith Muñoz','F','1992-03-31','2000-10-01',800000,3600000,'Vendedor',2100);
INSERT INTO `empleados` VALUES (338,'Abel Gómez','M','1939-12-24','2000-10-01',1050000,200000,'Mecánico',4300);
INSERT INTO `empleados` VALUES (689,'Mario Llano','M','1945-08-30','1990-05-16',2250000,2500000,'Vendedor',2300);
INSERT INTO `empleados` VALUES (785,'Joaquín Rosas','M','1947-07-07','1990-05-16',2250000,2500000,'Vendedor',2200);
INSERT INTO `empleados` VALUES (898,'Iván Duarte','M','1955-08-12','1998-05-16',1050000,200000,'Mecánico',4100);
-- fin de creacion de base 

-- 1/2-Obtener los datos completos de los empleados y depa.
SELECT nombre, sal_emp, (SELECT ABS(MAX(sal_emp) - MIN(sal_emp)) FROM empleados) AS 'Diferencia'
FROM empleados WHERE sal_emp = (SELECT MAX(sal_emp) FROM empleados)
OR sal_emp = (SELECT MIN(sal_emp) FROM empleados);
select * from empleados;
select * from departamentos;
-- 3- listar por nombres los departamentos
select nombre_depto from departamentos;
-- 4 - obtener nombre y salario de los empl
select nombre,sal_emp from empleados order by sal_emp desc;
-- 5 - Listar todas las comisiones.
select nombre, comision_emp from empleados order by comision_emp desc;
-- 6 - Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
select nombre, cargo_emp from empleados WHERE cargo_emp LIKE 'Secretaria%';
-- 7 - Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.
select nombre, cargo_emp from empleados WHERE cargo_emp LIKE 'Vendedor%' order by nombre;
-- 8 Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor. 
select nombre,sal_emp, cargo_emp from empleados order by sal_emp desc;
-- 9 - Obtener el nombre de o de los jefes que tengan su departamento situado en la ciudad de “Ciudad Real” 
select e.nombre , d.ciudad from departamentos d ,empleados e where d.id_depto = e.id_depto and d.ciudad = 'Ciudad Real';
-- 10 - Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.
select nombre, cargo_emp from empleados order by cargo_emp asc;
-- 11 - Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor. 
select nombre, sal_emp, comision_emp from empleados where id_depto = 2000 order by comision_emp desc;
-- 12 - Obtener el valor total a pagar a cada empleado del departamento 3000, que resulta
-- de: sumar el salario y la comisión, más una bonificación de 500. Mostrar el nombre del
-- empleado y el total a pagar, en orden alfabético.
select nombre, sum(sal_emp+comision_emp+500) from empleados where id_depto = 3000 group by nombre order by nombre asc;
-- 13 - Muestra los empleados cuyo nombre empiece con la letra J.
select nombre from empleados WHERE nombre LIKE 'J%' order by nombre;
-- 14 - Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.
select  id_emp , sum(sal_emp+comision_emp), nombre from empleados where (comision_emp > 1000) group by comision_emp;
-- 15 - Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.
select  id_emp , sum(sal_emp+comision_emp), nombre from empleados where comision_emp = 0 group by comision_emp;
-- 16 - Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
select id_emp , nombre, sal_emp , comision_emp from empleados where (comision_emp > sal_emp) group by comision_emp order by nombre;
-- 17 - Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
select id_emp , nombre, sal_emp , comision_emp from empleados where (comision_emp <= (sal_emp*0.3)) group by comision_emp order by nombre;
-- 18 - Hallar los empleados cuyo nombre no contiene la cadena “MA”
select nombre from empleados WHERE nombre not LIKE '%MA%' order by nombre;
-- 19 - Obtener los nombres de los departamentos que sean “Ventas”, “Investigación” o ‘Mantenimiento.
select id_depto, nombre_depto, ciudad from departamentos where (nombre_depto = 'VENTAS') or (nombre_depto = 'INVESTIGACIÓN') or (nombre_depto = 'MANTENIMIENTO');
-- 20 - Ahora obtener el contrario, los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.
select id_depto, nombre_depto, ciudad from departamentos where not (nombre_depto = 'VENTAS') and not (nombre_depto = 'INVESTIGACIÓN') and not (nombre_depto = 'MANTENIMIENTO');
-- 21 - Mostrar el salario más alto de la empresa.
select max(sal_emp) as 'mayor sueldo' from empleados;
-- 22 - Mostrar el nombre del último empleado de la lista por orden alfabético.
select max(nombre) as 'Ultimo empleado por orden Alfabetico' from empleados;
-- 23 - Hallar el salario más alto, el más bajo y la diferencia entre ellos.
select max(sal_emp) as 'mayor sueldo', min(sal_emp) as 'menor sueldo', max(sal_emp)-min(sal_emp) as 'Diferencia entre salarios' from empleados;
-- 24 - Hallar el salario promedio por departamento.
select e.id_depto, d.nombre_depto, d.ciudad, avg(e.sal_emp) from empleados e, departamentos d where e.id_depto = d.id_depto group by e.id_depto;
select d.nombre_depto, d.ciudad, avg(e.sal_emp) from empleados e, departamentos d where e.id_depto = d.id_depto group by d.nombre_depto;
select id_depto, avg(sal_emp) from empleados group by id_depto;
-- Consultas con Having
-- 25. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.
select d.id_depto, d.nombre_depto, d.ciudad, count(*) as 'Cantidad empleados' from departamentos d, empleados e where d.id_depto = e.id_depto group by d.id_depto having count(*) >= 3;
-- 26. Hallar los departamentos que no tienen empleados
select d.id_depto, d.nombre_depto, count(*) as 'Cantidad empleados' from departamentos d, empleados e where d.id_depto = e.id_depto group by d.id_depto having count(*) = 0;
-- Consulta subPrograma
-- 28 - Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
select e.* from departamentos d, empleados e where sal_emp >= (select avg(sal_emp) from empleados) and d.id_depto = e.id_depto order by d.nombre_depto; 