package clase;

import interfete.IBank;

public class Bank{
	
	private String name;

	public Bank(String name) {
		super();
		this.name = name;
	}
	
	public void showName() {
		System.out.println("The name of bank is "+name);
	}
	
	

}
