package Hospital;


	public abstract class Person {
	       private String Firstname;
	       private String Lastname;
	       private int Phonenumber;
		
	       public String getFirstname() {
			return Firstname;
		}
		public void setFirstname(String Firstname) {
			this.Firstname = Firstname;
		}
		public int getPhonenumber() {
			return Phonenumber;
		}
		public void setPhonenumber(int Phonenumber) {
			this.Phonenumber = Phonenumber;
		}
		public String getLastname() {
			return Lastname;
		}
		public void setLastname(String Lastname) {
			this.Lastname = Lastname;
		}
	public Person(String Firstname, String Lastname, int Phonenumber) {
		 this.Firstname=Firstname;
		 this.Lastname=Lastname;
		 this.Phonenumber=Phonenumber;
	}
	




	public abstract String ToString(); 
		
	

	
}
