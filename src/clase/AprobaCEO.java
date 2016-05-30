package clase;

public class AprobaCEO extends AprobareOperatiune{

	@Override
	public void aprobare(int valoareOperatiune) {
		// TODO Auto-generated method stub
		if (valoareOperatiune>=100000) 
			System.out.println("Valoare mare operatiune: aproba CEO!");
		else
			succesor.aprobare(valoareOperatiune);
	}

}
