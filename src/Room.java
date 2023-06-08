import java.util.ArrayList;
import java.util.Iterator;

public class Room {


    private ArrayList <Courses> courses;
    private ArrayList <Teachers> teachers;
    private ArrayList <Instructors> instructors;

    private  ArrayList <Students> students;

    public Room(){
        this.courses = new ArrayList<Courses>();
        this.students = new ArrayList<Students>();
        this.teachers = new ArrayList<Teachers>();
        this.instructors = new ArrayList<Instructors>();
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void setCourses(Courses course) {
        courses.add(course);
    }
    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teacher) {
        teachers.add(teacher);
    }

    public ArrayList<Instructors> getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructor) {
        instructors.add(instructor);
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(Students student) {
        students.add(student);
    }

    void showRoomInfo(){
        // Iterating over the ArrayList
//        for (int i = 0; i < students.size(); i++) {
//            Students student = students.get(i);
//            System.out.println("Student " + (i+1) + " ID: " + student.studentName);
//            System.out.println("Student " + (i+1) + " Name: " + student.studentId);
//            System.out.println("--------------------");
//        }

        Iterator<Courses> iterator0 = courses.iterator();
        while (iterator0.hasNext()) {
            Courses course = iterator0.next();
            System.out.println("Course ID: " + course.getCourseId());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course Description: " + course.getDescription());
            System.out.println("--------------------");
        }

        Iterator<Teachers> iterator1 = teachers.iterator();
        while (iterator1.hasNext()) {
            Teachers teacher = iterator1.next();
            System.out.println("Teacher ID: " + teacher.teacherName);
            System.out.println("Teacher Name: " + teacher.teacherId);
            System.out.println("--------------------");
        }

        Iterator<Instructors> iterator2 = instructors.iterator();
        while (iterator2.hasNext()) {
            Instructors instructor = iterator2.next();
            System.out.println("Instructor ID: " + instructor.instructorName);
            System.out.println("Instructor Name: " + instructor.instructorId);
            System.out.println("--------------------");
        }

        Iterator<Students> iterator = students.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            System.out.println("Student ID: " + student.studentName);
            System.out.println("Student Name: " + student.studentId);
            System.out.println("Student Contact: " + student.contact.state);
            System.out.println("--------------------");
        }
    }


}
