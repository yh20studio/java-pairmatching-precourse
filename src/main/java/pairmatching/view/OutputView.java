package pairmatching.view;

import java.util.List;

import pairmatching.pair.Pair;

public class OutputView {
	private static final String PAIR_RESULT = "페어 매칭 결과입니다.";
	private static final String PAIR_DELIMITER = " : ";

	private static void printLineBreak() {
		System.out.println();
	}

	public static void printMatchingResult(List<Pair> pairs) {
		printLineBreak();
		System.out.println(PAIR_RESULT);
		for (Pair each : pairs) {
			System.out.println(String.join(PAIR_DELIMITER, each.getCrews()));
		}
		printLineBreak();
	}
}