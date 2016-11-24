public class Phonebook {
	private String fname;
	private String lname;
	private String number;
	
	public Phonebook(String fname, String lname, String number){
	this.fname = fname;
	this.lname = lname;
	this.number = number;
	}
	
	public String toString(){
		return fname + "   " + lname + "   " + number;
	}
}