package com.Number;

public class Reverse {
	int num = 121;
	int reverse = 0;
	public void reverse() {
		int temp = num;
		while(num != 0) {
			int remainder = num %10;
			reverse = reverse * 10  + remainder;
			num = num / 10;
			
		}
		System.out.println(reverse);
		
		if(reverse == temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.reverse();
	}
}
