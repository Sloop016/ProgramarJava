///Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
///m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
///recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
///compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
///vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
///deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
///	vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
///cada venta.
Algoritmo ejericio1
	Definir empleados, cantv, saldob Como Entero
	Definir i, ventotal ,sueldototal , comision como real		
	
	Escribir "ingrese la cantidad de empleados a pagar"
	leer empleados
	
	para i = 1 hasta empleados Hacer
		Escribir "----------------------"
		Escribir "Nuevo empleado"
		Escribir "ingrese sueldo del empleado"
		leer saldob
		
		Escribir "ingrese total de dinero de sus ventas"
		leer ventotal
		
		Escribir "ingrese la cantidad de ventas"
		leer cantv 
		
		sueldototal = saldob + ((ventotal/cantv)*0.10)
		comision = (ventotal/cantv)*0.10
		
		escribir "Con un sueldo base de: $" saldob
		Escribir "La comision de ventas es: $" comision
		Escribir "A este empleado le corresponde este sueldo: $" sueldototal 
		Escribir "----------------------"
	FinPara
	
FinAlgoritmo
