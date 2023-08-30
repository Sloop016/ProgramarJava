Algoritmo ejercicio2_promediodia
	definir d como entero

	
	escribir "Ingrese la cantidad de dias a promediar: "
	leer d
	media(d)
	
FinAlgoritmo

SubProceso media(d por referencia)
	definir min, max, p como real
	definir i como entero
	
	Para i=1 Hasta d Con Paso 1 Hacer
		
		escribir "Ingrese las temperaturas mínima y máxima (en ese orden) del día " i ":"
		leer min,max
		p=(min+max)/2
		escribir "La temperatura media del día " i " es de: " p
		escribir ""
		
	Fin Para
	
FinSubProceso