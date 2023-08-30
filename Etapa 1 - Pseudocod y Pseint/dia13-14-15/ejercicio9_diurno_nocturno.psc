Funcion total=PagoJornal(turno,horas,festivo)
	Definir total como real
	total=0
	si turno=="diurno"
		total=horas*90
		si festivo=="si"
			total=horas*(90*1.10)
		FinSi
	SiNo
		si turno=="nocturno"
			total=horas*125
			si festivo=="si"
				total=horas*(125*1.15)
			FinSi
		FinSi
	FinSi
FinFuncion




Algoritmo ejercicio9_diurno_nocturno
	
	definir jornal, horas, qant, i Como real
	definir nombre, dia, turno, festivo Como Caracter
	
	Escribir "Cantidad de trabajadores"
	leer qant
	i=1
	
	Mientras  i <= qant hacer
		Escribir "Ingrese nombre del trabajador"
		leer nombre
		Escribir "Día de la semana trabajado"
		leer dia
		Escribir "Es festivo? (si/no)"
		leer festivo
		Escribir "turno trabajado (diurno/nocturno)"
		leer turno
		Escribir "Cantidad de horas trabajadas"
		leer horas
		i=i+1
		
		
		jornal = PagoJornal (turno,horas,festivo)
		Escribir "El jornal diario de " ,nombre " es: $" jornal
		
	FinMientras
	
	
FinAlgoritmo

//
//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//		un 15% si el turno es nocturno.
//			
//		El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//			
//			de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además, debe-
//			mos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era festivo o
//				
//				no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.