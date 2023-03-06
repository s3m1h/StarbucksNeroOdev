package entities.concrete;


public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String NationaltyId;
	
	public Customer() {
		super();
	}

	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationaltyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationaltyId = nationaltyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationaltyId() {
		return NationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		NationaltyId = nationaltyId;
	}
	

}
