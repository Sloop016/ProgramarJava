Algoritmo sin_titulo
	
	definir frase, espacio Como Caracter
	definir cantidad, i como entero
	escribir sin saltar "Por favor ingrese una frase."
	leer frase
	espacio = ' '
	cantidad= longitud (frase)
	i=0
	
	Para i=cantidad  Hasta 0 Con Paso i-1 Hacer
		escribir sin saltar SubCadena(frase,i,i) ' ' 
	Fin Para
	
FinAlgoritmo
