Algoritmo ejercicio_cooperativo_clase3
	Definir num,centena, decena, unidad Como Real	
	Escribir "escribe un numero de 3 cifras"
	Leer num
	Si (num >999) o (num<100) Entonces
		Escribir "Error reintentar. "
		Escribir "escribir un numero de tres cifras:"
		
	SiNo
		unidad=trunc(num) %10
		decena=trunc(num*0.1)%10
		centena=trunc(num*0.01)%100
		Escribir "La centena es:" ,centena
		Escribir "La decena es:" ,decena
		Escribir "La unidad es:" ,unidad
	Fin Si
	
FinAlgoritmo

