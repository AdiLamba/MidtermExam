/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * 
 * @author srinivsi
 */
public class StausUser {
	public static void statusDetail(UserStatus status1)
{
switch(status1)
        {
        case ZERO: System.out.println("REJECTED");
        System.out.println("This is status number: " + status1.number);
        break;
        case ONE: System.out.println("PENDING");
        System.out.println("This is status number: " + status1.number);
        break;
        case TWO:
        System.out.println("PROCESSING");
        System.out.println("This is status number: " + status1.number);
        break;
        case THREE: 
            System.out.println("APPROVED");
            System.out.println("This is status number: " + status1.number);
        break;
        
        }
}
}
