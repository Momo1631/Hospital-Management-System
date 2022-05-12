package Hospital;

	public class PatientCheckup extends Patient{
	       private String Treatment;
	       private String Status;
	       
	       
	       public PatientCheckup(String Firstname, String Lastname, int PhoneNumber, String PatientNumber, int Age, char Sex, String Adress, String City, String EntryDate, Doctors  DoctorReferred, String Diagnosis,Departement DepartmentName,String Treatment, String Status) {
	   		super( Firstname,  Lastname,  PhoneNumber,  PatientNumber,  Age,  Sex,  Adress,  City,  EntryDate,  DoctorReferred,  Diagnosis, DepartmentName);
	   		this.Status=Status;
	   		this.Treatment=Treatment;
	   	    
	   	} 
	       
	       
	       
		public String getTreatment() {
			return Treatment;
		}

		public void setTreatment(String Treatment) {
			this.Treatment = Treatment;
		}

		public String getStatus() {
			if(Status== "Admitted" || Status=="Referred" || Status=="Regular Patient")
			{
			return Status;}
			else { return "Error";}
		}

		public void setStatus(String Status) {
			this.Status = Status;
		}
	
	public String ToString() {
		return super.ToString()+"  "+Treatment+"  "+Status;
	}

	}


