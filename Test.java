package Hospital;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Scanner;




import java.io.*;


public class Test {
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
		
		Doctors Drs[] = new Doctors[10];
		//list of the doctors in our hospital and their details
		Drs[0]=new ReguluarDoctors("Zeineb","Dridi",54240733,"EMERGENCY","DR001","zeinebdridi@medtech.tn",1115.5,"28 november 2020");
		Drs[1]=new ReguluarDoctors("Youssef","Bouzouaya",25220044,"PATHOLOGY","DR002","yousse@mzdtzch.tn", 1155.5,"25 sep 2020");
		Drs[2]=new ReguluarDoctors("Sami","Chackroun",55442210,"DENTAL","DR003","Sam@medtech;tn",1115.5,"25 sep 2020");
		Drs[3]=new ReguluarDoctors("Mouhab","Alfarra",55448822,"Emergency","DR004","mohaf@meedtech.tn",1444.0,"25sep2002");
		Drs[4]=new ReguluarDoctors("Dorra","Louati",71552200,"PATHOLOGY","DR005","dorralouatti@medtech.tn",1155.5,"25sep2002");
		Drs[5]=new DoctorsOnCall("jaafar","El Guesmi",55114422,"EMERGENCY","DC006","jaaferelguesmi@medtech.tn",444.2,"25sep2002");
		Drs[6]=new DoctorsOnCall("Ahmed","lmkacher",55996644,"PATHOLOGY","DC007","ahmedlmakcher@medtech.tn",444.0,"25janvier 2012");
		Drs[7]=new DoctorsOnCall("mahaba ","azzabi",71223344,"DENTAL","DC008","mahabaazabi@medtech.tn",444.0,"25juin2012");
		Drs[8]=new DoctorsOnCall("ines ","alfarra ",71728344,"EMERGENCY","DC009","inesalfarra@medtech.tn",444.0,"25sep2020");
		Drs[9]=new DoctorsOnCall("malek","stal",71228344,"DENTAL","DC010","malekstal@medtech.tn",444.0,"25sep2020");
		
		//doctors in each departemnet
		Departement Dps[]=new Departement[3];
		Dps[0]=new Departement("EMERGNECY");
		Dps[0].doctorsIn[0]=Drs[0];
		Dps[0].doctorsIn[1]=Drs[3];
		Dps[0].doctorsIn[2]=Drs[5];
		Dps[0].doctorsIn[3]=Drs[8];
		
		Drs[0].setDepartment(Dps[0]);
		Drs[3].setDepartment(Dps[0]);
		Drs[5].setDepartment(Dps[0]);
		Drs[8].setDepartment(Dps[0]);
		
		Dps[1]=new Departement("PATHOLOGY");
		Dps[1].doctorsIn[0]=Drs[1];
		Dps[1].doctorsIn[1]=Drs[4];
		Dps[1].doctorsIn[2]=Drs[6];
		
		Drs[1].setDepartment(Dps[1]);
		Drs[4].setDepartment(Dps[1]);
		Drs[6].setDepartment(Dps[1]);
		
		Dps[2]=new Departement("DENTAL");
		Dps[2].doctorsIn[0]=Drs[3];
		Dps[2].doctorsIn[1]=Drs[7];
		Dps[2].doctorsIn[2]=Drs[9];
		
		Drs[2].setDepartment(Dps[2]);
		Drs[7].setDepartment(Dps[2]);
		Drs[9].setDepartment(Dps[2]);
		//roooms in our hospital 
		RoomsDetails RD[]=new RoomsDetails[9];
		
		RD[0]=new RoomsDetails(100,"private",true);
		RD[1]=new RoomsDetails(101,"public",true);
		RD[2]=new RoomsDetails(102,"private",true);
		RD[3]=new RoomsDetails(200,"private",true);
		RD[4]=new RoomsDetails(201,"public",true);
		RD[5]=new RoomsDetails(203,"private",true);
		RD[6]=new RoomsDetails(300,"private",true);
		RD[7]=new RoomsDetails(301,"public",true);
		RD[8]=new RoomsDetails(302,"private",true);
		
		
		Dps[0].roomsIn[0]=RD[0];
		Dps[0].roomsIn[1]=RD[1];
		Dps[0].roomsIn[2]=RD[2];
		
		Dps[1].roomsIn[0]=RD[3];
		Dps[1].roomsIn[1]=RD[4];
		Dps[1].roomsIn[2]=RD[5];
		
		Dps[2].roomsIn[0]=RD[6];
		Dps[2].roomsIn[1]=RD[7];
		Dps[2].roomsIn[2]=RD[8];
		
