//6. Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//		letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//		Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo Ejercicio6_MyT
	definir letra como texto
	definir log como logico
	escribir "Ingrese una letra:"
	leer letra
	mayorOMenor(letra,log)
	
FinAlgoritmo

subproceso mayorOMenor(letra,log por referencia)
	
	letra=MAYUSCULAS(letra)
	
	si letra>="M" y letra<="T"
		entonces log=Verdadero
	sino log=falso
	FinSi
	
	si log=Verdadero
		escribir "La letra " letra " se encuentra situada entre las letras M y T."
	sino escribir "La letra " letra " NO se encuentra situada entre las letras M y T."
	FinSi
	
FinSubProceso
	