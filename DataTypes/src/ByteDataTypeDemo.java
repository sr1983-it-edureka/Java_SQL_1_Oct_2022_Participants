
public class ByteDataTypeDemo {

	public static void main(String[] args) {
				
		byte age = 25;

		System.out.println("Memory of byte " + Byte.SIZE);

		// Memory
		// 8 bits (1 Byte)
		
		// Range of Values
		// 2 pow (8) Values -> 256
		// [0 - 256]
		// Sign Bit - 1
		// 7 bits
		// 2 pow 7 -> 128
		// [-128] ------- [+127]
		
		System.out.println("Min Value ->" + Byte.MIN_VALUE);
		System.out.println("Max Value ->" + Byte.MAX_VALUE);
		
	}
}
