package day17;

class Print02<T>{
	public void test(T n1,T n2) {
		System.out.println(n1+","+n2);
		System.out.println();
	}
}
//재네릭 클래스 변수

public class Ex02 {
	public static void main(String[] args) {
		Print02<Double> dou=new Print02<Double>();
		dou.test(1.11, 2.222);
		Print02<String> str =new Print02<String>();
		str.test("aa", "bb");
		Print02<Integer> in= new Print02<Integer>();
		in.test(10, 20);
	}
}
