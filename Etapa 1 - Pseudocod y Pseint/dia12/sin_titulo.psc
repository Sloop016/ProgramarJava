Algoritmo sin_titulo
	
	definir nombre, contra, aceptar Como Caracter
	definir login Como Logico
	definir intentos, botellas, opt, i, peso Como Entero
	definir monto, saldo Como Real
	peso=0
	monto=0
	intentos = 0
	saldo =0
	Repetir
		Escribir "Ingresar el nombre de usuario"
		Leer nombre
	Mientras Que nombre <> "a"
	Repetir
		intentos = intentos + 1	
		Escribir "Ingrese una contraseña"
		Leer contra
	Mientras Que (contra <> "a") y (intentos < 3)
	si contra = "a" Entonces
		login = Verdadero
	SiNo
		Escribir "Usuario Bloqueado"
	FinSi
	Hacer 
		Escribir ""
		Escribir "1 Ingresar Botellas"
		Escribir "2 Consultar Saldo"
		Escribir "3 Salir"
		Escribir ""
		Escribir "ingrese la opcion deseada"
		Leer opt
		Segun opt Hacer
			1:
				Escribir "Ingrese el numero de botellas que van a ser ingresadas: "
				Leer botellas
				Para i = 1 Hasta botellas Con Paso 1 Hacer
					peso = Aleatorio(100, 3000)
					Si peso < 500 Entonces
						monto = monto + 50
					SiNo
						Si peso > 500 y peso < 1500 Entonces
							monto = monto + 125
						SiNo
							monto = monto + 200
						FinSi
					FinSi
				FinPara
				
				Escribir "El monto ofrecido es de $", monto
				Escribir "Desea aceptar el monto ofrecido (si/no): "
				Leer aceptar
				Si Mayusculas(aceptar) = "SI" Entonces
					saldo = monto
				SiNo
					Escribir "Devolviendo material"
				FinSi
			2:
				Escribir "Su saldo es $", saldo
			3:
				login = Falso
			De Otro Modo:
				Escribir "La opcion ingresada es incorrecta"
		FinSegun		
	Mientras que login = Verdadero
FinAlgoritmo
