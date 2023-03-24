package ar.com.codoacodo.clase8.clean.domain;

public class User {

	private Long id;
	private String username;
	private Float wage;
	
	public User(Long id, String username, Float wage) {
		this.id = id;
		this.username = username;
		this.wage = wage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Float getWage() {
		return wage;
	}

	public void setWage(Float wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", wage=" + wage + "]";
	}

	
}
