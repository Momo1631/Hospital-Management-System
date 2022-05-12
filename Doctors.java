package Hospital;



public abstract class Doctors extends Person {
	private String identity;

	
	private String adress;
	private Departement department;

	
	
	
	
	
	
	
	
	public Doctors(String Firstname, String Lastname, int Phonenumber, String Department, String identity, String adress) {
		super(Firstname, Lastname, Phonenumber);
		this.department=department;
		this.identity = identity;
		
		this.adress = adress;
		
	}
	
	public String getIdentity() {
		return identity;
	}
	
	

	
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	


public Departement getDepartment() {
		return department;
	}

	public void setDepartment(Departement department) {
		this.department = department;
	}


	

	public void setIdentity(String identity) {
		this.identity = identity;
	}

public String toString()
{return super.getFirstname()+" "+super.getLastname()+" "+super.getPhonenumber()+" adress :"+adress+" department :"+department.getDepartementName();}








}

