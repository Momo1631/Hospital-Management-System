package Hospital;

public class ReguluarDoctors extends Doctors{
	private double salary;
	private String dateOfJ;
	public ReguluarDoctors(String Firstname, String Lastname, int Phonenumber, String Department, String identity, String adress,double salary, String dateOfJ) {
		super(Firstname,Lastname,Phonenumber,Department,identity,adress);
		this.salary = salary;
		this.dateOfJ = dateOfJ;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateOfJ() {
		return dateOfJ;
	}
	public void setDateOfJ(String dateOfJ) {
		this.dateOfJ = dateOfJ;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" salary: "+salary+" DT "+"date of join: "+dateOfJ;}
	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return super.toString()+" salary: "+salary+" DT "+"date of join: "+dateOfJ;}
	
}