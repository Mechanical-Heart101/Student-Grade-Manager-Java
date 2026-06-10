import java.util.Scanner;

public class SchoolApp
{
    public static void main(String[] args)
    {
        School school= new School();
        Scanner scanner = new Scanner(System.in); // Create a new acanner object to read user input
        
        boolean running = true;

        while (running)
        {
            System.out.println("=== School App ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Add Course");
            System.out.println("5. Remove Course");
            System.out.println("6. Display Courses");
            System.out.println("7. Exit");

            int choice = scanner.nextInt(); // read the users choice
            scanner.nextLine();

            switch (choice)
            {
                case 1: // this case is for adding a student to the school
                    System.out.println("Name of student:");
                    String newName = scanner.nextLine(); // read the user input/ name of the student


                    System.out.println("StudentID: ");
                    String newStudentID = scanner.nextLine(); // read the user input / course of the student

                    Student newStudent = new Student(newName, newStudentID);
                    school.addStudent(newStudent);

                    break;



                case 2:
                    System.out.println("Remove student: ");
                    String removestudent = scanner.nextLine(); // read the user input

                    school.removeStudent(removestudent);

                    break;

                case 3: // this case is to display all students in the school
                    System.out.println("All current students:");
                    school.displayAllStudents(); // display all students in the school

                    break;

                case 4: // this case is to add courses into the school
                    System.out.println("New Course ID: ");
                    String newCourseID = scanner.nextLine();

                    System.out.println("New Course Name: ");
                    String newCourseName = scanner.nextLine();


                    Course newCourse = new Course(newCourseID, newCourseName);

                    school.addCourse(newCourse);

                    break;

                case 5: // this case is for removing a course from the school
                    System.out.println("Remove courseID: ");
                    String removeCourseID = scanner.nextLine();

                    school.removeCourse(removeCourseID);

                    break;

                case 6: // this case is to diaplay all courses
                    System.out.println("All courses in the school: ");
                    school.displayCourses();

                    break;

                case 7: // this case is for exiting the program
                    running = false;
                    break;
            }
        }
        scanner.close();
    }

}