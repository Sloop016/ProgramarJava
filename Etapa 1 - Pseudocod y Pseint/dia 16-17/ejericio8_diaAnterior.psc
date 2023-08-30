//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha representada
//		a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que
//		dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para los valores
//			dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo ejericio8_diaAnterior
	
	definir fecha como caracter
	definir dia, mes, anio como entero
	
	escribir "Ingrese una fecha (DD/MM/AAAA)"
	Leer fecha
	
	diaAnterior(dia,mes,anio,fecha)
	
FinAlgoritmo



SubProceso diaAnterior(dia por referencia,mes por referencia,anio por referencia,fecha por referencia)
	
	dia=ConvertirANumero(subcadena(fecha,0,1))
	mes=ConvertirANumero(subcadena(fecha,3,4))
	anio=ConvertirANumero(subcadena(fecha,6,9))
	
	si dia=1
		entonces dia=31 
		si mes=1
			entonces mes=12 
			anio=anio-1
		sino 	mes=mes-1
		FinSi
	sino dia=dia-1
	finsi
	
	escribir sin saltar "La fecha anterior a la fecha " fecha " es "
	
	si dia<10
		escribir sin saltar "0" dia "/" 
	sino escribir sin saltar dia "/" 
	FinSi
	
	si mes<10
		escribir sin saltar  "0" mes "/" 
	sino escribir sin saltar mes "/"
	FinSi
	
	escribir anio
	
FinSubProceso
