Algoritmo ejercicio3
	Definir num, i, suma, promedio Como REal
	Escribir "ingrese un numero"
	leer num
	suma = 0
	i = 0
	mientras num <> -1 Hacer
		suma = suma + num
		Escribir "Continue ingresando numeros"
		i = i + 1
		Escribir "Ingrese otro número"
		Leer num
	FinMientras
	
	si i <> 0 Entonces
		promedio=suma/i
		Escribir "su promedio es: " promedio
	sino 
		Escribir "su programa finalizo"
	FinSi
	
	

FinAlgoritmo