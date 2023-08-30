// Producir menos de 200 tornillos defectuosos.
// Producir más de 10000 tornillos sin defectos.
// El grado de eficiencia se determina de la siguiente manera:
//Si no cumple ninguna de las condiciones, grado 5.
//Si sólo cumple la primera condición, grado 6.
//Si sólo cumple la segunda condición, grado 7.
// Si cumple las dos condiciones, grado 8


Algoritmo sin_titulo
	Definir d, r Como Entero
	Escribir "diga cuantos tornillos defectusos realizo"
	leer d
	Escribir "cuantos tornillos realizo"
	leer r
	si (d>= 200) y (r <= 10000) Entonces
		Escribir "usted no completo ninguna condicion. Es grado 5"
		sino
		si (d>= 200) y (r <= 10000) Entonces
			Escribir "Usted tiene la primer condicion. Es Grado 6"
			sino
			si (d>= 200) y (r <= 10000) Entonces
				Escribir "Usted tiene la segunda condicion. Es Grado 7"
				sino
				si (d>= 200) y (r <= 10000) Entonces
					Escribir "Usted completo todas las condiciones. Es Grado 8"
					finsi
			FinSi
		FinSi

	FinSi
FinAlgoritmo
