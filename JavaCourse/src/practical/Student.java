package practical;

public class Student {
	private static int id=200;
	private String userId;
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String email;
	private String courses="";
	private static final int cost=1200;
	private int balance;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student(String name, String SSN)
	{
		id++;
		this.name=name;
		this.SSN=SSN;
		setEmail();
		setUserId();
	}
	private void setUserId() {
		int max=9000;
		int min=1000;
	    int random= (int) (Math.random() * 10000)* (max-min);
	    random=random+min;
		userId=id+""+random+""+SSN.substring(SSN.length()-4);	
		System.out.println("Your user id is:"+userId);
	}

	private void setEmail()
	{
		email=name.toLowerCase()+"@school.com";
		System.out.println("Your email is:"+email);
		
	}
	public void enroll(String course)
	{
		this.courses=this.courses+"  "+course;
		balance=balance+cost;
	}
	public void pay(int amount)
	{
		System.out.println("Paid Amount:"+amount);
		balance=balance-amount;
	}
	public void checkbalance()
	{
		System.out.println("Balance is :"+balance);
	}
	public String toString()
	{
	return "[NAME:"+name+"]\n[COURSES:"+courses+"]\n[BALANCE:"+balance+"]";	
	}
	public void showCourses()
	{
		System.out.println(courses);
	}
}
