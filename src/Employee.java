public class Employee {
    double salary ;
    Contact contact;
    public Employee(double salary,Contact contact){
        this.salary = salary;
        this.contact = contact;
    }

    void showInfo(){
        System.out.println("Salary :" + salary);
        System.out.println("Ph no:" + contact.phoneNumber);
        System.out.println("Gmail:" + contact.gmail);
        System.out.println("city:" + contact.city);
        System.out.println("state:" + contact.state);
    }
}
