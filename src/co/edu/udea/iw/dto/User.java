package co.edu.udea.iw.dto;

/**
 * 
 * @author Santiago
 *
 */

public class User {
	
	 String id;
	 String name;
	 String last_name;
	 String phone;
	 String city;
	 String password;
	 String email;
	 
	public User(String id, String name, String last_name, String phone, String city, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.phone = phone;
		this.city = city;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	 
	 
}