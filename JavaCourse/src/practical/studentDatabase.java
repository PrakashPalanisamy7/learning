package practical;

public class studentDatabase {

	public static void main(String[] args) {
	
		Student stu1= new Student("Prakash","12345678");
		
		stu1.enroll("Eng121");
		stu1.enroll("Math121");
		
		stu1.checkbalance();
		stu1.showCourses();
		stu1.pay(750);
		stu1.checkbalance();
		System.out.println(stu1.toString());

	}

}
