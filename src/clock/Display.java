package clock;

public class Display {
	private int value=0;
	private int limit=0;
	public Display(int limit) {
		this.limit=limit;
	}
	public void increase() {
		while(true) {
			value++;
			if(value==limit){
				value=0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
