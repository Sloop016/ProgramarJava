//Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas vale
//el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres notas
//obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los datos del
//siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben estar
//comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el promedio
//y se mostrar� un mensaje de error.

Algoritmo ejercicio7
	Definir nombreAlumno Como Caracter
	Definir notaPractica, notaProblema, notaTeorica Como Entero
	Definir Promedio como real
	
	Escribir 'Ingrese el nombre del Alumno'
	Leer nombreAlumno

	Mientras nombreAlumno <> '' Hacer
		Escribir 'Ingrese la nota practica'
		Leer notaPractica
		Mientras (notaPractica < 0) o (notaPractica > 10) Hacer
			Escribir 'Error'
			Escribir 'Ingrese la nota practica'
			Leer notaPractica
		Fin Mientras
		
		Escribir 'Ingrese la nota de problemas'
		Leer notaProblema
		Mientras (notaProblema < 0) o (notaProblema > 10) Hacer
			Escribir 'Error'
			Escribir 'Ingrese la nota de problemas'
			Leer notaProblema
		Fin Mientras
		
		Escribir 'Ingrese la nota te�rica'
		Leer notaTeorica
		Mientras (notaTeorica < 0) o (notaTeorica > 10) Hacer
			Escribir 'Error'
			Escribir 'Ingrese la nota te�rica'
			Leer notaTeorica
		Fin Mientras
		Promedio= (notaPractica*0.10)+(notaProblema*0.5)+(notaTeorica*0.4)/3
		Limpiar Pantalla
		
		Escribir '=============================='
		Escribir 'Nombre           : ', nombreAlumno
		Escribir 'Nota practica    : ', notaPractica
		Escribir 'Nota Problema    : ', notaProblema
		Escribir 'Nota Teorica     : ', notaTeorica
		Escribir '=============================='
		Escribir 'Nota Promedio    : ', Promedio
		Escribir '=============================='

		
		Esperar 2 segundos
		Escribir 'Ingrese el nombre del Alumno'
		Leer nombreAlumno
	Fin Mientras
	
FinAlgoritmo