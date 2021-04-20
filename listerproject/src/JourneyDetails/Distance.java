package JourneyDetails;

public class Distance {
	public double Distance(String start,String end) {
		int kms=0;
        switch(start) {
        case "abc":
        	if (end.equals("bcd")) {
        		return kms = 100;
        	}
        	else if(end.equals("cde")) {
        		return kms=200;
        		
        	}
        	else {
        		System.out.print("Invalid");
        		break;
        	}
        case "bcd":
        	if (end.equals("abc")) {
        		return kms = 100;
        		
        	}
        	else if(end.equals("cde")) {
        		return kms=100;
        	
        	}
        	else {
        		System.out.print("Invalid");
        		break;
        	}
        case "cde":
        	if (end.equals("abc")) {
        		return kms = 200;
        		
        	}
        	else if(end.equals("bcd")) {
        		return kms=100;
        	}
        	else {
        		System.out.print("Invalid");
        		break;
        	}
        }
		return kms;
        
	}

}
