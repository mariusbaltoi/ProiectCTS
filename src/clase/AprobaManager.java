package clase;

public class AprobaManager extends AprobareOperatiune{

	@Override
	public void aprobare(int valoareOperatiune) {
		// TODO Auto-generated method stub
		if (valoareOperatiune>=1000 && valoareOperatiune<100000) 
			System.out.println("Valoare medie operatiune: aproba managerul!");
		else
			succesor.aprobare(valoareOperatiune);
	}

}
