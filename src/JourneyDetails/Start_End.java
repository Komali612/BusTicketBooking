package JourneyDetails;
public class Start_End {
	private String source;
	private String destination;
	public double kms;
	private int num_Tickets;
	public void setSource(String source) {
  		this.source=source;
  	  }
  	  public void setDestination(String destination) {
  		this.destination=destination;
  	  }
  	public String getSource() {
		return source;
	}
	public String getDestination() {
		return destination;
	}
	public void setnumT(int num_Tickets) {
	    this.num_Tickets=num_Tickets;
	}
	public int getNT() {
		return num_Tickets;
	}
	public void setKms() {
		switch(source) {
		case "abc":
			if (destination.equals("bcd")) {
				this.kms=100;
			}
			else if(destination.equals("cde")) {
				this.kms=200;
			}
			else {
				System.out.print("Invalid");
				
			}
		case "bcd":
			if (destination.equals("abc")) {
				this.kms = 100;
				
			}
			else if(destination.equals("cde")) {
				this.kms=100;
				
			}
			else {
				System.out.print("Invalid");
				break;
			}
		case "cde":
			if (destination.equals("abc")) {
				this.kms= 200;
				
			}
			else if(destination.equals("bcd")) {
				this.kms=100;
				
			}
			else {
				System.out.print("Invalid");
				break;
			}
		}
	}
	public double getKms() {
		return kms;
	}
}
