package com.test;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12:05:45PM";
		System.out.println(s.substring(s.length()-2, s.length()));
		if(s.substring(s.length()-2, s.length()).equalsIgnoreCase("PM")){
			int hr = Integer.parseInt(s.substring(0,2));
			if(hr==12){
				s=s.substring(0, s.length()-2);
			}else{
				s=Integer.toString(hr+12) + s.substring(2, s.length()-2);
			}
			
			System.out.println(s);
		}
		if(s.substring(s.length()-2, s.length()).equalsIgnoreCase("AM")){
			int hr = Integer.parseInt(s.substring(0,2));
			if(hr==12){
				s=Integer.toString(0) + Integer.toString(0) + s.substring(2, s.length()-2);
			}else{
				s=s.substring(0, s.length()-2);
			}
			
			System.out.println(s);
		}

	}

}
