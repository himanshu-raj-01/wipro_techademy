package wipro;

public class uc4 {
	private String name;
	private String status;
	private String healthIssue;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setstatus(String status) {
		this.status= status;
	}
	public void setIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}
	
	public String getName() {
		return name;
	}
	public String getstatus() {
		return status;
	}
	public String getIssue() {
		return healthIssue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uc4 p = new uc4();
		p.setName("Alex");
		p.setstatus("Good");
		p.setIssue("Nothing");
		System.out.println("Patient name is "  +  p.getName());
		System.out.println("Patient Status is "+ p.getstatus());
		System.out.println("Patient suffering from "+ p.getIssue());
		
 
	}
 
}





















//uc4 = PatientRecord