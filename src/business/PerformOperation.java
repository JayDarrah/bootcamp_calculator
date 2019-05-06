package business;

public class PerformOperation {
	private int x;
	private int y;
	private String o;
	private int answer = 0;

	
//		After user selects you'll need logic such as
//		§ If (userEntry.equals("+"))     {  // do addition logic  }
//		§ Else if (userEntry.equals("-"))  {  //do subtraction logic }
//		§ Etc.


	public static int doTheMath(int x,int y,String o) {
		int answer = 0;
		if (o.equals("+")) {
			answer=x+y;
		} else if (o.equals("-")) {
			answer=x-y;
		} else if (o.equals("*")) {
			answer=x*y;
		} else if (o.equals("/")) {
			answer=x/y;
		} else if (o.equals("%")) {
			answer=x%y;
		} else {
			System.out.println("Something went wrong. You may have selected an invalid operator.");
		}
		return answer;
	}
	
	
	PerformOperation() {
		super();
	}

	PerformOperation (int x, int y, String o, int answer) {

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getO() {
		return o;
	}

	public void setO(String o) {
		this.o = o;
	}

	public int getAnswer() {
		return answer;
	}


	@Override
	public String toString() {
		return "PerformOperation [x=" + x + ", y=" + y + ", o=" + o + ", answer=" + answer + "]";
	}
	
	
}
