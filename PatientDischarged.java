package Hospital;

	public class PatientDischarged extends Patient {
	       private String TreatmentGiven;
	       private String DateOfDischarge;
	       
	       
	       public PatientDischarged (String Firstname, String Lastname, int PhoneNumber, String PatientNumber, int Age, char Sex, String Adress, String City, String EntryDate, Doctors DoctorReferred, String Diagnosis,Departement DepartmentName, String TreatmentGiven,String DateOfDischarge) {
	   	    super( Firstname,  Lastname,  PhoneNumber,  PatientNumber,  Age,  Sex,  Adress,  City,  EntryDate,  DoctorReferred,  Diagnosis, DepartmentName);
	   		this.TreatmentGiven=TreatmentGiven;
	   	    this.DateOfDischarge=DateOfDischarge;
	   	}
	       
	       
	       
		public String getDateOfDistcharge() {
			return DateOfDischarge;
		}
		public void setDateOfDistcharge(String DateOfDischarge) {
			this.DateOfDischarge = DateOfDischarge;
		}
		public String getTreatmentGiven() {
			return TreatmentGiven;
		}
		public void setTreatmentGiven(String TreatmentGiven) {
			this.TreatmentGiven = TreatmentGiven;
		}


		
	
	public String ToString() {
		return super.ToString()+" "+TreatmentGiven+" "+DateOfDischarge;
	}
	}


