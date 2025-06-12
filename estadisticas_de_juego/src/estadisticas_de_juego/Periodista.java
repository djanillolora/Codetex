package estadisticas_de_juego;

import javax.swing.JOptionPane;

public class Periodista {
   
   

  public boolean ingresaranotacionypuntos(int num,int puntos,String nomequipo,Equipo a,Equipo b){
   if(nomequipo.equals(a.getNombre())){
   int i;
       for(i=0;i<15;i++){
       if(num==a.jugadores[i].getNumero()){
       long punt;
       int anot;
       punt=a.jugadores[i].getPuntos();
       anot=a.jugadores[i].getAnotaciones();
       a.jugadores[i].setAnotaciones(anot+1);
       a.jugadores[i].setPuntos(punt+puntos);
       return true;
       }
       }
   JOptionPane.showMessageDialog(null, "numero de jugador no existe");
   
   
   }else if(nomequipo.equals(b.getNombre())){
   
       int i;
       for(i=0;i<15;i++){
       if(num==b.jugadores[i].getNumero()){
       long punt;
       int anot;
       punt=b.jugadores[i].getPuntos();
       anot=b.jugadores[i].getAnotaciones();
       b.jugadores[i].setAnotaciones(anot+1);
       b.jugadores[i].setPuntos(punt+puntos);
       return true;
       }
       }
   JOptionPane.showMessageDialog(null, "numero de jugador no existe");
   
       
   
   }else{
   JOptionPane.showMessageDialog(null, "!ERROR!.equipo no existe en este partido");
   
   }
       
       return true;
   }
boolean ingresarasistencia(int num,String equipo){
   
       return true;
   }
Jugador consultarmejorjugador (){
   Jugador mejor= new Jugador();
       
   
   return mejor;
   }
void mostrarestadopartido(){


}
}
