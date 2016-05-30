package clase;

import enumarari.TipuriOperatiuni;
import interfete.IOperatiune;

public class OperatiuneFactory {
	
	public IOperatiune preiaOperatiune(TipuriOperatiuni operatiuni){
		
		switch(operatiuni){
		case Cont: return new Cont(324.5,"15.06.2015");
		case Depozit: return new Depozit(5.5,"25.03.2009");
		case Credit: return new Credit(7.8,"12.09.2014");
		}
		return null;
		
	}

}
