
public class FunctionOverridingDemo {

	public static void main(String[] args) {
		
		IDE ide = new IDE();
		ide.launch();
		
		Eclipse eclipse = new Eclipse();
		eclipse.launch();
	}
}


class IDE{
	
	void launch() {
		System.out.println("IDE is launching");
	}
}

class Eclipse extends IDE{
	
	@Override
	void launch() {
		System.out.println("Eclipse is checking for workspace. Loading all the projects,"
				+ "finally launching");
	}
}
