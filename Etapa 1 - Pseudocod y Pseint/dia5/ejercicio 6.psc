Algoritmo sin_titulo
	Definir mail, ejecutivos Como Entero
	Definir comunicado Como Caracter
	Escribir "Iniciaste sesion, revisaste y completaste la hoja de calculo de ingreso mensuales (buscando los últimos ingresos publicitarios en los informes de marketing) "
		Escribir "Ingresas al correo electronico"
			Escribir "Revisando mails de ejetivos de marketing"	
	ejecutivos = 3
	Escribir "¿Cuantos mails llegaron?" 
	leer mail
	si mail  < 10 Entonces
		Escribir "Revisar correo de voz para ver si hay solicitudes de Ejecutivos"
			Escribir "¿Cuantos mails llegaron?"
		Leer ejecutivos
			Escribir "habian " ejecutivos " mensajes"
	sino
	FinSi
		Escribir "¿Cuantos mensajes hay para otro departamento?"
		leer comunicado
		si comunicado = "si" Entonces
			Escribir "realizaste los debidos comunicados"
				Escribir "completaste las tareas"
		sino 
			Escribir "Completaste debidos comunicados principales, despues completaste los faltantes, cerraste sesion, apagaste la computadora y saliste de la oficina"
		FinSi
			Escribir "Sin antes darte cuenta que faltaban regar las plantas"
				Escribir "Las regaste y te fuiste"
FinAlgoritmo
