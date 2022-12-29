package prob2;

import java.util.ArrayList;

public class UtilityFunctions {

	public static ArrayList<String> filterStrings(ArrayList<String> arrayToFilter, Filterator f) {

//		// Original code, has been tested to work with long string
//		ArrayList<String> result = new ArrayList<>();
//		for (String str : arrayToFilter) {
//			if (f.accept(str)) {
//				result.add(str);
//			}
//		}
//		return result;

		// This is code for short string filter and lambda, 
		// ShortStringsFilter Class is meant to verify that the outputs are the same.
		ArrayList<String> result = new ArrayList<>();
		Filterator shortStringsOnly = (first) -> first.length() < 6;
		for (String str : arrayToFilter) {
			if (shortStringsOnly.accept(str)) {
				result.add(str);
			}
		}
		return result;

	}

	public static void main(String[] args) {
		// for testing
		ArrayList<String> myArray = new ArrayList<>();
		myArray.add("Abc");
		myArray.add("anesthesiologist");
		myArray.add("cobra");
		myArray.add("arxiv");
		myArray.add("Rationalization");

		// Long String filter was used here
		ArrayList<String> arrWithFirstA = filterStrings(myArray, new LongStringsFilter());
		for (String str : arrWithFirstA) {
			System.out.println(str);
		}
	}
}