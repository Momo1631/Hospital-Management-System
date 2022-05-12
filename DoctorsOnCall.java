package Hospital;

public class DoctorsOnCall extends Doctors {
	
	private double feesPerCall;
	private String payementDue;
	
	
	
	public DoctorsOnCall(String Firstname, String Lastname, int Phonenumber, String Department, String identity, String adress,double feesPerCall, String payementDue) {
		super(Firstname,Lastname,Phonenumber,Department,identity,adress);
		this.feesPerCall = feesPerCall;
		this.payementDue = payementDue;
	}
	
	public double getFeesPerCall() {
		return feesPerCall;
	}
	public void setFeesPerCall(double feesPerCall) {
		this.feesPerCall = feesPerCall;
	}
	public String getPayementDue() {
		return payementDue;
	}
	public void setPayementDue(String payementDue) {
		this.payementDue = payementDue;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" feesPerCall ="+feesPerCall+" payment due: "+payementDue;
	}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return super.toString()+" feesPerCall ="+feesPerCall+" payment due: "+payementDue;
	}

}


