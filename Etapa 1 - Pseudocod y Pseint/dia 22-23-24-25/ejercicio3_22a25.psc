Algoritmo ejercicio3_22a25
	Definir mtz, i, j como entero	
	Escribir "defina la cantidad de columnas y filas"
	leer i, j
	
	Dimension mtz(i,j)
	Escribir "la matriz es: "
	Escribir ""
	relleno(mtz,i,j)
	Escribir ""

	
	suma(mtz,i,j)
	
	
FinAlgoritmo
SubProceso  relleno(mtz Por Referencia, i, j)
	Definir m,n Como Entero
	para m = 0 hasta i-1 Hacer
		para n = 0 hasta j-1 Hacer
			mtz(m,n)=Aleatorio(1,(i*j))
			Escribir Sin Saltar mtz(m,n) " " 
		FinPara
		Escribir " "
	FinPara
	
FinSubProceso

SubProceso suma (mtz por referencia, i , j)
	Definir m,n,sum como entero	
	sum= 0
	
	para m = 0 hasta i-1 Hacer
		para n = 0 hasta j-1 Hacer
			sum=sum+mtz(n,m)
		FinPara
	FinPara
	Escribir "y la suma de los numeros de la matriz es: "  sum
FinSubProceso
	