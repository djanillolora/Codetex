package estadisticas_de_juego;

public class Equipo {
private String nombre;
private long puntos;
private int anotciones;
public Jugador  jugadores []=new Jugador[15];
 

 public Equipo(){
 nombre="";
 puntos=0;
 anotciones=0;
 
 }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPuntos() {
        return puntos;
    }

    public void setPuntos(long puntos) {
        this.puntos = puntos;
    }

    public int getAnotciones() {
        return anotciones;
    }

    public void setAnotciones(int anotciones) {
        this.anotciones = anotciones;
    }

    
 
    

}
