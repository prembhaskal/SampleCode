package com.practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {

	public static void main(String[] args) {
		StreamPractice streamPractice = new StreamPractice();
		streamPractice.getLongestLine();
	}

	private void getLongestLine() {
		String[] list = new String[]{"stringa", "stringabbbbbaa", "stringaaaaaa"};

		List<String> stringList = Arrays.asList(list);
		String longestWord = stringList.stream().reduce((a,b) -> a.length() > b.length() ? a : b).orElse("");
		System.out.println("longest word is " + longestWord);

		stringList.stream().map(w -> w.length()).forEach(s -> System.out.println(s));
	}
}