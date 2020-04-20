/*
Implement the assignment 1 using Vector
 * */

package com.w3epic.wiprotraining.assignment7;

import java.util.Vector;
import java.util.Scanner;

import com.w3epic.wiprotraining.assignment1.Assignment1;

public class Assignment1 {
	private ArrayList<String> list = new ArrayList<String>();
	
	public ArrayList<String> InputMonths() {
		list = new ArrayList<String>();
		Scanner sc=new Scanner();
		for (int i = 0; i < 12; i++) {
			String month=sc.nextLine();
                        list.add(month);
		}

		for (String item : list) {
			System.out.println(item);
		}
		
	}

	public static void main(String[] args) {
		Assignment6 asg = new Assignment6();
		asg.InputMonths();
		

	}

}
