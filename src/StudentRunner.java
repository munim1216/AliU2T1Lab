public class StudentRunner {
    public  static void main(String[] args) {
        Student student1 = new Student(80, 4.5);
        student1.studentHeight();
        student1.studentSleep();

        Student student2 = new Student(40, 9);
        student2.studentSleep();
        student2.studentHeight();

        Student student3 = new Student(60, 6 );
        student3.studentHeight();
        student3.studentSleep();
    }

}
