package main;

import javax.management.openmbean.OpenDataException;

import clase.Angajat;
import clase.AprobaAgent;
import clase.AprobaCEO;
import clase.AprobaManager;
import clase.AprobareOperatiune;
import clase.Banca;
import clase.Bank;
import clase.Client;
import clase.Credit;
import clase.Echipa;
import clase.Facade;
import clase.OperatiuneFactory;
import enumarari.TipuriOperatiuni;
import interfete.IOperatiune;

public class Main {
	
	public static void main(String[] args){
		
		//Apel Singleton
		Banca banca = Banca.getInstance("BRD", 1500, "BD. Ion Mihalache, Sector 1, Bucuresti");
		System.out.println(banca.toString());
		System.out.println();
		
		//Apel Simple Factory
		OperatiuneFactory operatiuneFactory = new OperatiuneFactory();
		IOperatiune iOperatiune = operatiuneFactory.preiaOperatiune(TipuriOperatiuni.Cont);
		iOperatiune.anuntaTipOperatiune();
		
		OperatiuneFactory operatiuneFactory1 = new OperatiuneFactory();
		IOperatiune iOperatiune1 = operatiuneFactory.preiaOperatiune(TipuriOperatiuni.Depozit);
		iOperatiune1.anuntaTipOperatiune();
		System.out.println();
		
		//Apel Prototype
		Client c = new Client("Popescu Maria", "2900904510873", "Calarasi, Strada Trandafirilor", 2809);
		System.out.println("Client initial: "+c.toString());
		Client c1=c.copiazaClient();
		System.out.println("Client copiat: "+c1.toString());
		System.out.println();
		
		//Apel Builder
		((Client) c1.setAdresa("Calarasi, Strada Libertatii")).setVenit(2000).build();
		System.out.println("Date actualizate client: "+c1.toString());
		System.out.println();
		
		//Apel Adapter
		Bank bank=new Bank("ING");
		Banca adaptareNume=new Banca(bank);
		adaptareNume.afiseazaNume();
		System.out.println();
		
		//Apel Facade 
		Facade.aprobareCerere(888888);
		System.out.println();
		
		//Apel Composite
		Echipa e1=new Echipa();
		Angajat a1=new Angajat("Vasilescu Dan");
		Angajat a2=new Angajat("Ionescu Andrei");
		Angajat a3=new Angajat("Badea Ion");
		Angajat a4=new Angajat("Georgescu Catalin");
		e1.addChild(a1);
		e1.addChild(a2);
		e1.addChild(a3);
		e1.addChild(a4);
		e1.descriere();
		
		Echipa e2=new Echipa();
		Angajat a5=new Angajat("Popescu Gheorghe");
		Angajat a6=new Angajat("Dinescu Ion");
		e2.addChild(a5);
		e2.addChild(a6);
		e2.descriere();
		
		e1.addChild(e2);
		e1.descriere();
		System.out.println();
		
		//Apel Chain of Responsability
		AprobareOperatiune aprobareAgent= new AprobaAgent();
		AprobareOperatiune aprobareManager= new AprobaManager();
		AprobareOperatiune aprobareCEO= new AprobaCEO();
		
		aprobareAgent.setSuccesor(aprobareManager);
		aprobareManager.setSuccesor(aprobareCEO);
		
		aprobareAgent.aprobare(888);
		aprobareAgent.aprobare(99999);
		System.out.println();
		
		//Apel Observer
		Client client1= new Client("Vasilescu Dan");
		Client client2= new Client("Ionescu Vasile");
		Client client3= new Client("Popescu Ion");
		Credit credit1= new Credit("RO443");
		credit1.addObserver(client1);
		credit1.addObserver(client2);
		credit1.addObserver(client3);
		credit1.plataRata(678.67);
		credit1.modificareDobanda(8.60);
		System.out.println();

	}
}
