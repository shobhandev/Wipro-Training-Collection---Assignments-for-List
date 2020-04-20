
package com.w3epic.wiprotraining.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public ArrayList<String> InputMonths() {
		list = new ArrayList<String>();
                Scanner sc=new Scanner(System.in);
		System.out.println("Enter the months");
		for (int i = 0; i <= 12; i++) {
			String month=sc.nextLine();
                        list.add(month);
		}

		for (String item : list) {
			System.out.println(item);
}


	public static void main(String[] args) {
		Assignment1 asg = new Assignment1();
		asg.InputMonths();
		

	}

}
