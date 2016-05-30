package clase;

public class Facade {
	public static void aprobareCerere(int valoareProiect){
		AprobareOperatiune aprobareAgent= new AprobaAgent();
		AprobareOperatiune aprobareManager= new AprobaManager();
		AprobareOperatiune aprobareCEO= new AprobaCEO();
		
		aprobareAgent.setSuccesor(aprobareManager);
		aprobareManager.setSuccesor(aprobareCEO);
		
		aprobareAgent.aprobare(valoareProiect);
	}
}
