package clase;

import interfete.IBank;

public class Banca implements IBank{
	
	private String nume; 
	private int numarAngajati;
	private String adresa;
	
	public static Banca singleton=null;
	
	
	private Banca(String nume, int numarAngajati, String adresa){
		this.nume=nume;
		this.numarAngajati=numarAngajati;
		this.adresa=adresa;
	}
	
	public static Banca getInstance(String nume, int numarAngajati, String adresa){
		if (singleton == null)
			singleton = new Banca(nume,numarAngajati,adresa);
		return singleton;
		
	}

	@Override
	public String toString() {
		return "Banca "+ nume+ " are un numar de "+ numarAngajati+ " angajati si sediul social la adresa "+adresa;
	}
	
	Bank bank;
	
	public Banca(Bank bank){
		super();
		this.bank=bank;
	}
	
	@Override
	public void afiseazaNume() {
		bank.showName();
	}
	
	public String marimeBanca(){
		if (numarAngajati<100)
			return "mica";
		else if ((numarAngajati>100)&&(numarAngajati<1000))
			return "medie";
		else return "mare";
					
	}

	public Banca(int numarAngajati) {
		super();
		this.numarAngajati = numarAngajati;
	}
	
	
}
