package Serization.BankAcc.Page287;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BankUser {

	public static void main(String[] args)throws Exception {
		
//creating OIS Object
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("BankAccInfo.ser"));
		
//casting returned object to bank type
		BankAccount accDetails=(BankAccount)ois.readObject();

//printing bank object data
		System.out.println(accDetails.getAccHName()+"details");
		System.out.println(accDetails);
	}//main

}//class
