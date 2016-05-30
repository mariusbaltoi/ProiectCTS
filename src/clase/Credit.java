package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.IOperatiune;
import interfete.Observer;
import interfete.Subject;

public class Credit implements IOperatiune, Subject{
	
	private String idCredit;
	private double dobanda;
	private String dataScadenta;
	private float valoareCredit;
	
	public Credit(double dobanda, String dataScadenta){
		this.dobanda=dobanda;
		this.dataScadenta=dataScadenta;
	}

	@Override
	public void anuntaTipOperatiune() {
		System.out.println("Acesta este un credit bancar cu dobanda de "+dobanda+ " si data scadenta la "+dataScadenta+"!");
	}
	
	public ArrayList<Observer> listaObservatori;
	
	public Credit(String idCredit) {
		super();
		this.idCredit = idCredit;
		listaObservatori=new ArrayList();
	}
	
	@Override
	public void addObserver(Observer o) {
		listaObservatori.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		listaObservatori.remove(o);
	}

	@Override
	public void notify(String mesaj) {
		for (Observer ob:listaObservatori){
			ob.update(mesaj);
		}
	}
	
	public void plataRata(double suma){
		System.out.println("A fost platita o rata in valoare de "+suma+" um.");
	}
	
	public void modificareDobanda(double dobanda){
		System.out.println("Dobanda s-a modificat la "+dobanda+"%.");
	}
	
	
	public Credit(double dobanda, float valoareCredit) {
		super();
		this.dobanda = dobanda;
		this.valoareCredit = valoareCredit;
	}

	public float costTotalCredit(){
		return (float) (dobanda*valoareCredit/100+valoareCredit);
	}
	
	public boolean valoareMareCredit(){
		if (valoareCredit>10000)
			return true;
		else 
			return false;
	}
	
	public boolean valoareMareCredit1(int valoare){
		if (valoare>10000)
			return true;
		else 
			return false;
	}
	
	public boolean verificaDobanda(){
		if (calculeazaDobanda()>0)
			return true;
		else
			return false;
	}
	
	public int calculeazaDobanda(){
		return (int) (dobanda*valoareCredit/100);
	}
	
	public Credit copiazaCredit(){
        return this;
    }
	
	public float sumaCredite(float suma1, float suma2)
	{
		if ((suma1>0) && (suma2>0)) 
			return suma1+suma2;
		else 
			return 0;
	}
	
	public boolean crediteValoareMare(int n)
	{
		if(n==0) 
			return false;
		else
		{
			List<Float> listaCredite=new ArrayList();
			for(int i=0;i<n;i++)
				listaCredite.add((float) (i+20000));

			int ok=1;
			for(Float i: listaCredite)
				if (i<10000) ok=0;
			if (ok==1) 
				return true;
			else 
				return false;
		}		
	}
	
	public boolean dobandaNula(){
		if (dobanda==0)
			return true;
		else 
			return false;
	}
	
	

}
