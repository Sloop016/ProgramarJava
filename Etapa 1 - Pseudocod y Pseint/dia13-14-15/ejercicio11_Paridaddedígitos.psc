//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero
//tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//numero en partes (si es un numero de m�s de un digito) y ver si cada n�mero es par o impar.
//Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos pasar el numero a cadena para
//realizar el ejercicio.

Algoritmo paridad_de_digitos
	
	definir num como entero
	
	escribir "Ingrese un n�mero:"
	leer num
	
	escribir "La declaraci�n de que el n�mero " num " tiene todos sus d�gitos impares, es " paridad( num ) "."
	
FinAlgoritmo

Funcion par_o_impar <- paridad( num )
	definir par_o_impar como logico
	definir eval como entero
	eval=0
	
	si num<10
		entonces si num mod 2 = 0
			entonces par_o_impar=falso
		sino par_o_impar=verdadero
		FinSi
	sino si num>10
			mientras num>10
				eval=num mod 10
				si eval mod 2 = 1
					entonces par_o_impar=Verdadero
				sino par_o_impar=falso
				FinSi
				num=trunc(num/10)
			FinMientras
		finsi
	FinSi

	
Fin Funcion
