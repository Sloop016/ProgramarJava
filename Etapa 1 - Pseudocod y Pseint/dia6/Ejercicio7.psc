Algoritmo Ejercicio7
	Definir letra Como Caracter
	Definir ultimaletra Como Entero
	Escribir "Escriba una palabra"
	Leer letra
	ultimaletra=Longitud(letra)
	si subcadena(letra,0,0) == subcadena(letra,ultimaletra -1 ,ultimaletra -1) Entonces
		
		Escribir "CORRECTO"
	sino 
		Escribir "INCORRECTO"
	FinSi
	
	
FinAlgoritmo