package Hospital;


	public class PatientRegular extends PatientCheckup{
	       private String MedecineRecommended;
	       private String StatusOfTreatment;
		public String getMedecineRecommended() {
			return MedecineRecommended;
		}
		public void setMedecineRecommended(String MedecineRecommended) {
			this.MedecineRecommended = MedecineRecommended;
		}
		public String getStatusOfTreatment() {
			return StatusOfTreatment;
		}
		public void setStatusOfTreatment(String StatusOfTreatment) {
			this.StatusOfTreatment = StatusOfTreatment;
		}

	public PatientRegular(String Firstname, String Lastname, int PhoneNumber, String PatientNumber, int Age, char Sex, String Adress, String City, String EntryDate, Doctors DoctorReferred, String Diagnosis,Departement DepartmentName,String Treatment, String Status, String MedecineRecommended, String StatusOfTreatment) {
		super(Firstname,  Lastname,  PhoneNumber,  PatientNumber,  Age,  Sex,  Adress,  City,  EntryDate,  DoctorReferred,  Diagnosis, DepartmentName, Status, Treatment);
	    this.MedecineRecommended=MedecineRecommended;
		this.StatusOfTreatment=StatusOfTreatment;
	}

	public String ToString() {
		return super.ToString()+" "+MedecineRecommended+"  "+StatusOfTreatment;
	}



}
