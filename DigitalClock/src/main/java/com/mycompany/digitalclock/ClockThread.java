//A Thread is a single sequential flow of control within a program

package com.mycompany.digitalclock;

import java.util.Date;
public class ClockThread extends Thread{
    
    DigitalClock dc;
    String time;
    
    public ClockThread(DigitalClock dc) {
        
        this.dc = dc;       //This is a keyword that is used as a reference(in this case, we're reffering to an instance of the digital clock method)
         start();
    
    }  
    
    public void run() {
        while(true) {
            time = "" + new Date();
            dc.jlabClock.setText(time);
        }
        
    }
}
