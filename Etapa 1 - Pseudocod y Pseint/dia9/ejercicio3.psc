//Realizar un programa que solicite al usuario su c�digo de usuario (un n�mero entero
//mayor que cero) y su contrase�a num�rica (otro n�mero entero positivo). El programa no le
//debe permitir continuar hasta que introduzca como c�digo 1024 y como contrase�a 4567.
//El programa finaliza cuando ingresa los datos correctos.
Algoritmo ejercicio3
	Definir usuario, contrasenia Como Entero
	Repetir
		Escribir "ingrese su numero de usuario"
		leer usuario
		si usuario = 1024 Entonces
			Escribir "Usuario logeado"
		
		sino escribir "Reintente nuevamente"
			finsi
	Mientras Que usuario <> 1024
	Escribir "Perfecto, ahora seguimos con su contrase�a"
	
	Repetir
		Escribir "ingrese su contrase�a"
		leer contrasenia
		si contrasenia = 4567 Entonces
			Escribir "Contrase�a correcta"
			sino 
				escribir "Reintente nuevamente"
				finsi
		Mientras Que contrasenia <> 4567
	Escribir "USUARIO CONECTADO"
FinAlgoritmo
