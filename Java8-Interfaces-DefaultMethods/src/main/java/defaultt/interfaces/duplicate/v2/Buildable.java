package defaultt.interfaces.duplicate.v2;

public interface Buildable {

	void build();
	
	default String appointDelegator() {
		return "My Assistant";
	}
}
