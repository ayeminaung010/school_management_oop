public class Teachers extends  Employee{
    public   String teacherId;
    public   String teacherName;
    public   String courseId;
    public Teachers(double salary, Contact contact,String teacherId ,String teacherName , String courseId) {
        super(salary, contact);
        this.teacherId = teacherId ;
        this.teacherName  = teacherName;
        this.courseId = courseId;
    }

    void showInfo(){
        System.out.println("teacher ID :" + teacherId);
        System.out.println("teacher name :" + teacherName);
        System.out.println("course ID :" + courseId);
        System.out.println("Salary :" + salary);
        System.out.println("Ph no:" + contact.phoneNumber);
        System.out.println("Gmail:" + contact.gmail);
        System.out.println("city:" + contact.city);
        System.out.println("state:" + contact.state);
    }
}
