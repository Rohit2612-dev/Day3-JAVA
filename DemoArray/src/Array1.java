
public class Array1 {

	public static void main(String[] args) {
		
		//If we don't pass values to args array an exception is generated.
		System.out.println(args[0]);
			
		int[] numbers;
		
		numbers = new int[3];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		//numbers[3] = 40; //Exceptions
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		//way-2
		float[] marks = new float[2];
		marks[0] = 99.44f;
		marks[1] = 88.33f;
		
		//way-3
		String[] subjects = {"Java", "Spring"};
//		System.out.println(subjects[0]);
//		System.out.println(subjects[1]);	
		//Basic for loop
		for(int i=0; i< subjects.length; i++) {
			System.out.println(subjects[i]);
		}
			
		//Enhanced for loop OR for-in loop(added in jdk 5)
			
		for(String s : subjects) {
			System.out.println(s);
		}
	}
}
