package com.services;

public class RunRate {
	public int usingBufferReader(int r,int o)throws Exception {
		int runrate;
		runrate=r/o;
		if(o==0) {
			throw new Exception("NumberFormatexception");
		}
		
		return runrate;
		
	}

}
