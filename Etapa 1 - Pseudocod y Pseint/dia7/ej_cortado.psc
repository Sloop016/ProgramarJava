Algoritmo cortado
	definir cafe, te como caracter
	definir eleccion, eleccion1 Como caracter 
	escribir "Bienvenido que desea tomar Caf� o T�"
	leer eleccion
	eleccion=Minusculas(eleccion)
	Si eleccion == "te" Entonces
		Escribir "Tome su T�"
		sino
		Escribir "Quiere su cafe solo o cortado"
		Leer eleccion
		Si eleccion == "cortado" Entonces
			escribir "perfecto, quiere con leche animal o vegana "
			leer eleccion
			Si eleccion == "vegana" Entonces
				Escribir "Sale un cafe cortado vegano"
			sino 
			Escribir "Sale un cafe cortado normal"
			finsi
		sino escribir "Perfecto sale Caf� solo"
		FinSi
	FinSi

	Escribir "Muchas Gracias por su compra"
FinAlgoritmo
