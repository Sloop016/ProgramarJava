//Realizar una función que calcule la suma de los dígitos de un número.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el último número de un digito de 2 cifras o más debemos pensar en el
//resto de una división entre 10. Recordar el uso de la función Mod y Trunc.

Algoritmo ejercicio10_suma_num
	
	definir num como real
	
	escribir "Ingrese un número entero:"
	leer num
	
	escribir "La suma de los dígitos de " num " da " sumar_digitos_de( num ) "."
	
FinAlgoritmo

Funcion sumador_de_digitos <- sumar_digitos_de( num )
	
	definir sumador_de_digitos,contador,digitos,suma,anterior como real
	digitos=1
	suma=0
	anterior=0
	
	
	mientras num/10>1 hacer
		digitos=digitos+1
		num=num/10
	FinMientras
	
	num=num*10^(digitos-1)
		
	Para contador=1 Hasta digitos Con Paso 1 Hacer
		suma=suma+(TRUNC(num/10^(digitos-contador))-anterior)
		anterior=anterior+suma*10^(digitos-contador)
	Fin Para
	
	sumador_de_digitos=suma
	
Fin Funcion
