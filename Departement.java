package Hospital;
import java.util.ArrayList;
public class Departement {
	public Doctors doctorsIn[];
	public ArrayList<Patient> patientsIn;
	private String departementName;
	public RoomsDetails roomsIn[];
	
	
	public Departement(String departementName )
	{this.departementName=departementName;
	doctorsIn=new Doctors[4];
	patientsIn=new ArrayList<Patient>();
	roomsIn=new RoomsDetails[3];
	}
	
	public void getDoctorsIn() {
		for (int i=0; i<=4;i++)
		{System.out.println("The doctors in this departement are "+doctorsIn[i].toString());
	}}


	public void getPatientsIn() {
		for (int i=0; i< patientsIn.size();i++)
		{System.out.println(patientsIn.get(i).ToString());
	}
	}
	public void setPatientsIn(Patient e) {
		patientsIn.add(e);
	}
	public String getDepartementName() {
		return departementName;
	}
	public void setDepartementName(String departementName) {
		this.departementName = departementName;
	}
	public void getRoomsIn() {
		for (int i=0; i<=3; i++)
		{System.out.println("The rooms in this departement are "+roomsIn[i].toString());
	}
	
	
	

	}}
