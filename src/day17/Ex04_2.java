package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04_2 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		ArrayList<stInfo> arr=new ArrayList<stInfo>();
		ArrayList<String> str =new ArrayList<String>();
		String name;
		int age;
		
		while(true) {
			System.out.println("1.등록 2.확인");
			int num=input.nextInt();
			switch(num) {
			case 1: 
				stInfo s= new stInfo();
				System.out.println("이름 입력");
				name =input.next();
				System.out.println("나이 입력");
				age=input.nextInt();
				s.setAge(age); s.setName(name);
				
				arr.add(s);
				System.out.println("등록 되었습니다");
				break;
			case 2:
				for (int i=0;i<arr.size();i++) {
					stInfo ss=arr.get(i);
					System.out.println("이름 : "+ss.getName());
					System.out.println("나이 : "+ss.getAge());
					System.out.println("--------------------");
				}
				break;
			}
		}
	}
}







