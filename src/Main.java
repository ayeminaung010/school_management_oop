// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Courses javaCourse = new Courses();
        javaCourse.setCourseId("C01");
        javaCourse.setCourseName("Java");
        javaCourse.setDescription("Come and Join our java course - weekend days");
        javaCourse.setStartDate("6-4-2023");
        javaCourse.setEndDate("6-9.2023");

        Courses dotNetCourse = new Courses();
        dotNetCourse.setCourseId("C02");
        dotNetCourse.setCourseName(".Net");
        dotNetCourse.setDescription("Come and Join our .Net course - weekend days");
        dotNetCourse.setStartDate("10-4-2023");
        dotNetCourse.setEndDate("10-9.2023");

        javaCourse.showInfo();

        Contact contact1 = new Contact("yangon","Yangon","Myanmar","098475934","aung@gmail.com");

        Teachers teacher1 = new Teachers(50000 , contact1 , "T01","Daw Aye","C01");
        Instructors instructor1 = new Instructors(50000 , contact1 , "I01","Daw Mya","C01");
        Students student1 = new Students("S01","Aye Aye","C01",contact1);
        student1.showInfo();


    }
}