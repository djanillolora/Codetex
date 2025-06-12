
package estadisticas_de_juego;

import javax.swing.JOptionPane;


public class Estadisticas_de_juego {

    public static void main(String[] args) {

         
        Equipo equipo1=new Equipo();
        String nombre=JOptionPane.showInputDialog("ingrese nombre de equipo 1");
        equipo1.setNombre(nombre);
       
        Equipo equipo2=new Equipo();
         nombre=JOptionPane.showInputDialog("ingrese nombre de equipo 2");
        equipo2.setNombre(nombre);
        
        
      //ciclo que coloca el numero de jugador
        int i,j;
        
        for( i=0;i<15;i++){
            j=i+1;
            equipo1.jugadores[i] = new Jugador(j);
            equipo2.jugadores[i] = new Jugador(j);
        System.out.println(j+" indice  ");
       }
      
     /*    for( i=0;i<15;i++){
         JOptionPane.showMessageDialog(null,equipo2.jugadores[i].getNumero()+"");
               }
         JOptionPane.showMessageDialog(null,equipo1.getNombre()+" vs "+equipo2.getNombre());
 */
 int opc;
 do{
  opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Ingresar puntos y anotaciones\n2.consultar estadisticas del partido\n3.Ver maximo anotador del partido\n4.Ingresar asistencia de jugador\n5.Salir" ));
 
 }while(opc<1 || opc>5);
Periodista periodista=new Periodista();
if(opc==1){
String eq;
    do{
    eq="";
 eq=JOptionPane.showInputDialog(null," ingrese el equipo que anoto ");
}while(eq=="");
    int num;
    do{
    num=Integer.parseInt(JOptionPane.showInputDialog(null," ingrese el numero del jugador que anota(solo hay del 1 al 15 )"));
    }while(num<0 || num>15);
    int punt;
    do{
        
    punt=Integer.parseInt(JOptionPane.showInputDialog(null," ingrese de cuantos puntos fue su anotacion (solo hay de dos y tres puntos)"));
    }while(punt<2 || punt>3);
    
if(periodista.ingresaranotacionypuntos(num, punt, eq, equipo1, equipo2)){
JOptionPane.showMessageDialog(null,"anotacion ingresada");
}
JOptionPane.showMessageDialog(null,equipo1.jugadores[0].getPuntos());
}
////////////////////////////////////////////////////////////////////////////////
 
    
    
    

 
 }
 
 
 
    }
    

