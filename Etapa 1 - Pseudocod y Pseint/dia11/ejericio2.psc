Algoritmo ejericio2
	Definir num, num2, cantidad, i como entero
	Definir forma Como Caracter
	Escribir "El ancho del cuadro en numero"
	leer num
	cantidad=0
	forma = " * "
	num2= num - 2
	
	
	para i = 1 hasta num Hacer
		Escribir Sin Saltar forma
	FinPara
	Escribir ""
	Hacer
		Escribir sin saltar forma
		para i = 1 hasta num2
			Escribir Sin Saltar Concatenar(Subcadena(forma,3,3), "   ")
		FinPara
		Escribir Sin Saltar forma
		cantidad = cantidad+1
		Escribir ""
		mientras que cantidad < num2
		para i= 1 hasta num
			Escribir Sin Saltar forma
		FinPara
	
FinAlgoritmo
//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
//cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar: