package timers;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    
    public static void main(String[] args){

        // Timer = Class that schedules tasks at specific times or periodically
        // Useful for sending notifications, scheduled updates etc.

        // TimerTask = Represents the task that will be executed by the Timer

        Timer timer = new Timer();

        System.out.println("Countdown begins");

        TimerTask task = new TimerTask(){

            int counter = 10;
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println(counter);
                counter--;

                if(counter < 0){
                    System.out.println("IP address leaked on internet HIGH VULNERABILITY");
                    timer.cancel();
                }

                
            }

        };

        timer.schedule(task, 0, 1000);


    }
}
