package com.edurek.javasql1.functional.interfaces.demo1;

public class AbusiveWordsCheckerImpl implements AbusiveWordsChecker{

	
	@Override
	public boolean check(String data) {

		if (data.contains("###") || data.contains("%%%")) {
			return true;
		}else {
			return false;
		}
	}

}
