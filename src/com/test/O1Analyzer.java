package com.test;

public class O1Analyzer {
	public static void main(String[] args) {
		String list[] = {"One","Two","Three","Four","Five","Six","Seven"};
		String searchStr = "o";
		Analyzer ob = new Analyzer();
		searchString(list,searchStr,ob);
	}

	private static void searchString(String[] list, String searchStr, StringAnalyzer ob) {
		for(String S: list) {
			System.out.println("Matched: "+ob.analyze(S, searchStr));
		}	
	}
}
