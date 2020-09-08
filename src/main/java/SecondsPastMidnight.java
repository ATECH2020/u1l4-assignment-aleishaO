import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();
       int hours;
       int min;
       seconds = 7500;
       hours = seconds / 3600;
       min = seconds / 60;
       System.out.println(hours + " " + min);


        
        scanner.close();
    }
}