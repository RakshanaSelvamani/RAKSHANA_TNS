package nonaccessmodifiers;

class FinalDemo {
	
	final int Var = 100;
	protected int Max;
	
	void display() {
		System.out.println("show the value of max: "+Max);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
		fd.Max = 100;

	}

}

class Child extends FinalDemo{
	void display() {
		System.out.println("show the value of max: "+Max);
	}
}
