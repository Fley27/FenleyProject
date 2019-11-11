package com.mycompany.watsontest;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import java.awt.Toolkit;
import java.io.File;
import static java.lang.Thread.sleep;

public class Calcularduracion {
    public static int minuto = 0;
    public static int hora = 0;
    private boolean isTracking;

 

    public void setIsTracking(boolean isTracking) {
        this.isTracking = isTracking;
    }
    
    public Calcularduracion(boolean istracking){
        this.isTracking = istracking;
    }
    
    
    public void MinCounter(JLabel h,JLabel min) {
     
        Thread thread;

        thread = new Thread(){
            @Override
            public void run(){
               while(isTracking){
                       try{
                           /*Chanje Sleep la a yon de 1000 millisecond pou ka teste li*/
                           sleep(60000);
                            minuto++;
                            if(minuto > 59){
                                minuto = 0;
                                hora++;
                            }
                    
                            if(minuto < 10)
                                min.setText(" 0"+ minuto+ " ");
                            else{
                                 min.setText(" "+ minuto+ " ");
                            }
                            
                            h.setText(" "+ hora+ " ");
                       }catch(Exception ex){
                           
                       }
               }
            }
        };
        
        thread.start();
        
    }
     
}
