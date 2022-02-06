package com.test;

public class O2Analyzer {
	public static void main(String[] args) {
		String list[] = {"One","Two","Three","Four","Five","Six","Seven"};
		String searchStr = "o";
		searchString(list,searchStr,new StringAnalyzer() {
			@Override
			public boolean analyze(String S, String target) {
				return S.contains(target);
			}
		});
	}

	private static void searchString(String[] list, String searchStr, StringAnalyzer ob) {
		for(String S: list) {
			System.out.println("Matched: "+ob.analyze(S, searchStr));
		}	
	}
}
