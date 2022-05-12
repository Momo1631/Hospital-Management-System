package Hospital;

	public class PatientOperated extends PatientCheckup {
		   private String TypeOfOperation;
		   private String PatientConiditonBeforeOp;
		   private String PatientConditionAfterOp;
	       private String TreatmentAdvice;
	       
	       
	       
   public PatientOperated(String Firstname, String Lastname, int PhoneNumber, String PatientNumber, int Age, char Sex, String Adress, String City, String EntryDate, Doctors DoctorReferred, String Diagnosis,Departement DepartmentName,String Treatment, String Status,String TypeOfOperation ,String PatientConiditonBeforeOp, String PatientConditionAfterOp, String TreatmentAdvice) {
			   super( Firstname,  Lastname,  PhoneNumber,  PatientNumber,  Age,  Sex,  Adress,  City,  EntryDate,  DoctorReferred,  Diagnosis, DepartmentName, Status, Treatment);
			   this.TypeOfOperation=TypeOfOperation;
			   this.PatientConditionAfterOp=PatientConditionAfterOp;
			   this.PatientConiditonBeforeOp=PatientConiditonBeforeOp;
			   this.TreatmentAdvice=TreatmentAdvice;
		}

	       
	       
		public String getTypeOfOperation() {
			return TypeOfOperation;
		}
		public void setTypeOfOperation(String typeOfOperation) {
			TypeOfOperation = typeOfOperation;
		}
		public String getPatientConditionAfterOp() {
			return PatientConditionAfterOp;
		}
		public void setPatientConditionAfterOp(String patientConditionAfterOp) {
			PatientConditionAfterOp = patientConditionAfterOp;
		}
		public String getPatientConiditonBeforeOp() {
			return PatientConiditonBeforeOp;
		}
		public void setPatientConiditonBeforeOp(String patientConiditonBeforeOp) {
			PatientConiditonBeforeOp = patientConiditonBeforeOp;
		}
		public String getTreatmentAdvice() {
			return TreatmentAdvice;
		}
		public void setTreatmentAdvice(String treatmentAdvice) {
			TreatmentAdvice = treatmentAdvice;
		}
	
	public String ToString() {
		return super.ToString()+"  "+TypeOfOperation+"  "+PatientConiditonBeforeOp+"  "+PatientConditionAfterOp+"  "+TreatmentAdvice;
	}

	}


