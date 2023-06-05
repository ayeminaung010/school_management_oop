public class Students {
    String studentId;
    String studentName;
    String courseId;
    Contact contact;

    public  Students(String studentId,String studentName,String courseId,Contact contact){
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseId = courseId;
        this.contact = contact;
    }

    void showInfo(){
        System.out.println("student ID :" + studentId);
        System.out.println("student name :" + studentName);
        System.out.println("course ID :" + courseId);
        System.out.println("Ph no:" + contact.phoneNumber);
        System.out.println("Gmail:" + contact.gmail);
        System.out.println("city:" + contact.city);
        System.out.println("state:" + contact.state);
    }
}
