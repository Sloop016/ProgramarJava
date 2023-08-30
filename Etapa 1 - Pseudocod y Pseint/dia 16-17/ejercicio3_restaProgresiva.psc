//Realizar un procedimiento que permita realizar la división entre dos números y muestre el cociente
//y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo restasProgresiva
	definir dividendo, divisor, residuo como reales
	definir i como entero
	i=0
	
	escribir "Ingrese el dividendo:"
	leer dividendo
	
	escribir "Ingrese el divisor:"
	leer divisor
	
	division_por_resta(i,dividendo,divisor, residuo)
	
	escribir "El resultado de " dividendo " entre " divisor " es " i ", con un resto de " residuo
	
FinAlgoritmo

SubProceso division_por_resta(i por referencia,dividendo,divisor por referencia, residuo por referencia)
	
	definir resultado como entero
	
	resultado=dividendo
	
	mientras divisor=0 Hacer
		escribir "No se puede dividir por 0. Inténtalo denuevo:"
		leer divisor
	FinMientras
	
	mientras resultado>=divisor
		resultado=resultado-divisor
		i=i+1
	FinMientras

	residuo=dividendo-(divisor*i)
	
FinSubProceso








