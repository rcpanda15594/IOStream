package Serization.BankAcc.Page287;

import java.io.Serializable;

public class BankAccount implements Serializable {

static double minBalance=5000;

private long accNo;
private String accHName;
private String username;
private transient String password;	
private transient double balance;

public long getAccNo() {
	return accNo;
}
public void setAccNo(long accNo) {
	this.accNo = accNo;
}
public String getAccHName() {
	return accHName;
}
public void setAccHName(String accHName) {
	this.accHName = accHName;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}	

public String toString() {
	return "accNo:"+accNo+"\n"+"accHName:"+accHName+"\n"+"username:"
+username+"\n"+"password:"+password+"\n"+"balance:"+balance+"\n"+"minBalance:"+minBalance;
}

}//class
