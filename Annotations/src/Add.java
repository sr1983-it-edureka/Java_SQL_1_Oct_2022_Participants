
@Deprecated
public class Add {

	//Instead of using doAdd(), use the method add().
	
	@Deprecated(forRemoval = true)
	int doAdd(int a, int b) {
		return a+b;
	}
	
	@Deprecated(forRemoval = true)
	int doAdd(int a, int b, int c) {
		return a + b + c;
	}


	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a + b + c;
	}

}
