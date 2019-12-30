package com.hackerRankProblems;

import java.util.*;

class student implements Comparable<student> {
	int ID;
	String name;
	Double CGPA;

	student(int ID, String name,Double CGPA) {
		this.ID = ID;
		this.name = name;
		this.CGPA=CGPA;
	}

	public String toString() {
		return name + ":" + CGPA ;
	}

	@Override
public int compareTo(student o) {
  if(this.CGPA!=o.CGPA) 
	    return this.CGPA.compareTo(o.CGPA) ;
	else if(!(this.name.equalsIgnoreCase(o.name)))
		return this.name.compareTo(o.name);
	else
		return this.ID-o.ID;
}
}
public class probSort {
	public static void main(String[] args) {
		ArrayList<student> tr = new ArrayList<student>();
		tr.add(new student(10, "divya",45.23));
		tr.add(new student(20, "anu",45.23));
		tr.add(new student(15, "sunitha",98.63));
		tr.add(new student(30, "bavana",68.58));
		Collections.sort(tr);
		for(int i=0;i<tr.size();i++) {
			System.out.println(tr.get(i));
		}
	}
}