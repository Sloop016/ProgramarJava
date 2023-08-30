Algoritmo sin_titulo
	definir dia Como Caracter
	definir condicion Como Logico
	escribir "ingrese una letra"
	leer dia 
	condicion = (dia == "lunes") o (dia == "martes") o (dia == "miercoles") o (dia == "jueves") o (dia == "viernes") 
	si condicion Entonces
		Escribir "es dia laboral"
		finsi
	si no condicion entonces
		Escribir "es una dia no laboral"
	FinSi
FinAlgoritmo
