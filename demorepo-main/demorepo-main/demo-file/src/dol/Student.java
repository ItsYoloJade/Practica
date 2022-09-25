package dol;

import java.util.Date;

public class Student extends Person {

	private String NumCarnet;
	private Date Inscriptiondate;
	
	
	public Student() {
		super();
	}


	public Student(String numCarnet, Date inscriptiondate) {
		super();
		NumCarnet = numCarnet;
		Inscriptiondate = inscriptiondate;
	}


	public String getNumCarnet() {
		return NumCarnet;
	}


	public void setNumCarnet(String numCarnet) {
		NumCarnet = numCarnet;
	}


	public Date getInscriptiondate() {
		return Inscriptiondate;
	}


	public void setInscriptiondate(Date inscriptiondate) {
		Inscriptiondate = inscriptiondate;
	}
	
	
	
}
