//1. Realizar un programa que rellene de números aleatorios una matriz a través de un subprograma
//y generar otro subprograma que muestre por pantalla la matriz final.

Algoritmo extra1_d22_25
	
	definir matriz,fila,columna Como Entero
	
	Escribir "indique la cantidad de filas que quiera: "
	leer fila
	Escribir "indique la cantidad de columnas que quiera: "
	leer columna
	dimension matriz(fila,columna)
	
	Escribir "Su vector quedaria así: "
	Escribir ""
	
	relleno(matriz,fila,columna)
	imp(matriz,fila,columna)
	
	Escribir ""
FinAlgoritmo



subproceso relleno(matriz por referencia, fila, columna)
	
	definir i, k como real
	
	para i=0 hasta fila-1 con paso 1 Hacer
		para k=0 hasta columna-1 con paso 1 hacer
			matriz(i,k)= aleatorio(0,9)
		FinPara
	FinPara
	
FinSubProceso



subproceso imp(matriz,fila,columna)
	
	definir n, m como entero
	
	para n=0 hasta fila-1 con paso 1 Hacer
		para m=0 hasta columna-1 con paso 1 hacer
			escribir sin saltar matriz(n,m) "   "
		FinPara
		escribir ""
	FinPara
	
FinSubProceso
