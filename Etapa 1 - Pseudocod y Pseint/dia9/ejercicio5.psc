Algoritmo ejercicio5
	
	Definir num, sumOdd, sumEven, iOdd, iEven Como Entero
	
	sumEven = 0
	sumOdd = 0
	iEven = 0
	iOdd = 0
	
	Hacer
		Escribir "Ingrese un número"
		Leer num
		
		Si num % 2 == 0 Entonces
			sumEven = sumEven + num
			iEven = iEven + 1
		SiNo
			sumOdd = sumOdd + num
			iOdd = iOdd + 1
		FinSi
	Mientras Que (iEven + iOdd) < 10
	
	Escribir "Pares ingresados: " iEven " | Suma: " sumEven " | Media: " sumEven / iEven
	Escribir "Impares ingresados: " iOdd " | Suma: " sumOdd " | Media: " sumOdd / iOdd
	
FinAlgoritmo
