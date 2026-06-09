import java.util.Scanner;

public class SchoolApp
{
    public static void main(String[] args)
    {
        SchoolApp schoolapp = new SchoolApp();
        Scanner scanner = new Scanner(System.in); // Create a new acanner object to read user input
        
        boolean running = true;

        while (running)
        {
            System.out.println("=== School App ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Studets");
            System.out.println("4. Add Grade");
            System.out.println("5. View Top Student");
            System.out.println("6. Exit");

            int choice = scanner.nextInt(); // read the users choice
            scanner.nextLine();

            switch (choice)
            {
                case 1: // this case is for adding a student to the school
                    System.out.println("Name of student:");
                    String name = scanner.nextLine(); // read the user input/ name of the student


                    System.out.println("Course of the student: ");
                    String course = scanner.nextLine(); // read the user input / course of the student






                case 2:

                case 3:

                case 4:

                case 5:

                case 6:


            }


        }
    
    }







}