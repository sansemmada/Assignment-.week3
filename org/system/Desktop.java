package org.system;

public class Desktop extends  Computer {
	
	public void desktopSize() {
		System.out.println("size is small");
		
	}

	public static void main(String[] args) {
	
		Desktop des = new Desktop ();
		des.computerModel();
		des.desktopSize();
		

	}

}
