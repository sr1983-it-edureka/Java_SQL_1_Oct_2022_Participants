import java.io.Serializable;

public class Project implements Serializable {
	
	String name;
	boolean opened;
	
	
	transient float budget;
	
	public Project(String name, boolean opened, float budget) {
		
		this.name = name;
		this.opened = opened;
		this.budget = budget;
	}
	
	public void display() {
		
		System.out.println("Budget -> " + budget);
		String openOrCloseMessage = "";
		if (opened == true) {
			openOrCloseMessage = "opened";
		}else {
			openOrCloseMessage = "closed";
		}
		
		System.out.println(String.format(
			"Project %s can be %s", name, openOrCloseMessage));
		System.out.println();
	}
}