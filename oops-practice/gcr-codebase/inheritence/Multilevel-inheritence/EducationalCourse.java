class Course2{
	String courseName;
	int duration;
	
	public Course2(String courseName,int duration) {
		this.courseName =courseName;
	    this.duration = duration;
	}
	
	public void getCourseDetails() {
		System.out.println("Course Name: "+courseName);
		System.out.println("Duration: "+duration);
	}
}
class OnlineCourse extends Course2{
	String platform ;
	boolean isRecorded;
	public OnlineCourse(String courseName, int duration,String platform,boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getCourseDetails() {
		super.getCourseDetails();
		System.out.println("Platform: "+platform);
		System.out.println("Is-Recorded: "+isRecorded);
	}
}
class PaidOnlineCourse extends OnlineCourse{
	
	double fee;
	double discount;
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,double fee,double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee=fee;
		this.discount = discount;
	}
	public double calculateFinalFee() {
		return fee - (fee*discount/100);	
	}
	@Override
    public void getCourseDetails() {
        super.getCourseDetails();
        System.out.println("Original Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: ₹" + calculateFinalFee());
    }
	
}
public class EducationalCourse {
	public static void main(String[] args) {
		PaidOnlineCourse detail = new PaidOnlineCourse("Java Full Stack",12,"Physice-Wallah",true,2500.0,10.0);
		detail.getCourseDetails();
	}
}
