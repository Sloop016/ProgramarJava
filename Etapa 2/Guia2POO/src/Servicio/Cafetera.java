
package g8_ej2_cafetera.entidades;


public class Cafetera {
    //Atributos.
    private int capacidadMaxima;
    private int cantidadActual;
    
    //Constructores.
    public Cafetera (){
        this.capacidadMaxima=2000;
        this.cantidadActual=0;
    }
    
   public Cafetera (int capacidadMaxima, int cantidadActual){
       this.capacidadMaxima=capacidadMaxima;
       this.cantidadActual=cantidadActual;
    }
   
   //setter
    public void setcapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public void setcantidadActual(int setcantidadActual) {
        this.cantidadActual = cantidadActual;
    }
   //getter
    public int getcapacidadMaxima() {
        return capacidadMaxima;
    }
   public int getcantidadActual() {
        return cantidadActual;
    }
}
