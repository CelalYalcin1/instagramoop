package instagramoop;

public class IndividualAccount extends Account {
		
	private String Name;
	private String Surname;
	
	public IndividualAccount() {
		super();
	}
	
	
	
	public IndividualAccount(String name, String surname) {
		super();
		this.Name = name;
		this.Surname = surname;
	}



	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}
	
	
}
