package Hospital;

	public class PatientAdmitted extends PatientCheckup {
		private double AdvancePayment;
	    private String ModeOfPayment;
	    private int RoomNumber;
	    private String DateOfAdmission;
	    private String InitialCondition;
	   
	  

	    public PatientAdmitted(String Firstname, String Lastname, int PhoneNumber, String PatientNumber, int Age, char Sex, String Adress, String City, String EntryDate, Doctors DoctorReferred, String Diagnosis, Departement DepartmentName,String Treatment, String Status, int RoomNumber,String DateOfAdmission,String InitialCondition, double AdvancePayment)  {
			super( Firstname,  Lastname,  PhoneNumber,  PatientNumber,  Age,  Sex,  Adress,  City,  EntryDate,  DoctorReferred,  Diagnosis, DepartmentName, Status, Treatment);
		  
		    this.RoomNumber=RoomNumber;
		    this.DateOfAdmission=DateOfAdmission;
		    this.InitialCondition=InitialCondition;
		   
		    this.AdvancePayment=AdvancePayment;
		}
	public String getDateOfAdmission() {
			return DateOfAdmission;
		}
	public void setDateOfAdmission(String dateOfAdmission) {
			DateOfAdmission = dateOfAdmission;
		}
	public int getRoomNumber() {
			return RoomNumber;
		}
	public void setRoomNumber(int roomNumber) {
			RoomNumber = roomNumber;
		}
	public String getInitialCondition() {
			return InitialCondition;
		}
	public void setInitialCondition(String initialCondition) {
			InitialCondition = initialCondition;
		}
	    
	public double getAdvancePayment() {
		return this.AdvancePayment;
	}
	  
	       
	public void setAdvancePayment(double AdvancePayment) {
		this.AdvancePayment=AdvancePayment;
	}
	public String getModeOfPayment() {
		return ModeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		ModeOfPayment = modeOfPayment;
	}
	
	public String ToString() {
		return super.ToString()+"  "+AdvancePayment+" Room :  "+RoomNumber+"  "+DateOfAdmission+"  "+InitialCondition+"  ";
	}
	
	
	}


