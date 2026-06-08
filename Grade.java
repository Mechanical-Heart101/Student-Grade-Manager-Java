public class Grade
{
    private Student student;
    private Course course;
    private int score;

    public Grade(Student student, Course course, int score)
    {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    /**
     * This is the getter method for student course
     * @return student course
     */
    public Course getCourse()
    {
        return course;
    }

    /**
     * This is the getter method for the student
     * @return the student object
     */
    public Student getStudent()
    {
        return student;
    }

    /**
     * This is the setter method for new courses
     * @param Course new course
     */
    public void setCourse(Course newCourse)
    {
        course = newCourse;
    }

    /**
     * This is the setter method for new students
     * @param Student new student
     */
    public void setStudent(Student newStudent)
    {
        student = newStudent;
    }

    /**
     * This is the setter method for the scores
     * @param int new Score
     */
    public void setScore(int newScore)
    {
        score = newScore;
    }

    /**
     * This is the getter method for the scores
     * @return score
     */
    public int getScore()
    {
        return score;
    }

    /**
     * This is the tostring method 
     */
    @Override
    public String toString()
    {
        return "Student: " + getStudent() +
            ", Course: " + getCourse() +
            ", Score: " + getScore();
    }

}