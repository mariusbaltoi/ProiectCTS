package interfete;

public interface Persoana {
	public void descriere();
	public void addChild(Persoana persoana);
	public void removeChild(Persoana persoana);
	public Persoana getChild(int nr);
}
