package org.computer;

public class Desktop extends Computer {
	private void computerType() {
		System.out.println("Computer Type: Desktop");
	}
	public static void main(String[]args) {
		Desktop d=new Desktop();
		d.computerType();
		d.computerModel();
	}
	

}
