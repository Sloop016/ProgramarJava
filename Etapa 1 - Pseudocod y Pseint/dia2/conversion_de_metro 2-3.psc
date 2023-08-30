Algoritmo conversion_de_metro
	Definir unidad, cm, mm, pl Como Real
	Escribir "ingrese la cantidad deseada en metros"
	leer unidad
	cm = (unidad*100)
	mm = (unidad*1000)
	pl = (cm / 2.54)
	Escribir "tus metros son " ,cm " en centimetros"
	Escribir "tus metros son " ,mm " en milimetros"
	Escribir "tus metros son " ,pl " en pulgada" 
	
FinAlgoritmo
