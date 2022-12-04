package custom.exception;
import java.util.ArrayList;

public class ManagerialPositionApplyException extends Exception{

	ArrayList<String> rejectionReasons;	

	public ManagerialPositionApplyException() {
	
			rejectionReasons = new ArrayList<>();
	}
	
	public void addRejectionReason(String rejectionReason) {
		
		rejectionReasons.add(rejectionReason);
	}
	
	public ArrayList<String> getRejectionReasons(){
		return rejectionReasons;
	}
	
	public int getRejectionReasonsCount() {
		
		return rejectionReasons.size();
	}
}
