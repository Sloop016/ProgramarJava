Algoritmo sin_titulo
	Definir anio, dia Como Entero
	Definir codicion Como Logico
	Escribir "Escriba su a�o"
	leer anio
	Escribir "Escriba un dia de Febrero"
	leer dia
	si (anio mod 4 = 0) o (anio mod 100 = 0) y (anio mod 400 = 0) Entonces
		Escribir dia, " de febrero del a�o " anio " , es un a�o biciesto"
	SiNo
		Escribir "Su a�o no es biciesto"
	FinSi
FinAlgoritmo
