Algoritmo ejericio2
	Definir frase,frase2 Como Caracter
	Definir long,i Como Entero
	Escribir "pida una frase"
	Leer frase
	frase2=""
	long=Longitud(frase)
	
	Para i<-0 Hasta long-1 Con Paso 1 Hacer
		frase2 = concatenar(frase2, subcadena(frase,i,i))
		frase2 = concatenar(frase2, " ")
	Fin Para
	Escribir frase2
FinAlgoritmo
