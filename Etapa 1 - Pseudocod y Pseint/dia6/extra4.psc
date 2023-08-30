Algoritmo extra4 
	Definir horas, litros, minutos como entero
	Definir total como real
	Escribir "Bienvenido nuevamente, Verificaremos tus datos"
	Escribir "Por favor indicar cuantas horas se utilizo: "
	leer horas
	si horas <= 2 Entonces
		Escribir "Por devolverlo antes del tiempo solo pagas $400 y la nafta es Gratis!"
	sino 
		Escribir "Ingresar litros de Nafta consumidos: "
		leer litros
		minutos = horas * 60
		total = (40*litros)+(5.20*minutos)
		Escribir "su total es $: " , total
	FinSi
FinAlgoritmo
