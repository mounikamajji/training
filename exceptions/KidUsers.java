package com.cg.corejava.exceptions;

public class KidUsers implements LibraryUser {
	int age1,age2;
	String bookType;
	public void registerAccount(){
		if (age1<12){
			System.out.println("�You have successfully registered under a Kids Account� ");
		}else {
			System.out.println("�Sorry, Age must be less than 12 to register as a kid� ");
		}
		if (age2<12){
			System.out.println("�You have successfully registered under a Kids Account� ");
		}else {
			System.out.println("�Sorry, Age must be less than 12 to register as a kid� ");
		}
	}
	public void requestBook(){
		if(bookType.equals("Kids")){
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}else{
			System.out.println("Oops, you are allowed to take only kids books");
		}

}
}