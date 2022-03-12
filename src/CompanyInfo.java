
public class CompanyInfo {

	public void cmpName() {
		System.out.println("Company name is TCS");
	}
	public void cmpID(int startingyr, char grade) {
		System.out.println("Company Joining year is "+ startingyr+"\n"+"Company grade is "+grade);
	}

	public void cmpID(int currentyr, char quality, long phone) {
		System.out.println("Company Current year is "+ currentyr+"\n"+"Company Quality is "+ quality +"\n" + "Company Phone no is "+phone);
	}
	public static void main(String[] args) {
		
		CompanyInfo c = new CompanyInfo();
		c.cmpID(1993, 'A');
		c.cmpID(2022, 'L', 8945612301l);
	}
}
