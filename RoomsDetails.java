package Hospital;


	public class RoomsDetails {
	         
	       private  int number ; 
	       private String type ;
	       private boolean available;
	       private Patient patienIn;
	       
	       public RoomsDetails(int number , String type , boolean available) 
		      {this.number=number;
		      this.type=type;
		      this.available=available;
		   
		    
		      }
	       
	      public RoomsDetails(int number , String type , boolean available, Patient patienIn  ) 
	      {this.number=number;
	      this.type=type;
	      this.available=available;
	      this.patienIn=patienIn;
	    
	      }
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public boolean isAvailable() {
			return available;
		}
		public void setAvailable(boolean available) {
			this.available = available;
		}
		public Patient getPatienIn() {
			return patienIn;
		}
		public void setPatienIn(Patient patienIn) {
			this.patienIn = patienIn;
		}
		
		public String toString()
		{return "Room Number : "+number+" type : "+type+" AVAILABLE : "+ available+"   Patients In this room : ";} 
	}
	

