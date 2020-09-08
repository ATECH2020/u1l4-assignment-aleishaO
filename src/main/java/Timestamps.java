import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
         int secInHour; int secInHour2;
       int deltaHour; int deltaMin; int deltaSec;
       int minInHour; int minInHour2; int totalSec;

           secInHour = hours1 * 3600;
         secInHour2 = hours2 * 3600;
         minInHour = minutes1 * 60;
         minInHour2 = minutes2 * 60;
 
 
 
          deltaHour = secInHour2 - secInHour;
          deltaMin =  minInHour2 -  minInHour;
          deltaSec = seconds2 - seconds1;
         totalSec = deltaHour + deltaMin + deltaSec;
         System.out.println(totalSec);

       
        scanner.close();
    }
}