use jardineria;
-- 1 - Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
select codigo_oficina, ciudad from oficina;
-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
select ciudad , telefono from oficina where pais like 'españa';
-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
select * from empleado;
select nombre, apellido1, email from empleado where codigo_jefe = 7;
-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
select puesto, nombre, apellido1 , email from empleado where puesto like 'director general'; 
-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
select nombre, apellido1, puesto from empleado where puesto not like 'Representante ventas';
-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
select nombre_cliente from cliente where pais like 'spain';
-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
select distinct estado from pedidos;
-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos.
select distinct codigo_cliente from pago where extract(year from fecha_pago ) = '2008';
-- 9 Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where not fecha_esperada >= fecha_entrega;
-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de 
-- entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
SELECT codigo_pedido as Pedido, codigo_cliente as Cliente, fecha_esperada as Estimada, fecha_entrega as Entrega from pedido WHERE(extract(day from fecha_esperada)-2) = EXTRACT(day from fecha_entrega) and extract(month from fecha_entrega) = extract(month from fecha_esperada);
-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
select * from pedido where estado like 'rechazado';
-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
select * from pedido where (extract(month from fecha_entrega) = 1) and estado like 'entregado';
-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
select * from pago where forma_pago like 'paypal' and (extract(year from fecha_pago) = '2008') order by total desc;
-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
select distinct forma_pago from pago;
-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. 
-- El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
select * from producto where gama like 'ornamentales' and cantidad_en_stock>100 order by precio_venta desc;
-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30. 
select * from cliente where ciudad like 'madrid' and codigo_empleado_rep_ventas in (11,30);
-- Consultas multitabla (Composición interna)
-- Las consultas se deben resolver con INNER JOIN.
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
select c.*, e.nombre as 'Nombre del empleado', e.apellido1 as 'Apellido del Empleado' from cliente c inner join empleado e where puesto like 'representante ventas';
-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
select cliente.nombre_cliente, empleado.nombre from cliente inner join empleado on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas join pago on pago.codigo_cliente = cliente.codigo_cliente;
-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
select distinct cliente.nombre_cliente, empleado.nombre from cliente inner join empleado on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas join pago on pago.codigo_cliente = cliente.codigo_cliente where pago.codigo_cliente is null;
SELECT cliente.nombre_cliente , empleado.nombre FROM cliente  join empleado  ON empleado.codigo_empleado=cliente.codigo_empleado_rep_ventas join pago on pago.codigo_Cliente=cliente.codigo_cliente 
WHERE pago.codigo_cliente is null;
-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select cliente.nombre_cliente, empleado.nombre from cliente inner join empleado on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas join pago on pago.codigo_cliente = cliente.codigo_cliente join oficina on oficina.codigo_oficina = empleado.codigo_oficina;
-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select cliente.nombre_cliente, empleado.nombre from cliente inner join empleado on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas join pago on pago.codigo_cliente != cliente.codigo_cliente join oficina on oficina.codigo_oficina = empleado.codigo_oficina;
-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
select oficina.linea_direccion1 ,cliente.nombre_cliente, cliente.ciudad from empleado inner join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado inner join oficina on oficina.codigo_oficina = empleado.codigo_oficina where cliente.ciudad like 'Fuenlabrada';
-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select cliente.nombre_cliente, empleado.nombre, empleado.apellido1, empleado.puesto, oficina.ciudad from empleado inner join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado inner join oficina on oficina.codigo_oficina = empleado.codigo_oficina where empleado.puesto = 'Representante Ventas';
-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
select * from empleado;
select e1.nombre as nombre_empleado,e1.apellido1 as apellido_empleado, e2.nombre as nombre_Jefe, e2.apellido1 as apellido_Jefe FROM empleado e1 JOIN empleado e2 ON e1.codigo_jefe = e2.codigo_empleado order by e1.codigo_jefe;
-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
select cliente.nombre_cliente, pedido.fecha_esperada, pedido.fecha_entrega from cliente join pedido on cliente.codigo_cliente = pedido.codigo_cliente where not fecha_esperada >= fecha_entrega;
-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
select cliente.* ,producto.gama as 'Tipo de gama comprado' from cliente join pedido on cliente.codigo_cliente = pedido.codigo_cliente join detalle_pedido on pedido.codigo_pedido = detalle_pedido.codigo_pedido join producto on detalle_pedido.codigo_producto = producto.codigo_producto ;
-- Consultas multitabla (Composición externa)
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
select * from pago;
select cliente.*, pedido.estado as pedido from cliente left join pedido on pedido.codigo_cliente= cliente.codigo_cliente where pedido.estado like 'rechazado';
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
select cliente.nombre_cliente, pedido.codigo_cliente from cliente left join pago on pago.codigo_cliente=cliente.codigo_cliente left join pedido on pedido.codigo_cliente =cliente.codigo_cliente where pedido.codigo_cliente is null ;
-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
select cliente.nombre_cliente, pago.total , pedido.codigo_cliente from cliente left join pago on pago.codigo_cliente=cliente.codigo_cliente left join pedido on pedido.codigo_cliente =cliente.codigo_cliente where pago.codigo_cliente is null or pedido.codigo_cliente is null;
-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select cliente.nombre_cliente, empleado.nombre as 'Representante de Ventas' , oficina.ciudad as 'Ciudad de la oficina' from pago left join cliente on pago.codigo_cliente = cliente.codigo_cliente left join empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado left join oficina on empleado.codigo_oficina = oficina.codigo_oficina where pago.codigo_cliente > 0;
-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select cliente.nombre_cliente, empleado.nombre as 'Representante de Ventas' , oficina.ciudad as 'Ciudad de la oficina' from pago left join cliente on pago.codigo_cliente = cliente.codigo_cliente join empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado join oficina on empleado.codigo_oficina = oficina.codigo_oficina where pago.codigo_cliente is null;
-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
select distinct nombre_cliente, oficina.* from oficina left join empleado on oficina.codigo_oficina=empleado.codigo_oficina left join cliente on empleado.codigo_empleado = cliente.codigo_empleado_rep_ventas where cliente.ciudad like 'Fuenlabrada';
-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
select cliente.nombre_cliente , empleado.nombre, empleado.puesto, oficina.ciudad as 'Ciudad de la Oficina' from cliente left join empleado on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado left join oficina on empleado.codigo_oficina = oficina.codigo_oficina where empleado.puesto like 'Representante Ventas';
-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
select e1.nombre,e1.apellido1, e1.puesto," →" as "", e2.nombre,e2.apellido1,e2.puesto from empleado e1 left join empleado e2 on e1.codigo_jefe = e2.codigo_empleado;
-- 9 Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
select cliente.nombre_cliente, pedido.fecha_esperada, pedido.fecha_entrega from cliente inner join pedido on cliente.codigo_cliente = pedido.codigo_cliente where not pedido.fecha_esperada >= pedido.fecha_entrega;
-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
select c.nombre_cliente, gp.gama, gp.descripcion_texto from cliente c inner join pedido p on c.codigo_cliente = p.codigo_cliente inner join detalle_pedido dp on p.codigo_pedido = dp.codigo_pedido inner join producto pr on dp.codigo_producto = pr.codigo_producto inner join gama_producto gp on pr.gama = gp.gama group by c.nombre_cliente ;
-- Consultas multitabla (Composición externa)
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
-- 1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
select cliente.nombre_cliente, pago.total from cliente left join pago on cliente.codigo_cliente = pago.codigo_cliente where pago.total is null;
-- 2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
select cliente.nombre_cliente, pedido.codigo_pedido from cliente left join pedido on cliente.codigo_cliente = pedido.codigo_cliente where pedido.codigo_pedido is null;
-- 3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
select cliente.nombre_cliente, pago.total , pedido.codigo_cliente from cliente left join pago on pago.codigo_cliente=cliente.codigo_cliente left join pedido on pedido.codigo_cliente =cliente.codigo_cliente where pago.codigo_cliente is null or pedido.codigo_cliente is null;
-- 4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
select empleado.nombre, oficina.ciudad from empleado left join oficina on empleado.codigo_oficina = oficina.codigo_oficina where empleado.codigo_oficina is null;
-- 5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
select empleado.nombre, empleado.apellido1, empleado.puesto, cliente.nombre_cliente from empleado left join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado where cliente.codigo_empleado_rep_ventas is null;
-- 6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
select empleado.nombre, empleado.apellido1, empleado.puesto from empleado left join cliente on cliente.codigo_empleado_rep_ventas = empleado.codigo_empleado left join oficina on empleado.codigo_oficina = oficina.codigo_oficina where cliente.codigo_empleado_rep_ventas is null or oficina.codigo_oficina is null;
