public class Student {
    private int height;
    private double sleepHrs;

    public Student (int h,double s) {
        height = h;
        sleepHrs = s;
    }

    public void studentHeight() {
        System.out.println("Hello! My height is " + height + " inches!");
    }

    public void studentSleep() {
        System.out.println("I get " + sleepHrs + " hours of sleep every night!");
    }
}
