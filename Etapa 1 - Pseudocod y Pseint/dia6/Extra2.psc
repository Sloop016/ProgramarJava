Algoritmo Extra2
	Definir mes Como Caracter
	Definir compra, descuento , cFinal Como Real
	Definir condicion Como Logico
	Escribir "Diga en el mes que compro en MAYUSCULAS"
	leer mes
		condicion = (mes == "SEPTIEMBRE") o (mes == "OCTUBRE") o (mes == "NOVIEMBRE")
	Escribir "Diga el precio de consumo"
	leer compra
	
	descuento = compra *0.10
	cFinal= compra-descuento
	
	si condicion entonces 
		Escribir "su compra del: " ,mes " Con un valor de: " , compra " y su descuento es: " descuento ". Por lo tanto usted su compra final es: " cFinal 
	sino 
		Escribir "Rectifique el mes, Recuerde de escribirlo bien y en MAYUSCULAS."
	FinSi
FinAlgoritmo
