Algoritmo ejercicio4
	definir num, num1, num2,num3,nume Como Real
	definir suma Como Caracter
	escribir "cuantos numeros desea realizar el factoreo"
	leer num
	suma=""
	num3=1
	nume=0
	num1=1
	Para num1<-1 Hasta num Con Paso 1 Hacer
		Para num2<-1 Hasta 1 Con Paso 1 Hacer
			nume=nume+1
			suma=Concatenar(suma,("*"))
			suma=concatenar(suma,ConvertirATexto(num1))
			num3=num3*nume
		Fin Para
		escribir suma "=" num3
	Fin Para
FinAlgoritmo
