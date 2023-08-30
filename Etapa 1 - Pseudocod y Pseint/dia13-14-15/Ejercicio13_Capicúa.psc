//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//capicúa o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//transformar el numero a cadena para realizar el ejercicio.

Algoritmo capicua_o_no
	definir num como entero
	
	escribir "Ingrese un número para definir si es o no capicúa:"
	
	leer num
	
	escribir "La declaración de que el número < " num " > es capicúa, es " eval( num ) "."
	
FinAlgoritmo

Funcion capicua <- eval( num )
	definir capicua como logico
	definir inverso, n como entero
	
	inverso=0
	n=num
	
	mientras n<>0
		inverso= n mod 10 + inverso*10
		n=trunc(n/10)
	FinMientras
	
	si num=inverso
		entonces capicua=verdadero
	FinSi
	
Fin Funcion
