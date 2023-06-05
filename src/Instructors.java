public class Instructors extends Employee {
    public   String instructorId;
    public   String instructorName;
    public   String courseId;
    public Instructors(double salary, Contact contact,String instructorId,String instructorName,String  courseId) {
        super(salary, contact);
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.courseId = courseId;
    }

    void showInfo(){
        System.out.println("instructor ID :" + instructorId);
        System.out.println("instructor name :" + instructorName);
        System.out.println("course ID :" + courseId);
        System.out.println("Salary :" + salary);
        System.out.println("Ph no:" + contact.phoneNumber);
        System.out.println("Gmail:" + contact.gmail);
        System.out.println("city:" + contact.city);
        System.out.println("state:" + contact.state);
    }
}
