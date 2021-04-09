package JourneyDetails;
import UserDetails.User_ip;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Fare_Cal {
	  public static void main (String[] args) throws Exception
      {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      User_ip details = new User_ip();
        System.out.println("Enter your Name: ");
        String k = br.readLine();
        details.setName(k);
        System.out.println("Enter your email: ");
        String e = br.readLine();
        details.setEmail(e);
        System.out.println("Enter the password: "); 
        String pd = br.readLine();
        details.setPassword(pd);
        System.out.println("your name  is "+details.getName());
        System.out.println("Your email is "+details.getEmail());
        System.out.println("Enter the total number of seats would you like to book");
        int n=Integer.parseInt(br.readLine());
        List<Integer> seat=new ArrayList<>(10);
        System.out.println("enter your seat number total number of seats is 30");
        Integer[] totset = new Integer[]{1, 2, 3, 4, 5,6,7,8,9,10};
        List<Integer> Lists = new ArrayList<>(Arrays.asList(totset));
        System.out.println("Enter seat number between 1 to 30");
        for(int i=1;i<=n;i++){
            seat.add(Integer.parseInt(br.readLine()));
        }
        Start_End se = new Start_End();
        System.out.println("Enter the source:");
        String start = br.readLine();
        se.setSource(start);
        System.out.println("Enter the destination:");
        String end = br.readLine();
        se.setDestination(end);
        int kms=0;
        switch(start) {
        case "abc":
        	if (end.equals("bcd")) {
        		kms = 100;
        		break;
        	}
        	else if(end.equals("cde")) {
        		kms=200;
        		break;
        	}
        	else {
        		System.out.print("Invalid");
        		break;
        	}
        case "bcd":
        	if (end.equals("abc")) {
        		kms = 100;
        		break;
        	}
        	else if(end.equals("cde")) {
        		kms=100;
        		break;
        	}
        	else {
        		System.out.print("Invalid");
        		break;
        	}
        case "cde":
        	if (end.equals("abc")) {
        		kms = 200;
        		break;
        	}
        	else if(end.equals("bcd")) {
        		kms=100;
        		break;
        	}
        	else {
        		System.out.print("Invalid");
        		break;
        	}
        }
        if (kms<=0) {
        	System.out.print("Invalid");
        }
        else {
        	System.out.println(start+" to "+end+" distances is : "+kms);
        	int fair = kms*2*n;
        	System.out.println("Cost is : "+fair);
        }
        System.out.println("Enter the payment (yes/no) : ");
        String payment = br.readLine();
        if (payment.equals("yes")) {
        	System.out.println("Ticket Booked");
        }
        else {
        	System.out.println("Payment Failed");
        }
	  }
}
