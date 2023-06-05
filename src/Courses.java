public class Courses {
    private String courseId;
    private String courseName;
    private  String startDate;
    private  String endDate;
    private  String Description;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    void showInfo() {
        System.out.println("Course ID:" + courseId );
        System.out.println("Course Name:" + courseName );
        System.out.println("Start Date:" + startDate );
        System.out.println("End  Date:" + endDate );
        System.out.println("Description :" + Description );
    }
}
