Algoritmo ejercicio5_NMayor
	
	definir vector Como Real
	definir dimensiones,contador Como Entero
	
	escribir "Ingrese la cantidad de numeros a ingresar:"
	leer dimensiones
	dimension vector(dimensiones)
	
	escribir "Ingrese los " dimensiones " numeros a dar valor:"
	
	para contador=0 hasta dimensiones-1 con paso 1 Hacer
		leer vector(contador)
	FinPara
	
	escribir "El mayor número, fue: " calmayor( vector,dimensiones ) "."
	
FinAlgoritmo

///*************************************************************

Funcion mayor_numero <- calmayor( vector,dimensiones )
	
	definir mayor_numero Como Real
	definir contador Como Entero
	
	mayor_numero=-999999999999
	
	para contador=0 hasta dimensiones-1 con paso 1 Hacer
		si vector(contador)>mayor_numero
			entonces mayor_numero=vector(contador)
		FinSi
	FinPara
	
Fin Funcion