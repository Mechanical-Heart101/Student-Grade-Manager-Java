import java.util.*;

public class Student
{
    private String studentID; // ID of the student (Unique)
    private String name; // name of the student
    private ArrayList<Integer> grades; // grade of the student
    
    public Student(String name, String studentID)
    {
        // initializing the instance variables
        this.name = name; // this instance of the name is the name
        this.studentID = studentID;
        this.grades = new ArrayList<Integer>(); // Grades belonging to the student
    }

    /**
     * This method returns the name of the student
     */
    public String getName()
    {
        return name;
    }


    /**
     * This method returns the studentID of the student
     */
    public String getStudentID()
    {
        return studentID;
    }

    /**
     * This method appends the grade of the student to the HashSet of grades
     */
    public void addGrade(int grade)
    {
        grades.add(grade);
    }

    /**
     * This method removes the value of each grade in the list of grades from the arraylist.
     */
    public void removeGrade(Integer grade)
    {
        grades.remove(Integer.valueOf(grade));
    }

    /**
     * This method returns the grades of a student
     */
    public ArrayList<Integer> getGrades()
    {
        return grades;
    }

    /**
     * This method calculates the average grades
     */
    public double calculateAverage()
    {
        double aggregate = 0.0;
        double count = 0.0;
        if (grades.isEmpty())
        {
            return 0.0;
        }
        else
        {
            for (int grade : grades)
            {
                aggregate += grade;
                count ++;
            }
        }
        return (aggregate / count);
    }

    /**
     * this is the tostring method
     */
    @Override
    public String toString()
    {
        return
            "StudentID: " + getStudentID() + 
            " Name: " + getName() +
            " has Grades: " + getGrades() +
            " with an average of: " + calculateAverage();
    }

}
