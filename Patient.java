package Hospital;

public class Patient extends Person {
    private String PatientNumber;
    private int Age;
    private char Sex;
    private String Adress;
    private String City;
    private String EntryDate;
    private Doctors DoctorReferred;
    private String Diagnosis;
    private Departement DepartmentName;
    
    
    public Patient(String Firstname, String Lastname, int PhoneNumber, String PatientNumber, int Age, char Sex, String Adress, String City, String EntryDate, String Diagnosis) {
    	super(Firstname, Lastname, PhoneNumber);
    	this.PatientNumber=PatientNumber;
    	this.Age=Age;
    	this.Sex=Sex;
    	this.Adress=Adress;
    	this.City=City;
    	this.EntryDate=EntryDate;
    	
    	this.Diagnosis=Diagnosis;
    	
    }
    
    
    
    public Patient(String Firstname, String Lastname, int PhoneNumber, String PatientNumber, int Age, char Sex, String Adress, String City, String EntryDate, Doctors DoctorReferredname, String Diagnosis,Departement DepartmentName) {
    	super(Firstname, Lastname, PhoneNumber);
    	this.PatientNumber=PatientNumber;
    	this.Age=Age;
    	this.Sex=Sex;
    	this.Adress=Adress;
    	this.City=City;
    	this.EntryDate=EntryDate;
    	this.DoctorReferred=DoctorReferredname;
     
    	this.Diagnosis=Diagnosis;
    	this.DepartmentName=DepartmentName;
    }
    
    
public String getPatientNumber() {
		return PatientNumber;
	}
public void setPatientNumber(String patientNumber) {
		PatientNumber = patientNumber;
	}
public String getAdress() {
		return Adress;
	}
public void setAdress(String adress) {
		Adress = adress;
	}
public char getSex() {
		if(Sex=='F'&& Sex=='M') {
		return Sex;
		}
		else {
		return 'W';
		}	
	}
public void setSex(char sex) {
		Sex = sex;
	}
public int getAge() {
		return Age;
	}
public void setAge(int age) {
		Age = age;
	}
public String getCity() {
		return City;
	}
public void setCity(String city) {
		City = city;
	}
public Doctors getDoctorReferred() {
		return DoctorReferred;
	}
public void setDoctorReferred(Doctors doctorReferred) {
		this.DoctorReferred = doctorReferred;
	}
public String getEntryDate() {
		return EntryDate;
	}
public void setEntryDate(String entryDate) {
		EntryDate = entryDate;
	}
public String getDiagnosis() {
		return Diagnosis;
	}
public void setDiagnosis(String diagnosis) {
		Diagnosis = diagnosis;
	}
public Departement getDepartmentNames() {
		return DepartmentName;
	}
public void setDepartmentName(Departement departmentName) {
		DepartmentName = departmentName;
	}

		
public String PTPT() {
			return"PT"+getPatientNumber();
}
//GENERAL	

//Regular Patient	



public String ToString() {
	return super.getFirstname()+" "+super.getLastname()+" "+super.getPhonenumber()+"  "+Age+"  "+Sex+"  "+Adress+"  "+City+"  "+EntryDate+"  "+DoctorReferred.getIdentity()+"  "+Diagnosis+"  "+DepartmentName.getDepartementName();
}

}


