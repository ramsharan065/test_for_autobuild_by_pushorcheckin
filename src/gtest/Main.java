package gtest;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("hello");
		Integer s = (Integer)l.get(0);
		System.out.println(s);
		
		List<String> li = new ArrayList<String>();
		li.add("kiran");
		String st = li.get(0);
		System.out.println(st);
	}
}
