package submit;

import data.Member;

public class CreateMember {

	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		
		System.out.println(user1.name +' '+ user1.id);
		
		Member user2 = new Member();
		
		Member user3 = new Member("천예지", "user1000", "1234", 30);
		
		System.out.println(user3.name +' '+ user3.id  +' '+ user3.password  +' '+  user3.age);
		
//		System.out.println(m2.toString());
		
	}

}
