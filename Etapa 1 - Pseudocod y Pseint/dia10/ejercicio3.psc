//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
//Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//reprueba el curso si tiene una nota final inferior a 6.5
//Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//La mayor nota obtenida en las exposiciones.
//Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.
Algoritmo Ej3
	Definir notaF, tpInt, expo, Parc, PrParc como real
	Definir alumno, i, desaprobados, acdesaprobados, IntMayor, expomayor como REAL
	
	Escribir "indique el total de alumnos"
	leer alumno
	
	desaprobados=0
	acdesaprobados = 0
	IntMayor= 0
	expomayor=0
	PrParc= 0
	Para i = 1 Hasta alumno hacer
		Escribir "ingresar las notas del alumno (Practico, Exposicion, Parcial)"
		leer tpInt
		leer expo
		leer Parc
		Escribir "Integrador: " tpInt " Exposicion: " expo " Parcial: " Parc
		notaF = tpInt*0.35 + expo*0.25 + Parc*0.4
		Escribir "promedio de: " notaF
		si notaF < 6.5 Entonces
			acdesaprobados = acdesaprobados + notaF
			desaprobados = desaprobados+ 1
		FinSi
		si tpInt >7.5 Entonces
			IntMayor = IntMayor + 1
		FinSi
		si expo > expomayor Entonces
			expomayor = expo
		FinSi
		si Parc >= 4 y Parc <= 7.5 Entonces
			PrParc = PrParc+1
		FinSi
 	Fin Para
	Escribir "---------------------------------------------------"
	Escribir "alumnos desaprobados " acdesaprobados / desaprobados 
	Escribir "Porcentaje de alumnos con nota de tp integrador mayor a 7.5 son: " IntMayor / alumno *100 "%"
	Escribir "Nota mayor en Exposicion: " expomayor
	Escribir "Total de estudiantes con notas parciales entre 4 y 7.5 son: " PrParc
	Escribir "---------------------------------------------------"
FinAlgoritmo
