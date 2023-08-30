Algoritmo ejercicio4
	Definir  letra, frase Como Caracter
	Definir  cantidad Como Entero
	Escribir "ingresa una frase"
	leer frase
	frase = minusculas(frase)
	Escribir "ingresa una letra"
	leer letra
	letra = Minusculas(letra )
	cantidad = buscar (frase,letra)
	Escribir "la letra ", letra " se encuentra " cantidad " veces"
FinAlgoritmo
Funcion c = buscar (frase2,letra2)
	Definir c, i , n Como Entero
	c = 0 
	i = 0
	n = Longitud(frase2)
	mientras i< n Hacer
		si letra2 == Subcadena(frase2, i, i ) Entonces
			
		 c= c+1
	 FinSi
	 i=i+1
	FinMientras
	
FinFuncion
