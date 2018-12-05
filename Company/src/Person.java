
public class Person {
	
	private String name;
	private String city;
	private String phone;
	private String email;
	
	public Person() {
		
	}
	
	public Person(String name, String city, String phone, String email) {
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\nName: " + name + "\nCity: "+ city + "\nPhone: "+ phone + "\nEmail: "+ email;
		
	}
}
