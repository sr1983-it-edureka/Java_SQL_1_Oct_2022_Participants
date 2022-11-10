
public class ToStringDemo {

	public static void main(String[] args) {
		
		Window explorer = new Window("Explorer");
		Window commandPrompt = new Window("Command Prompt");
		Window notepad = new Window("Notepad");
		
		System.out.println(explorer); 
		System.out.println(commandPrompt);
		System.out.println(notepad);
		
		int a = 10;
		float f = 1.23F;
		
		System.out.println(a);
		System.out.println(f);
	}
}

class Window {
	
	String name;
	
	public Window(String name) {
		this.name = name;
	}
	
	public String toString() {
		return String.format("%s [%s]", "Window", name);
	}
}
