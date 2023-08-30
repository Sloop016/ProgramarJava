Algoritmo ejercicio7_dosvecigual
	definir vector1,vector2 como reales
	definir dimensiones,contador como entero
	
	escribir "Ingrese las dimensiones de sus vectores:"
	leer dimensiones
	dimension vector1(dimensiones)
	dimension vector2(dimensiones)
	
	random(vector1,vector2,dimensiones)
	
	si igualdad( vector1,vector2,dimensiones )=Verdadero
		escribir "Todos los números de ambos vectores son iguales."
	sino escribir "Ambos vectores tienen números diferentes."
	FinSi
	
FinAlgoritmo

///************************************************************

Funcion iguales_o_no <- igualdad( vector1,vector2,dimensiones )
	definir contador como entero
	definir iguales_o_no como logico
	iguales_o_no=falso
	
	para contador=0 hasta dimensiones-1 con paso 1 Hacer
		si vector1(contador)=vector2(contador)
			entonces iguales_o_no=verdadero
		FinSi
	FinPara
	
Fin Funcion

///************************************************************

subproceso random(vector1 por referencia, vector2 por referencia, dimensiones por referencia)
	
	definir contador como entero
	
	para contador=0 hasta dimensiones-1 hacer 
		vector1(contador)=aleatorio(0,100)
		vector2(contador)=aleatorio(0,100)
	FinPara
	
FinSubProceso