Algoritmo ejercicio3
	Definir usr, pass, aceptaPago Como Caracter
	Definir i,opc,cantBotellas, peso, saldo, precioBotella, cant Como Entero
	Definir valido Como Logico
	
	Definir usuario, password Como Caracter
	usuario = "a"
	password = "a"
	
	i=1
	valido = Falso
	usr=""
	saldo=0
	cant= 0 
	
	Mientras usr <> usuario
		Escribir "escriba usuario:"
		Leer usr
		si usr = usuario Entonces
			mientras valido = falso y i <= 3
				Escribir "escriba la pass"
				leer pass
				si pass = password
					valido= Verdadero
				SiNo
					i=i+1
				FinSi
				si i=4 Entonces
					Escribir "SE TE BLOQUEO LA CUENTA"
				FinSi
			FinMientras
		FinSi
	FinMientras
	
	si valido Entonces
		Hacer
			Escribir "----------------------------------------"
			Escribir "1- Ingresar botellas"
			Escribir "2- Consultar saldo"
			Escribir "3- Salir"
			Escribir "----------------------------------------"
			leer opc
			si opc = 1 Entonces
				Escribir "Ingrese cantidad de botellas"
				leer cantBotellas
				para i=1 Hasta cantBotellas Hacer
					peso = Aleatorio(100,3000)
					Escribir "LA BOTELLA ",i," PESA: ",peso," gr"
					si peso <= 500
						Escribir "Por esta botella cobra: $50 "
						precioBotella = 50
					sino si peso > 500 y peso <= 1500 Entonces
							Escribir "Por esta botella cobra: $125"
							precioBotella = 125
						sino
							Escribir "Por esta botella cobra: $200"
							precioBotella = 200
						FinSi
					FinSi
					Escribir "Acepta este pago? (s/n)"
					leer aceptaPago
					si aceptaPago = "s" Entonces
						Escribir "sumando pago!"
						saldo = saldo + precioBotella
						cant = cant + 1
					SiNo
						Escribir "Devolviendo material"
					finsi
				FinPara
			FinSi
			
			Si opc=2 Entonces
				Escribir "Su saldo actual es: ", saldo, " $. con la cantidad de: " cant " botellas vendidas"
			FinSi
		Mientras Que opc <> 3
	FinSi
FinAlgoritmo