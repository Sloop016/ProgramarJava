Algoritmo ejericio8
	
	definir ventas, salario, pago_hora, catidad_hora, HsExtra como entero
		
	definir modalidad como caracter
			
	Escribir "Ingrese su modalidad"
	escribir " a) comisión " " b) salario fijo + comisión "  " c) salario fijo "
	leer modalidad
	
	
	segun modalidad hacer
		"a":Escribir "Cuantas ventas realizo?"
			leer ventas 
			escribir "su sueldo es $" ventas*0.4 ". Recuerde que es un 40% del valor total"
		"b":escribir "Valor de la hora"
			leer pago_hora
			Escribir  "Cantidad de hora"
			leer catidad_hora
			si catidad_hora>40 Entonces
				catidad_hora=40
			FinSi
			escribir "monto de sus ventas"
			leer ventas
			Escribir "su sueldo es " (catidad_hora*pago_hora)+(ventas*0.25)
		"c": escribir "valor de la hora"
			leer pago_hora
			Escribir  "cantidad hora"
			leer catidad_hora
			
			si catidad_hora>40 Entonces
				escribir " su sueldo es: $" (40 * pago_hora + (catidad_hora - 40) * pago_hora * 1.5)
		
			sino
				escribir " su sueldo es $" catidad_hora*pago_hora
				
		FinSi
			
			
			
	FinSegun
	
	
	
	
	
	
	
	
FinAlgoritmo
