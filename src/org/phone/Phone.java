package org.phone;

public class Phone {

	public void phoneInfo() {
		System.out.println("Phone name is Nokia");
	}
	public void phoneInfo(String modelname, int cost) {
		System.out.println("phone model name is "+ modelname+"\n"+"phone cost is "+ cost);
	}

	public void phoneInfo(int ramSize, String processor) {
		System.out.println("Phone ramSize is "+ ramSize+"\n"+"Phone processor is "+ processor);
		System.out.println("ggggggggggggggg");
	}
	public static void main(String[] args) {
		Phone p = new Phone ();
		p.phoneInfo("sumsung", 15000);
		p.phoneInfo(32, "2.5ghz");
	}
}