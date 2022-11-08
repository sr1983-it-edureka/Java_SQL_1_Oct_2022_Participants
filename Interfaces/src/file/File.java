package file;

// ParentInterface
public interface File {

	String read();
	
	void copy(String toWhichLocation);
	
	void delete();
}
