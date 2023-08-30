//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
Algoritmo ejercicio5
	
	Definir num  Como Entero
	Definir total como real
	Escribir "escriba un numero " 
	leer num
	Escribir primo(num)
	
FinAlgoritmo
funcion nm <- primo (num)
	Definir cont, i como entero
	cont=0
	para i <- 1 Hasta num Hacer
		si num mod i = 0 Entonces
			cont=cont+1
		FinSi
	FinPara
	si cont = 2 Entonces
		Escribir Sin Saltar "Es primo "
	sino 
		Escribir sin saltar "No es primo "
	FinSi
FinFuncion
	