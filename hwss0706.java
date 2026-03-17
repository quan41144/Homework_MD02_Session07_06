import java.util.Scanner;

public class hwss0706 {
    public static class Course {
        public String code;
        public String title;
        public void showCourse() {
            System.out.println("CourseInfo:");
            System.out.println("code: " + code);
            System.out.println("title: " + title);
        }
    }
    public static class Student {
        public int id;
        public String name;
        public Course course;
        public void displayInfo() {
            System.out.println("StudentInfo:");
            System.out.println("id: " + id);
            System.out.println("name: " + name);
            System.out.println("course: " + course.code);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course c = new Course();
        System.out.println("Course info:");
        System.out.print("code: ");
        c.code = sc.nextLine();
        System.out.print("title: ");
        c.title = sc.nextLine();
        Student s = new Student();
        System.out.println("Student info:");
        System.out.print("id: ");
        s.id = sc.nextInt();
        sc.nextLine();
        System.out.print("name: ");
        s.name = sc.nextLine();
        s.course = c;
        c.showCourse();
        s.displayInfo();
    }
}
