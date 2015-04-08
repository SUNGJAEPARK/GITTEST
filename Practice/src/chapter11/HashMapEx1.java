package chapter11;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args){
		
		HashMap map = new HashMap();
		
		map.put("aaa","123");
		map.put("bbb","234");
		
		Scanner s = new Scanner(System.in);

		while(true){
			
			System.out.println("id를 입력해 주세요:");
			
			String id = s.nextLine().trim();
			
			if(map.containsKey(id)){
				
				System.out.println("password를 입력하세요:");
				
				//String pw = s.nextLine().trim();
			
				while(true){
					
					String pw = s.nextLine().trim();
					
					if(!map.get(id).equals(pw)){
						
						System.out.println("pw를 다시 입력하세요..");
																
					}else{
						
						System.out.println("로그인성공");
						
						break;
					}
				}
			}//if
		}//while
	}
	
}
