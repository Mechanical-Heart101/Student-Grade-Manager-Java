public class Course
{
    private String courseID;
    private String name;

    public Course(String courseID, String name)
    {
        this.courseID = courseID;
        this.name = name;
    }

    /**
     * This is the getter method for courseID
     * @return String courseID
     */
    public String getCourseID()
    {
        return courseID;
    }

    /**
     * This is the getter nethod for the course name
     * @return String course name
     */
    public String getName()
    {
        return name;
    }

    /**
     * This is the setter method for courseID
     * @param newCourseID
     */
    public void setCourseID(String newCourseID)
    {
        courseID = newCourseID;
    }

    /**
     * This is the setter method for the course name
     * @param newCourseName
     */
    public void setCourseName(String newCourseName)
    {
        name = newCourseName;
    }

    /**
     * This is the toString method of the course class
     */
    @Override
    public String toString()
    {
        return "CourseID: " + getCourseID() +
                ", CourseName: " + getName();
    }

}