package tp_note_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        int hour, minute, second;
        int startHour,endHour,startMinute,endMinute;
        int startSecond; int endSecond;
        int totalStartSecond, totalEndSecond;
        int numberOfSecond;

        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating cost of a call.");
        System.out.print("Please input start hours: ");
        startHour = sc.nextInt();
        System.out.print("Please input start minutes: ");
        startMinute = sc.nextInt();
        System.out.print(" Please input start seconds: ");
        startSecond = sc.nextInt();
        System.out.print(" Please input end hours: ");
        endHour = sc.nextInt();
        System.out.print(" Please input end minutes: ");
        endMinute = sc.nextInt();
        System.out.print("Please input end seconds: ");
        endSecond = sc.nextInt();

        totalStartSecond = (startHour*3600) + (startMinute*60) + startSecond;
        totalEndSecond = (endHour*3600) + (endMinute*60) + endSecond;

        numberOfSecond = totalEndSecond - totalStartSecond;

        hour = numberOfSecond / 3600;
        minute = (numberOfSecond - (3600*hour)) /60 ;
        second = (numberOfSecond - (3600*hour) - (minute*60));



        System.out.println("Total call duration: "+ hour+"h "+ minute + "mn "+ second +"s");
        System.out.println("Total cost of this call: "+ (numberOfSecond*0.05/60) + "$");
    }
}
