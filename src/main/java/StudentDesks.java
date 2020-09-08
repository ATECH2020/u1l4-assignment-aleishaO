import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        int stu1 = scanner.nextInt();
         int stu2 = scanner.nextInt();
         int stu3 = scanner.nextInt();
        int desk1 = scanner.nextInt();
        int desk2 = scanner.nextInt();
        int desk3 = scanner.nextInt();
        int total = scanner.nextInt();
        
        stu1 = 20;
        stu2= 21;
        stu3 = 22;
        
        
        
         desk1 = (stu1/2) + (stu1 % 2);
         desk2 = (stu2/2) + (stu2 % 2);
         desk3 = (stu3/2)  + (stu3 % 3);
         total = desk1 + desk2 + desk3;
 
        System.out.println(total);

     
        scanner.close();
    }
}