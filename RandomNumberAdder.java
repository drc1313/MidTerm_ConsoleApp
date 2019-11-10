package console_app;
import java.util.Random;

public class RandomNumberAdder {

	private int[] numbers = null;

	RandomNumberAdder(){
		numberGen();
	}
	
	public void numberGen() {
		Random r = new Random();
		int[] intArr=new int[10];
		for(int i=0;i!=10;i++) {
			intArr[i]=r.nextInt(100);
		}
		numbers = intArr;
	}
	
	public int adder(int[] arr) {
		int sum = 0;
		for(int i=0;i!=10;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public String toString() {
		String output="";
		for(int i:numbers) {
			output+="+"+i;
		}
		return output+"="+adder(numbers);
		
	}
	
	public int[] getNumbers() {
		return numbers;
	}

	
	
}
