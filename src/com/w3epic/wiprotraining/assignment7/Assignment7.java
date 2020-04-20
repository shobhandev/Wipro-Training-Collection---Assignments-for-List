/*
Implement the assignment 1 using Vector
 * */

package com.w3epic.wiprotraining.assignment7;

import java.util.LinkedList;
import java.util.Scanner;

import com.w3epic.wiprotraining.assignment1.Assignment1;

public class Assignment5 {
	private LinkedList<String> list = new LinkedList<String>();
	
	public LinkedList<String> InputMonths() {
		list = new LinkedList<String>();
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
		Assignment5 asg = new Assignment5();
		asg.InputMonths();
		

	}

}
