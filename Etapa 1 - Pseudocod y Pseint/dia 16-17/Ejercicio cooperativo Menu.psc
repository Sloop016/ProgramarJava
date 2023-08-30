Algoritmo sin_titulo
	
	menu()
	
FinAlgoritmo

subproceso menu()	
	definir eleccion como entero
	definir continuar como caracter 
	hacer 
		borrar pantalla
		escribir "Bienvenido al menú principal, elija una opción: "
		escribir "1 - Calcular muro de ladrillo"
		escribir "2 - Calcular viga de hormigón"
		escribir "3 - Calcular columnas de hormigón"
		escribir "4 - Calcular contrapisos"
		escribir "5 - Calcular techo"
		escribir "6 - Calcular pisos"
		escribir "7 - Calcular pintura"
		escribir "8 - Calcular iluminación"
		escribir "9 - Salir"		
		leer eleccion		
		Segun eleccion Hacer
			1: 
				calcularMuro()
			2: 
				calcularViga()
			3: 
				calcularColumna()
			4:
				calcularContrapiso()
			5: 
				calcularTecho()
			6: 
				calcularPisos()
			7: 
				calcularPintura()
			8: 
				calcularIluminacion()
			9:
				Borrar Pantalla
				Escribir "Saliendo Del Sistema....."
				Esperar 1 Segundos				
		FinSegun 		
		Escribir ""
		Escribir "Desea continuar calculando? S/N"
		Leer continuar 
		si Mayusculas(continuar) = "N" entonces 
			eleccion = 9
		FinSi		
	Mientras Que eleccion <> 9	
FinSubProceso