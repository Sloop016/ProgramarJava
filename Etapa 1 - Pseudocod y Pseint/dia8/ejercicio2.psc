Algoritmo ejercicio2
	Definir vlimite, num, suma Como Real
	Escribir "ingrese numero limite"
	leer vlimite
	Escribir "ahora ingrese el numero a sumar"
	leer num
	suma = 0
	mientras (vlimite >= num) Hacer
		Escribir "ingrese un valor a sumar"
		leer suma
		num = (suma+num)
		Escribir "resultado, continue poniendo numeros. Ya vamos: " num
	FinMientras
	Escribir "Ya se paso el valor limite es " num
FinAlgoritmo
