package clase;

public abstract class AprobareOperatiune {
	public AprobareOperatiune succesor;
	public abstract void aprobare(int valoareOperatiune);
	
	public void setSuccesor(AprobareOperatiune succesor) {
		this.succesor=succesor;
	}
}
