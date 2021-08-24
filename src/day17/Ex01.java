package day17;

class Print{
	public void test(double n1, double n2) {
		System.out.println(n1+","+n2);
	}
	public void test(String n1, String n2) {
		System.out.println(n1+","+n2);
	}
	public void test (int n1, int n2) {
		System.out.println(n1+","+n2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Print num=new Print();
		num.test(1.11, 2.222);
		num.test(1, 2);
		num.test("간건", "데에레");
		
	}
}
