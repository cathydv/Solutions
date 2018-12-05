
public class Staff extends Employee{
	private String title;
	
	Staff(String name, String city, String phone, String email, 
			int office, double salary, String title){
		super(name, city, phone, email, office, salary);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}

	public String toString() {
		return super.toString() + "\nTitle: "+ title;
	}
}
