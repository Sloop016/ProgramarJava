//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

Algoritmo ejercicio10_suma_num
	
	definir num como real
	
	escribir "Ingrese un n�mero entero:"
	leer num
	
	escribir "La suma de los d�gitos de " num " da " sumar_digitos_de( num ) "."
	
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
