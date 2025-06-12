package estadisticas_de_juego;

public class Jugador {
    private int numero;
    private long puntos;
    private int asistencias;
    private int anotaciones;
    

    public Jugador(){
    
    numero=0;
    puntos=0;
    asistencias=0;
    anotaciones=0;
    }
    public Jugador(int a){
    
    numero=a;
    puntos=0;
    asistencias=0;
    anotaciones=0;
    
    
    
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getPuntos() {
        return puntos;
    }

    public void setPuntos(long puntos) {
        this.puntos = puntos;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(int anotaciones) {
        this.anotaciones = anotaciones;
    }

    
}
