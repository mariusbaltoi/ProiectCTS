package clase;

import interfete.Persoana;

public class Angajat implements Persoana{
	
	private String numeAngajat;

	public Angajat(String numeAngajat) {
		super();
		this.numeAngajat = numeAngajat;
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Angajatul se numeste "+numeAngajat);
	}

	@Override
	public void addChild(Persoana persoana) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChild(Persoana persoana) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Persoana getChild(int nr) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNumeAngajat() {
		return numeAngajat;
	}

	public void setNumeAngajat(String numeAngajat) {
		this.numeAngajat = numeAngajat;
	}
	
	

}
