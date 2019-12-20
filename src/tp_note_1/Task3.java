package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int hour,minute,second;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Program for converting time to seconds.");
        System.out.print(" Please input hours: ");
        hour = sc.nextInt();
        System.out.print(" Please input minutes: ");
        minute = sc.nextInt();
        System.out.print(" Please input seconds: ");
        second = sc.nextInt();
        System.out.println("----------------------------------------------------------------");
        int result = (second + (3600*hour) + (minute*60));

        System.out.println("Number of seconds = " +hour +" x 3600 " + " + "+ minute + " x 60 +" + second +" = "+ result);

    }
}
