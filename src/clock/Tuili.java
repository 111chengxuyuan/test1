package clock;

class  Connective{
	public boolean and (String a,String b) {
		if(a.equals("T") && b.equals("T")) {
			return true;
		}
		else return false;
	}
	public boolean or (String a,String b) {
		if(a.equals("F") && b.equals("F")) {
			return false;
		}else return true;
	}
	
}


public class Tuili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
