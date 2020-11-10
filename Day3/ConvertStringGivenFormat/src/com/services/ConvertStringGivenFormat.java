package com.services;

public class ConvertStringGivenFormat {
	public String stringReverse(String word) {
		StringBuffer sb = new StringBuffer(word);
		StringBuffer sb2 = new StringBuffer();
		String s2 = sb.reverse().toString();
		for (int i = 0; i < s2.length(); i++) {
			sb2.append(s2.charAt(i));
			sb2.append("-");
		}
		sb2.deleteCharAt(sb2.length() - 1);
		//System.out.println(sb2.toString());
		return sb2.toString();
	}

}