		//initial patients at hospital
		ArrayList<Patient> Ps=new ArrayList<Patient>();
	Patient P1=new Patient("aziz","abstar",55882266,"1",15,'m',"azizabstar@medtech.tn","tunis","25 sep2002",Drs[0],"broken leg",Dps[0]);
	P1.setDoctorReferred(Drs[0]);
	P1.setDepartmentName(Dps[0]);
	Dps[0].setPatientsIn(P1);
	RD[0].setPatienIn(P1);
	RD[0].setAvailable(false);
	Ps.add(P1);
	Patient P2=new Patient("sarra","elaarem",5588245,"2",19,'f',"sarraelarrem@medtech.tn","gafsa","25 sep2003",Drs[0],"Cancer",Dps[0]);
	P2.setDoctorReferred(Drs[0]);
	P2.setDepartmentName(Dps[0]);
	Dps[0].setPatientsIn(P2);
	RD[1].setPatienIn(P2);
	RD[1].setAvailable(false);
	Ps.add(P2);
	
	Patient P3=new Patient("mark","triki",55446699,"3",44,'m',"marktriki@medtech.tn","tunis","24 janv 2002",Drs[1],"covid19",Dps[1]);
	P3.setDoctorReferred(Drs[1]);
	P3.setDepartmentName(Dps[1]);
	Dps[1].setPatientsIn(P3);
	RD[3].setPatienIn(P3);
	RD[3].setAvailable(false); 
	Ps.add(P3);
	
	
	Patient P4=new Patient("jalel","brik",41776699,"4",64,'f',"jalelbrik@medtech.tn","paris","24 juin 2005",Drs[2],"headache",Dps[2]);
	P4.setDoctorReferred(Drs[2]);
	P4.setDepartmentName(Dps[2]);
	Dps[2].setPatientsIn(P4);
	RD[7].setPatienIn(P4);
	RD[7].setAvailable(false);
	Ps.add(P4);
	
	
	
	
	
	

	
	
	
	
	
	
	
	LoginPage loginpage=new LoginPage();
	
 
		int ch ; 
		Boolean exit=true;
		Scanner scan = new Scanner(System.in);
		while (exit != false)
			
