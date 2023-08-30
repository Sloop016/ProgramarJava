Funcion divisores <- numt ( num )
	Definir i Como Entero
	para i <- 1 hasta num Hacer
		si num mod i = 0 Entonces
			Escribir  i
		FinSi
	FinPara
Fin Funcion

Algoritmo ej6_divisores
	Definir num Como Entero
	Escribir "escriba un numero a dividir"
	leer num
	Escribir "Sus divisores son: " 
	Escribir numt(num)
FinAlgoritmo
//Realizar una función que calcule y retorne la suma de todos los divisores del número n distin-
//tos de n. El valor de n debe ser ingresado por el usuario.