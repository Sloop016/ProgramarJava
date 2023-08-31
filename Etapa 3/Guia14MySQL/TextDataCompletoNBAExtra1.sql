-- 1 - Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
use nba;
select nombre from jugadores order by nombre;
-- 2 - Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
select nombre from jugadores where Posicion like '%C%' and peso >200 order by nombre;
-- 3 - Mostrar el nombre de todos los equipos ordenados alfabéticamente.
select nombre from equipos order by nombre;
-- 4 - Mostrar el nombre de los equipos del este (East).
select * from equipos where Conferencia like '%East%' order by nombre;
-- 5 - Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
select * from equipos where ciudad like 'C%' order by nombre;
-- 6 - Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
select j.nombre as Jugador, e.nombre as Equipo from jugadores j, equipos e where j.Nombre_equipo=e.Nombre order by e.nombre, j.Nombre;
-- 7 - Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
select j.nombre as Jugadores, e.nombre as Equipo from Jugadores j, equipos e where j.nombre_equipo=e.nombre and e.nombre like 'Raptors' order by j.nombre;
-- 8 - Mostrar los puntos por partido del jugador ‘Pau Gasol’.
select puntos_por_partido from estadisticas e, jugadores j where e.jugador = j.codigo and j.Nombre = 'pau gasol';
-- 9 - Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
select puntos_por_partido from estadisticas e, jugadores j where e.jugador = j.codigo and j.Nombre = 'pau gasol' and e.temporada = '04/05';
-- 10 - Mostrar el número de puntos de cada jugador en toda su carrera.
 select j.nombre, sum(e.puntos_por_partido)as puntos from jugadores j, estadisticas e where j.codigo = e.jugador group by j.Nombre order by j.nombre;
 -- 11 - Mostrar el número de jugadores de cada equipo.
 select j.nombre_equipo, count(*) from jugadores j group by j.nombre_equipo;
 -- 12 - Mostrar el jugador que más puntos ha realizado en toda su carrera.
select t.nombre from (select j.nombre, sum(e.Puntos_por_partido) as puntos from jugadores j, estadisticas e where j.codigo = e.jugador group by j.nombre order by j.nombre) t where t.puntos = (select max(t2.puntos) from (select j.nombre, sum(e.Puntos_por_partido) as puntos from jugadores j , estadisticas e where j.codigo = e.jugador group by j.nombre order by j.nombre )t2) ;
-- 13 - Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
select e.nombre, e.conferencia, e.division from Jugadores j, equipos e where j.nombre_equipo=e.nombre and j.altura = (select max(altura) from jugadores);
-- 14 - Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT *, ABS(puntos_local - puntos_visitante) AS 'Diferencia' FROM partidos WHERE ABS(puntos_local - puntos_visitante) = (SELECT MAX(ABS(puntos_local - puntos_visitante)) FROM partidos);
select equipo_local, equipo_visitante, diferencia from (select equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as diferencia from partidos) where diferencia = (select max(abs(puntos_local - puntos_visitante) ) from partidos);
-- 15 - Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,equipo_ganador), en caso de empate sera null.
select codigo, equipo_local, equipo_visitante, case when p.puntos_local>p.puntos_visitante then equipo_local when p.puntos_local<p.puntos_visitante then equipo_visitante else null end as Equipo_Ganador , puntos_local, puntos_visitante from partidos p;
SELECT j.Nombre, ROUND(SUM(es.Puntos_por_partido)) AS 'Puntos totales en su carrera' FROM jugadores j, estadisticas es WHERE es.jugador = j.codigo GROUP BY j.Nombre ORDER BY SUM(es.Puntos_por_partido) DESC LIMIT 1;