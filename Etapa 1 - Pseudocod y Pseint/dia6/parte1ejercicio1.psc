Algoritmo sin_titulo
	Definir hIngreso Como Caracter	
	Definir mLlegada, mIngreso Como Real	
	Escribir "Bienvenido, por favor digite su hora de llegada "
	Leer hIngreso
	Escribir "Ahora por favor, digite los minutos de llegada"
	leer mIngreso
	mLlegada = mIngreso + (16*60)
	si mLlegada >=960 y mLlegada <= 975 Entonces
		Escribir "llegaste a tiempo, tu hora de llegada es: " hIngreso ":" mIngreso "hr. Recorda que siempre puedes dar el presente 30 minutos antes"
	SiNo
		Escribir "Hoy tendrás tardanza. Recuerda avisarle a tus coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"
	FinSi
finAlgoritmo
