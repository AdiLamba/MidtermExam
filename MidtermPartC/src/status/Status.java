/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

//import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */

enum UserStatus {
	ZERO(0), 
	ONE(1), 
	TWO(2), 
	THREE(3);
	
	int number;
	
	UserStatus(int number) {
		this.number = number;
	}
}

public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    	
    UserStatus status1 = UserStatus.TWO;	
    
    StausUser.statusDetail(status1);
    	
    	
    /*Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (zero,one,two,three) in string");
    String code = in.next();
    StausUser t= new StausUser();
    t.statusDetail(code); 
    */
    	
  
    }

	
    
    }
    

