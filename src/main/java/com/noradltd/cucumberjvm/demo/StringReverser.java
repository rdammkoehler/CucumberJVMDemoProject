package com.noradltd.cucumberjvm.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.base.Joiner;

public class StringReverser {

	private static final String SLASH_SLASH = "\\";
	private static final String SPACE = " ";
	private static final String BACKSPACE = "\\b";
	private static final String FORM_FEED = "\\f";
	private static final String VERTICAL_TAB = "\\v";
	private static final String CARRAIGE_RETURN = "\\r";
	private static final String NEW_LINE = "\\n";
	private static final String TAB = "\\t";
	private static final String[] WHITE_SPACE = { SPACE, BACKSPACE, FORM_FEED, VERTICAL_TAB, CARRAIGE_RETURN, NEW_LINE,
			TAB };

	public String reverse(String input) {
		String output = input;
		String whitespace = SPACE;
		if (null != input && null != (whitespace = containsWhiteSpace(input))) {
			List<String> words = Arrays.asList(input.split(escapeRegEx(whitespace)));
			Collections.reverse(words);
			output = Joiner.on(whitespace).join(words);
		}
		return output;
	}

	private String escapeRegEx(String whitespace) {
		return (whitespace.startsWith(SLASH_SLASH)) ? SLASH_SLASH + whitespace : whitespace;
	}

	private String containsWhiteSpace(String input) {
		String rval = null;
		for (String whitespace : WHITE_SPACE) {
			if (input.contains(whitespace)) {
				rval = whitespace;
			}
		}
		return rval;
	}

}
