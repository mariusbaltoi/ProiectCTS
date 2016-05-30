package clase;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import interfete.IClient;
import interfete.IClientBuilder;
import interfete.Observer;

public class Client implements IClient, IClientBuilder, Observer{
	
	private String numeClient;
	private String CNP;
	private String adresa;
	private float venit;
	
	public Client(String numeClient, String CNP, String adresa, float venit) {
		super();
		this.numeClient = numeClient;
		this.CNP = CNP;
		this.adresa = adresa;
		this.venit = venit;
	}

	@Override
	public String toString() {
		return "Clientul "+numeClient+" are CNP-ul "+CNP+", domiciliul la adresa "+adresa+" si un venit de "+venit+" um.";
	}

	@Override
	public Client copiazaClient() {
		// TODO Auto-generated method stub
		return this;
	}

	public IClientBuilder setNumeClient(String numeClient) {
		this.numeClient = numeClient;
		return this;
	}

	public IClientBuilder setCNP(String cNP) {
		this.CNP = cNP;
		return this;
	}

	public IClientBuilder setAdresa(String adresa) {
		this.adresa = adresa;
		return this;
	}

	public IClientBuilder setVenit(float venit) {
		this.venit = venit;
		return this;
	}

	@Override
	public Client build() {
		// TODO Auto-generated method stub
		return new Client(numeClient,CNP,adresa,venit);
	}
	
	
	public Client(String numeClient){
		super();
		this.numeClient=numeClient;
	}

	@Override
	public void update(String mesaj) {
		System.out.println("Clientul "+numeClient+" a observat ca "+mesaj);
		
	}
	
	public int getVarstaClient(){
		
		Calendar calendar = Calendar.getInstance();
		int anNastere = 0;
		switch(CNP.charAt(0)) {
			case '1': {
				anNastere = 1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
				break;
			}
			case '2': {
				anNastere = 1900 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
				break;
			}
			case '3': {
				anNastere = 1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
				break;
			}
			case '4': {
				anNastere = 1800 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
				break;
			}
			case '5': {
				anNastere = 2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2)); 
				break;
			}
		case '6': {
			anNastere = 2000 + Integer.parseInt("" + CNP.charAt(1) + CNP.charAt(2));
			break;
			}
		}
		//System.out.println("Anul de nastere al clientului este: "+anNastere);
		int lunaNastere = Integer.parseInt("" + CNP.charAt(3) + CNP.charAt(4));
		int ziNastere = Integer.parseInt("" + CNP.charAt(4) + CNP.charAt(5));
		calendar.set(anNastere, lunaNastere, ziNastere);
		Calendar calendar1 = Calendar.getInstance();
		long diferenta = calendar1.getTimeInMillis()-calendar.getTimeInMillis();
		int ani = (int) (TimeUnit.MILLISECONDS.toDays(diferenta)/365);
		return ani;
	}
	
	public boolean verificaCNP(){
		if (CNP.length()!=13) 
			return false;
		for(int i = 0;i<=12;i++) {
			if(CNP.charAt(i)>'9' ||CNP.charAt(i) < '0')
				try {
					throw new Exception("Formatul este gresit!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		int suma=0;
		//String number="279146358279";
		for(int i=0;i<12;i++){
			suma+=Integer.parseInt(""+CNP.charAt(i))*Integer.parseInt(""+CNP.charAt(i));			
		}
		int cifraControl=suma%11;
		if(cifraControl==10)
			cifraControl=1;
		return cifraControl==Integer.parseInt(""+CNP.charAt(12));
	}
	
	public boolean esteMajor(){
		if (getVarstaClient()>18) 
			return true;
		else 
			return false;
	}
	
	public String verificaVenit(){
		if(venit<1000)
			return "Neeligibil";
		else
			return "Eligibil";
	}
	
	public List<Integer> verificaVarsteClienti(int n)
	{
		if(n==0) 
			return null;
		else
		{
			List<Integer> listaVarsteClienti=new ArrayList();
			for(int i=0;i<n;i++)
				listaVarsteClienti.add(i+20);
			return listaVarsteClienti;
		}		
	}

	public boolean esteMajor(int varsta) {
		if (varsta>18) 
			return true;
		else 
			return false;
	}
	
	public boolean verificaZiua(){
		String zi="" + CNP.charAt(5) + CNP.charAt(6);
		String luna="" + CNP.charAt(3) + CNP.charAt(4);
		String an="19" + CNP.charAt(1) + CNP.charAt(2);
		if (luna.equals("01")||luna.equals("03")||luna.equals("05")||luna.equals("07")||luna.equals("08")||luna.equals("10")||luna.equals("12"))
			if (Integer.parseInt(zi)>=1 && Integer.parseInt(zi)<=31)
				return true;
		if (luna.equals("04")||luna.equals("06")||luna.equals("09")||luna.equals("11"))
			if (Integer.parseInt(zi)>=1 && Integer.parseInt(zi)<=30)
				return true;
		if (luna.equals("02") && Integer.parseInt(an)%4==0)
			if (Integer.parseInt(zi)>=1 && Integer.parseInt(zi)<=29)
				return true;
		if (luna.equals("02") && Integer.parseInt(an)%4!=0)
			if (Integer.parseInt(zi)>=1 && Integer.parseInt(zi)<=28)
				return true;
		return false;
	}
	
	public boolean verificaLuna(){
		String luna="" + CNP.charAt(3) + CNP.charAt(4);
		if (Integer.parseInt(luna)>0 && Integer.parseInt(luna)<=12)
			return true;
		else
			return false;
	}
	

}


	
	
	
