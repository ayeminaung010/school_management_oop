import java.util.HashMap;
import java.util.Scanner;

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

        Contact contact1 = new Contact("yangon","Yangon","Myanmar","098475934","aung@gmail.com");

        Teachers teacher1 = new Teachers(50000 , contact1 , "T01","Daw Aye","C01");
        Teachers teacher2 = new Teachers(50000 , contact1 , "T02","Daw Tin Tin","C02");
        Instructors instructor1 = new Instructors(50000 , contact1 , "I01","Daw Mya","C01");
        Instructors instructor2 = new Instructors(50000 , contact1 , "I02","Ko Phyo","C02");

        Students student1 = new Students("S01","Aye Aye","C01",contact1);
        Students student2 = new Students("S01","Ko Ko","C01",contact1);
        Students student3 = new Students("S01","Ko Tun","C01",contact1);
        Students student4 = new Students("S01","Ko Ye","C01",contact1);
        Students student5 = new Students("S01","Ma Phyu","C01",contact1);

        Room javaRoom = new Room();
        javaRoom.setInstructors(instructor1);
        javaRoom.setTeachers(teacher1);
        javaRoom.setStudents(student1);
        javaRoom.setStudents(student2);
        javaRoom.setStudents(student3);
        javaRoom.setStudents(student4);
        javaRoom.setStudents(student5);
        javaRoom.setCourses(javaCourse);

        Room dotNetRoom = new Room();
        dotNetRoom.setInstructors(instructor1);
        dotNetRoom.setTeachers(teacher1);
        dotNetRoom.setStudents(student1);
        dotNetRoom.setCourses(dotNetCourse);

        HashMap<String, Room> roomHashMap = new HashMap<>();
        roomHashMap.put("C01",javaRoom);
        roomHashMap.put("C02",dotNetRoom);

        Room getJavaRoom = roomHashMap.get("C01");
        Scanner scRoom  = new Scanner(System.in);
        String userRoom = scRoom.nextLine();

        Room selectedRoom = roomHashMap.get(userRoom);
        if (selectedRoom != null) {
            System.out.println("Room Information:");
            selectedRoom.showRoomInfo();
        } else {
            System.out.println("Room not found.");
        }

    }
}