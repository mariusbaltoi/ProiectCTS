package clase;

import java.util.Date;

import interfete.IOperatiune;

public class Depozit implements IOperatiune{
	
	private double dobanda;
	private double valoareDepozit;
	private String dataInchidere;
	
	public Depozit(double dobanda, String dataInchidere){
		this.dobanda=dobanda;
		this.dataInchidere=dataInchidere;
	}

	@Override
	public void anuntaTipOperatiune() {
		System.out.println("Acesta este un depozit bancar cu dobanda de "+dobanda+ " si data inchiderii la "+dataInchidere+"!");
		
	}
	
	public int venitDepozit(){
		return (int) (dobanda/100*valoareDepozit);
	}

	public Depozit(double dobanda, double valoareDepozit, String dataInchidere) {
		super();
		this.dobanda = dobanda;
		this.valoareDepozit = valoareDepozit;
		this.dataInchidere = dataInchidere;
	}
	
	public int sumaPrimita(){
		return (int) (valoareDepozit+venitDepozit());
		//return (int) (valoareDepozit+(dobanda/100*valoareDepozit));
	}
	
	public float sumaDepozite(float suma1, float suma2)
	{
		if ((suma1>0) && (suma2>0)) 
			return suma1+suma2;
		else 
			return 0;
	}
	
	public Depozit copiazaDepozit(){
        return this;
    }
	
}
