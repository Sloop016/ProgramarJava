Algoritmo Extra15Clase3
    definir hSalida, mSalida, sSalida, hLlegada, mLlegada, sLlegada, tViaje, hViaje, mViaje, sViaje Como Real
	
    escribir "ingresar hora de salida"
    leer hSalida
    escribir "ingresar minutos de salida"
    leer mSalida
    escribir "ingresar segundo de salida"
    leer sSalida
    Escribir "ingresar tiempo de viaje en segundos"
    leer tViaje
	
    hViaje=trunc(tViaje/3600)
    mViaje=(trunc(tViaje/60)-hViaje*60)
    sViaje=(tViaje-hViaje*3600)-(mViaje*60)
	
    hLlegada=hViaje+hSalida
    mLlegada=mViaje+mSalida
    sLlegada=sViaje+sSalida
	
    escribir "su horario de llegada será:"
    escribir hLlegada "horas"
    escribir mLlegada "minutos"
    escribir sLlegada "segundos"
	
FinAlgoritmo