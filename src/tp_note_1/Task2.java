package tp_note_1;

import java.util.Scanner;

public class Task2 {
   public static void main(String[] args){
       int minute;
       int hour;
       int second;

       System.out.print("Input number of seconds: ");
       Scanner sc = new Scanner(System.in);

       int sec = Integer.parseInt(sc.nextLine());
       hour = sec / 3600;
       minute = (sec - (3600*hour)) /60 ;
       second = (sec - (3600*hour) - (minute*60));

//       hour= sec / 3600;
//       minute = (sec % 3600) / 60;
//       second = sec % 60;

       System.out.print(" Time corresponding to " + sec +" seconds is " +hour +":" + minute+ ":" + second);
   }
}
