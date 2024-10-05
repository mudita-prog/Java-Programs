package Assignments_AB_43;

import java.util.Date;

public class Assignment_39_PastTime {

	public static void main(String[] args) {
		Date d1=new Date();
		//System.out.println(d1.getTime());
		//epoch converter
		Date d2=new Date(d1.getTime() -(1000*60*60*24*3));
		System.out.println(d2);

	}

}
