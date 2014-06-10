package com.noradltd.cucumberjvm.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.base.Joiner;

public class StringReverser {

	private static final String SPACE = " ";
	
	public String reverse(String input) {
		String output = input;
		if (containsSpace(input) ) {
			List<String> wordsList = Arrays.asList(input.split(" "));
			Collections.reverse(wordsList);
			output = Joiner.on(" ").join(wordsList);
		}
		return output;
	}

	private boolean containsSpace(String input) {
		return input != null && input.indexOf(SPACE) > -1;
	}
	
}
