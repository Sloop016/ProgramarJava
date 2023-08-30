Algoritmo sin_titulo
	definir letra Como Caracter
	definir condicion Como Logico
	escribir "ingrese una letra"
	leer letra 
	condicion = (letra == "a") o (letra == "e") o (letra == "i") o (letra == "o") o (letra == "u") 
	si condicion Entonces
		escribir "la letra es vocal"
	FinSi
		si no condicion Entonces
			escribir "la letra es consonante"
		FinSi
FinAlgoritmo
