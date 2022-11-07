
public class Window {

	String title;
	int height;
	int width;
	
	void display() {
		
		System.out.println("Title " + title);
		
		
		System.out.println("Height / Width " + height + "/" + width);
	}
	
	
	public static void main(String[] args) {
		
		Window webDesktopTraining 
			= new Window();
		webDesktopTraining.title = "Java SQL Trainning Environment";
		webDesktopTraining.height = 100;
		webDesktopTraining.width = 100;
		
		webDesktopTraining = null;
		
		webDesktopTraining.display();
	}
}
