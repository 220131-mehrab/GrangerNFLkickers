package com.github.grangercarty.kicker;

public class App {

	public static void main(String[] args) {
		String filename = args[0];
		int headerSize = Integer.parseInt(args[1]);
		KickerList kickerlist =  new KickerList(filename, headerSize);
		kickerlist.printNames();
	}
}
