package wipro;

	public class uc1 {
		private int salary;
		void setSalary(int sal) {
			salary=sal;
		}
		int getSalary() {
			return salary;
		}
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			uc1 obj = new uc1(); //uc1=employee
			obj.setSalary(60000);
			System.out.println(obj.getSalary());
			
	 
		}
	 
	}