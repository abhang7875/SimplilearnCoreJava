package com.test;

public class O3Analyzer {
	public static void main(String[] args) {
		String list[] = {"One","Two","Three","Four","Five","Six","Seven"};
		String searchStr = "o";
		searchString(list,searchStr,(String S,String target)->S.contains(target));
	}

	private static void searchString(String[] list, String searchStr, StringAnalyzer ob) {
		for(String S: list) {
			System.out.println("Matched: "+ob.analyze(S, searchStr));
		}	
	}
}
