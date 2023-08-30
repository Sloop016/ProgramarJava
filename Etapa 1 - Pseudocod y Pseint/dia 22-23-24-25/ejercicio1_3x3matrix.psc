Algoritmo ejercicio1_3x3matrix
	
	definir matriz, num, fila, columna Como Entero
	dimension matriz(3,3)
	
	escribir "Ingrese los números con los que llenará su matriz de 3x3:"
	
	para columna=0 hasta 2 con paso 1 Hacer
		para fila=0 hasta 2 con paso 1 Hacer
			leer matriz(columna,fila)
		FinPara
	FinPara
	
	escribir ""
	
	para columna=0 hasta 2 con paso 1 Hacer
		para fila=0 hasta 2 con paso 1 Hacer
			escribir sin saltar matriz(columna,fila) " "
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo