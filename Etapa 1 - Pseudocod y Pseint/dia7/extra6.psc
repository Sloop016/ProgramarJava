Algoritmo extra6
	Definir kg Como Real
	Escribir "Escriba cuantos kilos compro de manzanas"
	leer kg	
	si (kg <= 2 ) Entonces
		Escribir "El descuento es 0% asi que paga el precio normal: "
		sino
		si (kg >= 2.01 ) y (kg <= 5 ) Entonces
			Escribir "el precio tiene un descuento de 10%, Usted pagaria por estos kg: " kg-kg*0.10
				sino
			si (kg >= 5.01 ) y (kg <= 9.99 ) Entonces
			Escribir "el precio tiene un descuento de 15%, Usted pagaria por estos kg: " kg-kg*0.15
				sino
			si (kg >= 10) Entonces
					Escribir "el precio tiene un descuento de 20%, Usted pagaria por estos kg: " kg-kg*0.20
					finsi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
