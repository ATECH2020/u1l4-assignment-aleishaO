import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

       int min = scanner.nextInt();
       int hour = scanner.nextInt();
       int angleSince12 = scanner.nextInt();
 
      hour = 6;
      min = 20;
 
       angleSince12 = (min / 5) * 30;
       System.out.println(angleSince12);


        scanner.close();
    }
}