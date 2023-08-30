Algoritmo ejercicio3_buscar
	
	definir vector, buscar Como Real
	definir contador,dim como entero
	definir log como logico
	log=falso
	
	escribir "ingrese la cantidad de numeros que desea buscar: "
	leer dim
	
	dimension vector(dim)
	
	escribir "Ingrese los " dim " números:"
	
	para contador=0 hasta dim-1 Hacer
		leer vector(contador)
	FinPara
	
	escribir "coloque número a buscar entre los ingresados:"
	leer buscar
	
	para contador=0 hasta dim-1 Hacer
		si vector(contador)=buscar
			log=verdadero
			escribir "El número " buscar " estaba en la posicion, " contador " del subindice."
		FinSi
	FinPara
	
	si log=Falso
		escribir "ERROR404_NoSeDetectoEseNumero.- Adios."
	FinSi
	
FinAlgoritmo
