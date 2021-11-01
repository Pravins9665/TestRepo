package systemclass;

class Demo {

	String name = "hello";

	void length() {
		System.out.println("I am a method of system4 class, " + name);
	}

}

public class System4 {

	static Demo name = new Demo();

	public static void main(String[] args) {

		System4.name.length();

	}

}
