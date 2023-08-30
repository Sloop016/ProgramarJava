Algoritmo ejercicio2_srm
	
	
	dimension vector(10)
	definir vector Como Real
	definir contador, suma, x como real
	
	suma=0
	x=1
	
	escribir "Ingresar 10 números: "
	
	Para contador=0 Hasta 9 Con Paso 1 Hacer
		leer vector(contador)
		suma=suma+vector(contador)
		x=x*vector(contador)
	Fin Para
	
	escribir "suma de num: " suma
	escribir "resta de num: " (-suma)+vector(0)
	escribir "multiplicacion de num: " x
	
FinAlgoritmo
