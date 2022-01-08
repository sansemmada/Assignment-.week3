package org.college;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println(id + "is not available");
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id +"name is 5" + name);
	}
	public void getStudentInfo(String mail,int ph ) {
		System.out.println("Mail is " + mail);
		System.out.println("No is " + ph);
	}
	

	public static void main(String[] args) {
		
		Students san = new Students();
		san.getStudentInfo(55);
		
		san.getStudentInfo("sanvijaya", 556677);
		
		san.getStudentInfo(55, "sandy");
		
	}

}
