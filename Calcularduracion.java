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
    
    /*
    
    
        
        
          TimerTask task = new TimerTask() {
            @Override
            public void run() {
                      minuto++;
                    if(minuto > 59){
                        minuto = 0;
                        hora++;
                    }
                    
                    if(minuto < 10)
                        min.setText(" "+"0"+ minuto+ " ");
                    else
                    {
                        min.setText(" "+ minuto+ " ");
                    }
                    h.setText(" "+ hora+ " ");
            }
           };
            timer.schedule(task, 0, this.delay);   
    */
            
   
    
}
