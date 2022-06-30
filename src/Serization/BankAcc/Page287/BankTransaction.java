package Serization.BankAcc.Page287;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.SortingFocusTraversalPolicy;

public class BankTransaction {
public static void main(String[]args) throws Exception{ 
	
	//create bank account
	BankAccount acc1=new BankAccount();
	
	acc1.setAccNo(1);
	acc1.setAccHName("Hari");
	acc1.setUsername("HariKrishna");
	acc1.setPassword("NIT");
	acc1.setBalance(100000);
	
	System.out.println(acc1);
	
	//creating OOS object
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("BankAccInfo.ser"));
	
	//writing bank object state to file
	oos.writeObject(acc1);

	System.out.println("Object written to file");
	
  }//main
}//class
