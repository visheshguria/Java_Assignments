package com.Q3;

public class CheckVowel {
	void isVowel(char c) {
		String small= "bcdfghjklmnpqrstvwxyz";
		String capital="BCDFGHJKLMNPQRSTVWXYZ";

		if(c=='a' ||  c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
			System.out.println("Character is Vowel");
		}else {
			int count=0;
			for(int i=0;i<small.length();i++) {
				char x=small.charAt(i);
				char y=capital.charAt(i);
				if(c==x || c==y) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("Invalid Character");
			}else {
				System.out.println("Character is Consonant");
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckVowel obj=new CheckVowel();
		obj.isVowel('A');
		obj.isVowel('z');
		obj.isVowel('*');

	}

}
