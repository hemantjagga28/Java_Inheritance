package pillars.Inheritance;
class Course {
    protected String courseName;
    protected int duration;

     Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

     OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + getFinalFee());
    }
}

public class ECH {
    public static void main(String[] args) {
        Course c = new Course("Mathematics", 40);
        System.out.println("--- Course ---");
        c.display();
        System.out.println();

        OnlineCourse oc = new OnlineCourse("Java Programming", 30, "Udemy", true);
        System.out.println("--- Online Course ---");
        oc.display();
        System.out.println();

        PaidOnlineCourse poc = new PaidOnlineCourse("Data Science", 50, "Coursera", true, 10000, 20);
        System.out.println("--- Paid Online Course ---");
        poc.display();
    }
}

