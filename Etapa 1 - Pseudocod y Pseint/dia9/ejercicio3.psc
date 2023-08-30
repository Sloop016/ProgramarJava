//Realizar un programa que solicite al usuario su código de usuario (un número entero
//mayor que cero) y su contraseña numérica (otro número entero positivo). El programa no le
//debe permitir continuar hasta que introduzca como código 1024 y como contraseña 4567.
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
	Escribir "Perfecto, ahora seguimos con su contraseña"
	
	Repetir
		Escribir "ingrese su contraseña"
		leer contrasenia
		si contrasenia = 4567 Entonces
			Escribir "Contraseña correcta"
			sino 
				escribir "Reintente nuevamente"
				finsi
		Mientras Que contrasenia <> 4567
	Escribir "USUARIO CONECTADO"
FinAlgoritmo
