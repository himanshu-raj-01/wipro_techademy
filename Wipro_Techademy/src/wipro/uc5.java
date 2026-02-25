package wipro;

public class uc5 {
	private String VotingRights;
	private String Identity;
	
	public void setVotingRights(String VotingRights) {
		this.VotingRights=VotingRights;
	}
	public void setIdentity(String Identity) {
		this.Identity=Identity;
	}
	
	public String getVotingRights() {
		return VotingRights;
	}
	public String getIdentity() {
		return Identity;
	}
	
 
	public static void main(String[] args) {
		uc5 v= new uc5();
		v.setVotingRights("Eligible");
		v.setIdentity("Alex");
		
		System.out.println("Voting Rights:" +v.getVotingRights());
		System.out.println("Identity:" +v.getIdentity());
 
	}
 
}




















// uc5 = VotingApp