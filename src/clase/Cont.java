package clase;

import interfete.IOperatiune;

public class Cont implements IOperatiune{
	
	private double suma;
	private String dataDeschidere;
	
	public Cont(double suma, String dataDeschidere){
		this.suma=suma;
		this.dataDeschidere=dataDeschidere;
	}

	@Override
	public void anuntaTipOperatiune() {
		System.out.println("Acesta este un cont bancar si contine o suma de "+suma+" um si a fost deschis la data de "+dataDeschidere+"!");
	}
	
	public boolean contGol(){
		if (suma==0)
			return true;
		else return false;
	}
	
	public boolean soldPozititv(){
		if (suma>0)
			return true;
		else 
			return false;
	}
}
