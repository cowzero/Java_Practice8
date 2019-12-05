class HW8_2{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member("홍길동", 20);		
		System.out.println("이 동호회의 멤버 수는 "+Member.getNumOfMember()+"명 입니다.");
	}
}

class Member{
	private String name; 
	private int age;
	private static int numOfMember;//멤버수는 static으로!
	
	public static int getNumOfMember(){
		return numOfMember;
	}
	
	Member(){//멤버 생성하면 멤버 수 증가
		numOfMember++;
	}
	
	Member(String name, int age){
		this();//멤버 수 증가
		this.name = name;
		this.age = age;
	}
}