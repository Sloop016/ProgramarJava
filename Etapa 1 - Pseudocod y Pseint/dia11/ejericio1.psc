///Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
///múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
///recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
///compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
///vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
///deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
///	vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
