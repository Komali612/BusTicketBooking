package JourneyDetails;

public class Cost {
      public void Cost(int n,double kms) {
	    double fair = kms*2*n;
	    System.out.println("Cost is : "+fair);
      }
      public void payT(String payment) {
    	  if (payment.equals("yes")) {
          	System.out.println("Ticket Booked");
          }
          else {
          	System.out.println("Payment Failed");
          }
      }
}
