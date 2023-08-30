Algoritmo sin_titulo
	definir num, centena, decena, unidad, resto como real
	definir es_capicua Como Logico
	escribir "ingrese su numero:"
	leer num
	centena = trunc(num /100 )
	resto = num MOD 100
	decena = trunc( resto / 10 )
	unidad = resto MOD 10
	es_capicua = centena == unidad
	si es_capicua Entonces
		escribir "es capicua"
	FinSi
	si no es_capicua Entonces
		escribir "no es capicua"
	FinSi
FinAlgoritmo
