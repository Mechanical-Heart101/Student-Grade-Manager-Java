import java.util.ArrayList;
public class School
{
    private ArrayList<Student> students; // stores all the grades belonging to one student
    private ArrayList<Course> courses; // stores the courses of the school

    /**
     * This constructor creates new school objects and initilaizes them to a new arrayList of student objects
     */
    public School()
    {
        students = new ArrayList<Student>(); // stores the student objects themselves
        courses = new ArrayList<Course>(); // stores the courses objects themselves
    }

    /**
     * This method adds objects of type student to the school list
     * @param student oject of the student
     */
    public void addStudent(Student student)
    {
        students.add(student); // Add the student to the school list.
    }

    /**
     * This method removes a student from the school using their unique ID
     * @param String studentID
     */
    public void removeStudent(String studentID)
    {
        Student student = findStudent(studentID);

        if (student != null)
        {
            students.remove(student);
        }
    }

    /**
     * This method returns the student using the studentID identifier
     * @param String studentID
     * @return Student object of that student
     */
    public Student findStudent(String studentID)
    {
        for (Student student : students)
        {
            if (student.getStudentID().equals(studentID)) // if the strings are identical
            {
                return student;
            
            }      
        }
        return null; 
    }

    /**
     * This method returns the overall average of the school
     * @return double the average performance of all students in the school
     */
    public double calculateClassAverage()
    {
        double aggregate = 0.0;

        if (students.isEmpty())
        {
            return 0.0;
        }

        for (Student student : students)
        {
            aggregate += student.calculateAverage();
        }

        return (aggregate / students.size());
    }

    /**
     * This method returns the number of studnt objects in the students arraylist
     * @return
     */
    public int getStudentCount()
    {
        return students.size();
    }

    /**
     * This method checks if the student exists in the students list
     */
    public boolean studentExists(String studentID)
    {
        for (Student student : students)
        {
            if (student.getStudentID().equals(studentID))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * This method returns the top student
     */
    public Student getTopStudent()
    {
        if (students.isEmpty())
        {
            return null;
        }

        Student topStudent = students.get(0);

        for(Student student : students)
        {
            if (student.calculateAverage() > topStudent.calculateAverage())
            {
                topStudent = student;
            }
        }

        return topStudent;
    }

    /** This is the setter method for the courses 
     * @param Course new course
    */
    public void addCourse(Course newCourse)
    {
        courses.add(newCourse);
    }

    /**
     * This is the findCourse helper method
     * @param String courseID
     * @return null or the associated course object
     */
    public Course findCourse(String courseID)
    {
        for (Course course : courses)
        {
            if (course.getCourseID().equals(courseID))
            {
                return course;
            }
        }
        return null;
    }

    /**
     * This is the remove method for the courses
     * @param course
     */
    public void removeCourse(String courseID)
    {
        Course course = findCourse(courseID);
        if (course != null) // if found
        {
            courses.remove(course);
        }
    }

    /**
     * This is the display method foe the courses
     * @return list of courses
     */
    public void displayCourses()
    {
        for (Course course : courses)
        {
            System.out.println(course); // print the course to the terminal
        }
    }

    /**
     * This method is meant to display all studetns
     */
    public void displayAllStudents()
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
    }

    /**
     * this is the tostring method
     */
    @Override
    public String toString()
    {
        return "Students: " + students.size();
    }

}