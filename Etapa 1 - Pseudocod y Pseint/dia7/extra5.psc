Algoritmo sin_titulo
	Definir anio, dia Como Entero
	Definir codicion Como Logico
	Escribir "Escriba su año"
	leer anio
	Escribir "Escriba un dia de Febrero"
	leer dia
	si (anio mod 4 = 0) o (anio mod 100 = 0) y (anio mod 400 = 0) Entonces
		Escribir dia, " de febrero del año " anio " , es un año biciesto"
	SiNo
		Escribir "Su año no es biciesto"
	FinSi
FinAlgoritmo
