//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//capic�a o no (Por ejemplo: 12321). Nota: recordar el uso del MOD y el Trunc. No podemos
//transformar el numero a cadena para realizar el ejercicio.

Algoritmo capicua_o_no
	definir num como entero
	
	escribir "Ingrese un n�mero para definir si es o no capic�a:"
	
	leer num
	
	escribir "La declaraci�n de que el n�mero < " num " > es capic�a, es " eval( num ) "."
	
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
