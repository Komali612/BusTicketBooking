package JourneyDetails;
import DAVlayer.*;
import UserDetails.User_ip;
import java.sql.*;
import UserDetails.User_Validation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Fare_Cal {
	  public static void main (String[] args) throws Exception
      {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      User_ip details = new User_ip();
      User_Validation uv = new User_Validation();
      data_extract de = new data_extract();
      Cost cc = new Cost();
      Distance d = new Distance();
      Scanner p = new Scanner (System.in);
      System.out.print("1- for userDetails  "+ "  2-  Ticket booking  ---> ");
      int ss = p.nextInt();
      switch(ss) {
      case 1 :
    	  System.out.print("Enter the Phone Number: ");
          long phN = p.nextLong();
          details.set_phoNo(phN);
          de.data_extract(phN);
          break;
      case 2 :
      {      
        System.out.print("Enter your Name: ");
        String k = br.readLine();
        details.setName(k);
        System.out.print("Enter your email: ");
        String e = br.readLine();
        details.setEmail(e);
        System.out.print("Enter the Phone Number: ");
        long ph = p.nextLong();
        details.set_phoNo(ph);
        data_insert di = new data_insert();
        di.data_insert(k, e, ph);
        double rand = (int)Math.floor(Math.random()*(9999-1111+1)+1111);
        uv.setOtp(rand);
        System.out.println(uv.getOtp());
        Scanner c = new Scanner (System.in);
        System.out.println("Enter the Otp: ");
        int check = c.nextInt();
        if (check==rand) {
        System.out.println("Enter the total number of seats would you like to book");
        int n=c.nextInt();
        List<Integer> seat=new ArrayList<>(10);
        System.out.println("enter your seat number total number of seats is 30");
        Integer[] totset = new Integer[]{1, 2, 3, 4, 5,6,7,8,9,10};
        List<Integer> Lists = new ArrayList<>(Arrays.asList(totset));
        System.out.println("Enter seat number between 1 to 30");
        for(int i=0;i<n;i++){
            seat.add(c.nextInt());
        }
        Start_End se = new Start_End();
        System.out.print("Enter the source:");
        String start = br.readLine();
        se.setSource(start);
        System.out.print("Enter the destination:");
        String end = br.readLine();
        se.setDestination(end);
        double dd = d.Distance(start, end);
        if (dd<=0) {
        	System.out.print("Invalid");
        }
        else {
        	System.out.println(start+" to "+end+" distances is : "+dd);
        	cc.Cost(n, dd);
        }
        System.out.println("Enter the payment (yes/no) : ");
        String payment = br.readLine();
        cc.payT(payment);
       }
        else {
        System.out.println("wrong otp please try again");
      }
       break; 
      }
      
	  }
      }
}