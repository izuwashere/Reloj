
package servicio;

import java.util.Scanner;
import modelo.tiempo;


public class servi_tiempo {
    Scanner leer=new Scanner(System.in);
    tiempo datos=new tiempo();
    
   public void hora(){
       System.out.println("ingrese la hora");
       int hora=leer.nextInt();
       if(hora>0 && hora<24){
           datos.setHora(hora);
           System.out.println("hora valida");
       }else{
           System.out.println("la hora que ingresaste hora invalida");  
       }
   }
   
   public void minutos(){
       int horaplus = (int) datos.getHora();
       System.out.println("ingrese los minutos ");
       int minutos = leer.nextInt();
       if(minutos>60){
        System.out.println("los minutos que ingresaste se tomara como hora");
        int total= horaplus+1;
        datos.setHora(total);
        
        int i=60;
        
        int mintotal = i-60;
        datos.setMinutos(mintotal);
       }else{
           System.out.println("los minutos ingresados son validos");
           datos.setMinutos(minutos);
       }
   }
   
   public void segundos(){
        double minplus = datos.getMinutos();
        System.out.println("ingrese los segundos: ");
        int segundos = leer.nextInt();
        if(segundos>60){
            System.out.println("estos segundo se tomaran como minutos");
            double total = minplus+1;
            datos.setMinutos(total);
            
            
            datos.setSegundos(segundos);
        }else{
            System.out.println("segundos validos");
            datos.setSegundos(segundos);
        }
   }
   
   public StackTraceElement[] informacion_total(){
       double seg = datos.getSegundos();
       double min = datos.getMinutos();
       double horas = datos.getHora();
       
       while(seg<60 && min < 60 && horas <23){
          System.out.println("Hora: "+horas + "Minutos: "+min + "Segundos: "+seg);
            seg++;
            
            if(seg == 60){
                seg = 0;
                min++;
            }
            if(min == 60){
               min=0;
               horas++;
            }
       }
       
       try{
           Thread.sleep(1000);
       } catch (InterruptedException e){
           return e.getStackTrace();
       }
       //System.out.println("la hora es: "+datos.getHora());
       //System.out.println("los minutos son: "+datos.getMinutos());
       //System.out.println("los segundos son: "+datos.getSegundos());
       return null;
   }
   
}
