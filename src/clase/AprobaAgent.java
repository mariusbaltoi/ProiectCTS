package clase;

public class AprobaAgent extends AprobareOperatiune{

	@Override
	public void aprobare(int valoareOperatiune) {
		// TODO Auto-generated method stub
		if (valoareOperatiune<1000) 
			System.out.println("Valoare mica operatiune: aproba agentul bancar!");
		else
			succesor.aprobare(valoareOperatiune);
	}
}

