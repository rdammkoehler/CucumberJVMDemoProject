package com.noradltd.cucumberjvm.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class StringReverser {

	private static final String SLASH_SLASH = "\\";
	private static final String SPACE = " ";
	private static final String BACKSPACE = "\b";
	private static final String FORM_FEED = "\f";
	private static final String CARRAIGE_RETURN = "\r";
	private static final String NEW_LINE = "\n";
	private static final String TAB = "\t";
	private static final String[] WHITE_SPACE = { SPACE, BACKSPACE, FORM_FEED, CARRAIGE_RETURN, NEW_LINE, TAB };
	private static final String ALL_WS_REGEX = "( |\\b|\\f|\\r|\\n|\\t)";

	public String reverse(String input) {
		String output = input;
		List<String> whitespaces = new ArrayList<String>();
		if (null != input && !(whitespaces = whiteSpaces(input)).isEmpty()) {
			List<String> words = Arrays.asList(input.split(ALL_WS_REGEX));
			Collections.reverse(words);
			output = reInsertWhitespaces(whitespaces, words);
		}
		return output;
	}

	private String reInsertWhitespaces(List<String> whitespaces, List<String> words) {
		StringBuilder sb = new StringBuilder();
		Iterator<String> whitespacesItr = whitespaces.iterator();
		String whitespace = whitespacesItr.next();
		for (String word : words) {
			if (!whitespaces.contains(word) && !(word.isEmpty())) {
				sb.append(word).append(escapeRegEx(whitespace));
				if (whitespacesItr.hasNext()) {
					whitespace = whitespacesItr.next();
				}
			}
		}
		return trimTrailingSeperator(sb, whitespace);
	}

	private String trimTrailingSeperator(StringBuilder sb, String whitespace) {
		int lIdx = sb.lastIndexOf(escapeRegEx(whitespace));
		return sb.delete(lIdx, lIdx + whitespace.length()).toString();
	}

	private String escapeRegEx(String whitespace) {
		return (whitespace.startsWith(SLASH_SLASH)) ? SLASH_SLASH + whitespace : whitespace;
	}

	private List<String> whiteSpaces(String input) {
		String[] rval = new String[input.length()];
		for (String whitespace : WHITE_SPACE) {
			if (input.contains(whitespace)) {
				rval[input.indexOf(whitespace)] = whitespace;
			}
		}
		return Lists.newArrayList(Iterables.filter(Arrays.asList(rval), Predicates.notNull()));
	}

}