		{System.out.println("WELCOME TO MEDTECH HOSPITAL !");
		
		
				
		 
		
		
		
		
			System.out.println("menu");
		System.out.println("1. Add Patient  ");
		System.out.println("2. show Department ");
		System.out.println("3. show Doctor ");
		System.out.println("4. show Patients ");
		System.out.println("5. Check out patients  ");
		System.out.println("6. EXIT ");
		ch = scan.nextInt();
		
		if (ch !=6) 
		
		{switch(ch) {
		case 1 : 
			System.out.println("Hello and welcome, please provide me the name");
			Scanner scan1 = new Scanner(System.in);
			String name=scan1.nextLine();
			
			System.out.println("last name ?");
			
			String Lastname=scan1.nextLine();
			
			System.out.println("phone number?");
			
			int phn=scan1.nextInt();
			
			System.out.println("patient number?");
			
			 String patientnum=scan1.nextLine();
			 
			 System.out.println("patient age?");
				
				int age=scan1.nextInt();
				
				System.out.println("patient gender?");
				
				char patientsex=scan1.next().charAt(0);
				
				System.out.println("patient adress?");
				
				String padress=scan1.nextLine();
				
				
				System.out.println("patient city?");
				
				String pcity=scan1.nextLine();
				
				
				System.out.println("date of registration?");
				
				String pdate=scan1.nextLine();
				
				System.out.println(" the patient diagnosis ?");
				
				String diag=scan1.nextLine();
				
				Patient P=new Patient(name,Lastname,phn,patientnum,age,patientsex,padress,pcity,pdate,diag);
				Ps.add(P);
				
				
				System.out.println("the identity of the patient doctor ?");
				
				String pdoctor=scan1.nextLine();
				
				for (int i=0;i<10;i++)
				{if (Drs[i].getIdentity().equalsIgnoreCase(pdoctor)==true)
					P.setDoctorReferred(Drs[i]);
				}
				
				
				
				
				
				System.out.println(" Enter the departement of the patient ?");
				
				String dep=scan1.nextLine();
				
				for (int i=0;i<3;i++)
				{if (Dps[i].getDepartementName().equalsIgnoreCase(dep)==true)
					P.setDepartmentName(Dps[i]);
				}
				
				System.out.println("the rooms available for this patient are:");
				if (dep.equalsIgnoreCase("emergency")==true)
				{Dps[0].setPatientsIn(P);
					for (int i=0; i<3;i++)
				{if (RD[i].isAvailable()==true )
				{System.out.println(RD[i].getNumber()+" "+RD[i].getType());
				}}
				}
				
				
				else if   (dep.equalsIgnoreCase("pathology")==true)
					
				{Dps[1].setPatientsIn(P);
					for (int i=3; i<6;i++)
				{if (RD[i].isAvailable()==true )
				{System.out.println(RD[i].getNumber()+" "+RD[i].getType());
				}}}
				else if (dep.equalsIgnoreCase("dental")==true)
				{Dps[2].setPatientsIn(P);
					for (int i=6; i<9;i++)
				{if (RD[i].isAvailable()==true )
				{System.out.println(RD[i].getNumber()+" "+RD[i].getType());
				}}}
				System.out.println("please enter the number of the room to be admitted to");
				Scanner sc13=new Scanner (System.in);
				int rnum=sc13.nextInt();
				for (int i=0;i<9;i++)
				{if (RD[i].getNumber()==rnum)
					RD[i].setPatienIn(P);
				RD[i].setAvailable(false);
				}
				try {FileWriter myWriter = new FileWriter("C:\\Users\\lenovo\\eclipse-workspace\\PrjectCs\\src\\Hospital\\Records.txt");
						
				myWriter.write(P.ToString());
				myWriter.close();}
		catch(IOException e) {System.out.println("An error occurred.");}
				System.out.println("thank you and good day");
				
				
			
		
			
			
			break ; 
		case 2: 
			int choice ; 
			 
			
			System.out.println("menu");
			System.out.println("1. Department of Emergency ");
			System.out.println("2. Department of PATHOLOGY");
			System.out.println("3. Department of DENTAL");

		    choice = scan.nextInt();
		    switch(choice)
		    {  case 1 : 
		    	
		    	System.out.println("Doctors in Emergency are ");
		for (int i=0 ; i<=3;i++)
			
		{    
			System.out.println(Dps[0].doctorsIn[i].toString());}
		
		System.out.println("Rooms in Emergency are :");
for (int i=0 ; i<=2;i++)
			
		{     
			System.out.println(Dps[0].roomsIn[i].toString());
			if (Dps[0].roomsIn[i].isAvailable()==false )
				{System.out.println(Dps[0].roomsIn[i].getPatienIn().ToString());}}
		
System.out.println("patients in Emergency are ");
Dps[0].getPatientsIn();


		
		
		
		    break ; 
		    case 2 : 
		    	System.out.println("Doctors in PATHOLOGY are ");
				for (int i=0 ; i<3;i++)
					
				{     
					System.out.println(Dps[1].doctorsIn[i].toString());}
				
				System.out.println("Rooms in Pathology are ");
		for (int i=0 ; i<=2;i++)
					
				{     
			System.out.println(Dps[1].roomsIn[i].toString());
			if (Dps[1].roomsIn[i].isAvailable()==false )
				{System.out.println(Dps[1].roomsIn[i].getPatienIn().ToString());}}
		
		System.out.println("patients in pathology are ");
		
			Dps[1].getPatientsIn();

		
				
		    	break ; 
		    
		case 3 :
			System.out.println("Doctors in Dental are ");
			for (int i=0 ; i<3;i++)
				
				{System.out.println(Dps[2].doctorsIn[i].toString());}
			
			
			System.out.println("Rooms in dental are ");
	for (int i=0 ; i<=2;i++)
				
			{     
				System.out.println(Dps[2].roomsIn[i].toString());
				if (Dps[2].roomsIn[i].isAvailable()==false )
					{System.out.println(Dps[2].roomsIn[i].getPatienIn().ToString());}}
	System.out.println("patients in dental are ");
	Dps[2].getPatientsIn();
			break;
			
		}
		
		break;
		    
	     case 3:
					System.out.println("woww");
					for (int i=0; i<=9; i++)
						
					{
						if (Drs[i] instanceof ReguluarDoctors) {System.out.println(Drs[i].toString());}
						else if (Drs[i] instanceof DoctorsOnCall){System.out.println(Drs[i].toString());}
						System.out.println("patients assigned to this doctor are ");
						int k=0;
						for (int j=0;j<Ps.size();j++)
							{if (Ps.get(j).getDoctorReferred()==Drs[i])
								{System.out.println(Ps.get(j).ToString());
							k++;}
							}
					if (k==0)	System.out.println("NONE");
						
				}break;
	
		
		case 4:
			System.out.println("patients registered in this hospital ");
		
			
				for (int i=0; i<Ps.size(); i++)
	{System.out.println(Ps.get(i).ToString());
			}
	break;
	
	
		case 5: 
			System.out.println("give the id of the patient leaving ");
			Scanner scan15 = new Scanner(System.in);
			String num=scan15.nextLine();
			for  (int i=0; i<Ps.size(); i++)
			{if (Ps.get(i).getPatientNumber().equals(num))
				System.out.println("the date of registration of tis patient is :"+Ps.get(i).getEntryDate());}
			System.out.println("how many nights have this patient stayed ");
			Scanner scan16 = new Scanner(System.in);
			int nights=scan15.nextInt();
			double pay;
			pay=80*nights;
			System.out.println("the total expediture is  "+pay+" Dt");
			System.out.println("please enter ok to remove this patient from the hospital");
			Scanner scan17 = new Scanner(System.in);
		String conf=scan15.nextLine();
		if (conf.equalsIgnoreCase("OK")) 
				{for  (int i=0; i<Ps.size(); i++)
				{ if (Ps.get(i).getPatientNumber().equals(num))
							 Ps.remove(i);}
							}
		break;
		}
			
		}else {exit =false;}}
	}


	



	






	
}
	

		
		
		
		