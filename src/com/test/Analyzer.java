package com.test;

public class Analyzer implements StringAnalyzer{

	@Override
	public boolean analyze(String S, String target) {
		return S.contains(target);
	}
	
}
