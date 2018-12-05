
public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	Faculty(String name, String city, String phone, String email, 
			int office, double salary, String officeHours, String rank){
		super(name, city, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours=officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank=rank;
	}
	
	public String toString() {
		return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}
	
}
