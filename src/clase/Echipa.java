package clase;

import java.util.ArrayList;

import interfete.Persoana;

public class Echipa implements Persoana{
	
	private int numarMembriEchipa;
	private String numeEchipa;
	public ArrayList<Persoana> lista;

	public Echipa() {
		super();
		this.lista = new ArrayList<>();
	}

	public Echipa(int numarMembriEchipa, String numeEchipa) {
		super();
		this.numarMembriEchipa = numarMembriEchipa;
		this.numeEchipa = numeEchipa;
	}



	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("Echipa: ");
		for(Persoana persoana:lista){
			persoana.descriere();
		}
	}

	@Override
	public void addChild(Persoana persoana) {
		// TODO Auto-generated method stub
		lista.add(persoana);
	}

	@Override
	public void removeChild(Persoana persoana) {
		// TODO Auto-generated method stub
		lista.remove(persoana);
	}

	@Override
	public Persoana getChild(int numar) {
		// TODO Auto-generated method stub
		return lista.get(numar);
	}
	
	public String numarMembriEchipa(){
		if (numarMembriEchipa<10) 
			return "mica";
		else
			if (numarMembriEchipa<20) 
				return "medie";
			else
				return "mare";
		}
}
